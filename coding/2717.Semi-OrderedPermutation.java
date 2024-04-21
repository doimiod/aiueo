class Solution {
    public int semiOrderedPermutation(int[] nums) {
        if(nums.length==1)return 0;
        if(nums[0] == 1 && nums[nums.length-1] == nums.length)return 0;
        int pos1 = 0;
        int pos2 = 0;
        for(int i = 0; i<nums.length;i++){
            if(nums[i] == 1)pos1=i;
            else if(nums[i] == nums.length)pos2=i;
        }
        if(pos1>pos2)return pos1+nums.length-1-pos2-1;
        return pos1+nums.length-1-pos2;
    }
}