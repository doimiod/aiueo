class Solution {
    public int[] anagramMappings(int[] nums1, int[] nums2) {
        
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        
        for(int i = 0; i<nums1.length; i++){
            map.put(nums2[i], i);
        }
        
        int[] ans = new int[nums1.length];
        
        for(int j = 0; j<nums1.length; j++){
            ans[j] = map.get(nums1[j]);
        }
        return ans;
    }
}