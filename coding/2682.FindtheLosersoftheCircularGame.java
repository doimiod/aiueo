class Solution {
    public int[] circularGameLosers(int n, int k) {
        int a = 1;
        int p = 1;
        HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();
        boolean finished = false;
        while(!finished){
            while(a>n)a=a-n;
            if(map.containsKey(a))finished=true;
            else map.put(a, map.getOrDefault(a,0)+1);
            a += k*p;
            p++;
        }
        int[] ans = new int[n-map.size()];
        int j = 0;
        for(int i = 1; i<n+1; i++){
            if(!map.containsKey(i)){
                ans[j] = i;
                j++;
            }
        }
        return ans;
    }
}