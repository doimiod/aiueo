class Solution {
    public int maxNonDecreasingLength(int[] nums1, int[] nums2) {
        int[] dp1 = new int[nums1.length];
        int[] dp2 = new int[nums1.length];
        Arrays.fill(dp1, 1);
        Arrays.fill(dp2, 1);
        int ans = 1;
        for(int i = 1; i<nums1.length; i++){
            if(nums1[i-1] <= nums1[i])dp1[i] = Math.max(dp1[i], dp1[i-1]+1);
            if(nums1[i-1] <= nums2[i])dp2[i] = Math.max(dp2[i], dp1[i-1]+1);
            if(nums2[i-1] <= nums2[i])dp2[i] = Math.max(dp2[i], dp2[i-1]+1);
            if(nums2[i-1] <= nums1[i])dp1[i] = Math.max(dp1[i], dp2[i-1]+1);
            ans = Math.max(ans, Math.max(dp1[i],dp2[i]));
        }
        return ans;
    }
}