class Solution {
    public int matrixSum(int[][] nums) {
        int ans = 0;
        for (int[] row : nums) {
            Arrays.sort(row);
        }
        for(int i = 0; i<nums[0].length; i++){
            int max = Integer.MIN_VALUE;
            for(int j = 0; j<nums.length; j++){
                if(nums[j][i]>max)max = nums[j][i];
            }
            ans += max;
        }
        return ans;
    }
}