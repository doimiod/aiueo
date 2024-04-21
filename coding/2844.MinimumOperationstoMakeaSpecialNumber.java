class Solution {
    public int minimumOperations(String num) {
        HashMap<Character, Integer> map = new HashMap<>();
        int ans = 0;
        boolean before = false;
        for(int i = num.length()-1; i>=0; i--){
            char c = num.charAt(i);
            if(c=='0'){
                if(map.containsKey('5'))before = true;
                map.put(c, map.getOrDefault(c, 0)+1);
                if(map.get(c)==2)return ans + map.getOrDefault('5',0);
            }
            else if(c=='5'){
                if(map.containsKey(c))ans++;
                else if(map.containsKey('0'))return ans;
                else map.put(c, 1);
            }
            else if(c=='2'){
                if(!map.containsKey('5'))ans++;
                else return (before)?ans+1:ans;
            }
            else if(c=='7'){
                if(!map.containsKey('5'))ans++;
                else return (before)?ans+1:ans;
            }
            else ans++;
        }
        //    25 50 75 100
        return ans + map.getOrDefault('5',0);
    }
}

//  Must end in 25, 50, 75, 00, or delete everything except the zeroes.

class Solution {
    public int minimumOperations(String num) {
        int res = num.length();
        String[] ops = new String[]{"00", "25", "50", "75"};
        o: for (String s : ops) {
            int j = num.length() - 1;
            for (int i = 1; i >= 0; i--) {
                while (j >= 0 && num.charAt(j) != s.charAt(i)) j--;
                if (j < 0) continue o;
                j--;
            }
            j++;
            res = Math.min(res, num.length() - j - 2);
        }
        int cnt = 0;
        for (char c : num.toCharArray()) {
            if (c != '0') cnt++;
        }
        res = Math.min(res, cnt);
        return res;
    }
}

class Solution {
    int minimumOperations(String num) {
    int ans = num.length(), n = num.length();
    for (int i = n - 1; i >= 0; i--) {
        for (int j = i - 1; j >= 0; j--) {
            int t = (num.charAt(i) - '0') + (num.charAt(j) - '0') * 10;
            if (t % 25 == 0) ans = Math.min(ans, n - j - 2);
        }
        if (num.charAt(i) == '0') ans = Math.min(ans, n - 1); // To take the only '0' case
    }
    return ans;
}
}

class Solution {
    public int check(String num, int i) {
        for (int j = i - 1; j >= 0; j--) {
            int t = (num.charAt(i) - '0') + (num.charAt(j) - '0') * 10;
            if (t % 25 == 0) return num.length() - j - 2;
        }
        return num.length();
    }

    public int minimumOperations(String num) {
        int n = num.length(), ans = n, i;
        for (i = n - 1; i >= 0 && num.charAt(i) != '0'; i--);
        if (i >= 0) ans = Math.min(n - 1, check(num, i));
        for (i = n - 1; i >= 0 && num.charAt(i) != '5'; i--);
        return Math.min(ans, check(num, i));
    }
}