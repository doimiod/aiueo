class Solution {
    public long maxScore(int[] nums, int x) {
        int n = nums.length;
        long[][] dp = new long[2][n];
        for(int i = 0;i < 2;i++){
            Arrays.fill(dp[i], Long.MIN_VALUE / 10);
        }
        dp[nums[0]%2][0] = nums[0];
        for(int i = 1;i < n;i++){
            dp[nums[i]%2][i] = Math.max(dp[nums[i]%2][i-1] + nums[i], dp[nums[i]%2^1][i-1] + nums[i] - x);
            dp[0][i] = Math.max(dp[0][i], dp[0][i-1]);
            dp[1][i] = Math.max(dp[1][i], dp[1][i-1]);
        }
        return Math.max(dp[0][n-1], dp[1][n-1]);
    }
}