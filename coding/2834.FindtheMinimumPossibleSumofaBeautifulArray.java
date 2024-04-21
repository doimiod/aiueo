class Solution {
    public int minimumPossibleSum(int n, int target) {
        long ans = 0;
        int i = 1;
        for(;i<=target/2 && i<=n;i++){
            ans += i;
        System.out.println(ans);

        }
        int j = target;
        while(i<=n){
            ans += j;
            j++;
            i++;
        System.out.println(ans);

        }
        return (int)ans;
    }
}