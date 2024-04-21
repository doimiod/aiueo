class Solution {
    public int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);
        int ans = 0, j = 0;
        long sum = 0;
        for(int i = 0; i<nums.length; i++){
            sum += nums[i];
            while(Math.abs(sum - (long)nums[i]*(i-j+1))>k){
                sum -= nums[j];
                j++;
            }
            ans = Math.max(ans, i-j+1);
        }
        return ans;
    }
}