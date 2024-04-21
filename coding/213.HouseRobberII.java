class Solution {
    public int rob(int[] nums) {
        int[] dp1 = new int[nums.length];
        int[] dp2 = new int[nums.length];
        if(nums.length == 1)return nums[0];
        if(nums.length == 2)return Math.max(nums[0],nums[1]);
        if(nums.length == 3)return Math.max(Math.max(nums[0],nums[1]),nums[2]);
        dp1[0] = nums[0];
        dp1[1] = nums[1];
        dp1[2] = dp1[0] + nums[2];
        
        dp2[0] = nums[1];
        dp2[1] = nums[2];
        dp2[2] = dp2[0] + nums[3];

        for(int i = 3; i<nums.length-1; i++){
            dp1[i] = Math.max(dp1[i-2] + nums[i], dp1[i-3] + nums[i]);
            dp2[i] = Math.max(dp2[i-2] + nums[i+1], dp2[i-3] + nums[i+1]);
        }
        dp1[nums.length-1] = Math.max(dp1[nums.length-2],dp1[nums.length-3]);
        dp2[nums.length-1] = Math.max(dp2[nums.length-2],dp2[nums.length-3]);
        return Math.max(dp1[nums.length-1],dp2[nums.length-1]);
    }
}