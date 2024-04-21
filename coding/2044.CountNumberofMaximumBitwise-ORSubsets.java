class Solution {
    int ans = 0;
    public int countMaxOrSubsets(int[] nums) {
        int max = 0;
        for(int n: nums)max = max | n;
        backtracking(nums, 0, max, 0);
        return this.ans;
    }

    public void backtracking(int[] nums, int start, int max, int num){
        if(num==max)this.ans++;
        if(start==nums.length)return;

        for(int i = start; i<nums.length;i++){
            int n = num | nums[i];
            backtracking(nums, i+1, max, n);
        }
    }
}