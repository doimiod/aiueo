class Solution {
    public int longestSubarray(int[] nums) {
        if(Arrays.stream(nums).sum()==nums.length)return nums.length-1;
        int count = 0, ans = 0, zCount = 0, j=0;
        for(int i = 0; i<nums.length; i++){
            if(nums[i]==1)count++;
            if(nums[i]==0)zCount++;
            if(zCount==2){
                while(zCount==2){
                    if(nums[j]==1)count--;
                    else zCount--;
                    j++;
                }
            }
            ans = Math.max(ans, count);
        }
        return ans;
    }
}