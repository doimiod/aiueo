class Solution {
    public int findValueOfPartition(int[] nums) {
        Arrays.sort(nums);
        if(nums.length==2) return nums[1] - nums[0];
        int min = 1000000000;
        for(int i = 1; i<nums.length; i++){
            if(nums[i] - nums[i-1] < min)min = nums[i] - nums[i-1];
        }
        return min;
    }
}