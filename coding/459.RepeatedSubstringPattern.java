class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int n = s.length();
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                StringBuilder pattern = new StringBuilder();
                for (int j = 0; j < n / i; j++) {
                    pattern.append(s.substring(0, i));
                }
                if (s.equals(pattern.toString())) {
                    return true;
                }
            }
        }
        return false;
    }
}

class Solution {
    public boolean repeatedSubstringPattern(String s) {
        String t = s + s;
        if (t.substring(1, t.length() - 1).contains(s))
            return true;
        return false;
    }
}

class Solution {
    public boolean repeatedSubstringPattern(String s) {
        for(int i = 1; i<=s.length()/2; i++){
            String str = s.substring(0,i);
            if(s.length()%i==0){
                String st = "";
                // int rest = s.length()/i;
                for(int j = 0; j<s.length()/i; j++){
                    st += str;
                }
                // System.out.println(st);
                if(st.equals(s))return true;
            }
        }

        return false;
    }
}