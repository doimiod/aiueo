class Solution {
    public int maxNonOverlapping(int[] nums, int target) {
        HashSet<Integer> set = new HashSet<Integer>();
        int pre = 0, ans = 0;
        set.add(0);
        for(int n: nums){
            pre+=n;
            if(set.contains(pre-target)){
                ans++;
                set.clear();
            }
            set.add(pre);
        }
        return ans;
    }
}