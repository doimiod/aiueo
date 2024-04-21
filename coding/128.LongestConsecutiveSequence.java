class Solution {
    public int longestConsecutive(int[] nums) {
        int ans = 0;
        int count = 0;
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        Arrays.sort(nums);
        for(int i = 0; i<nums.length; i++){
            int num = nums[i];
            if(map.containsKey(num-1)){
                if(!map.containsKey(num))count++;
            }
            else count = 1;
            map.put(num,map.getOrDefault(num,0)+1);
            if(count>ans)ans=count;
        }
        return ans;
    }
}