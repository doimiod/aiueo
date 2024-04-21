class Solution {
    public int singleNumber(int[] nums) {
        // int ans = 0;
        // for(int i = 0; i<nums.length; i++){
        //     ans = ans ^ nums[i];
        // }
        // return ans;

        // HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        // for(int i = 0; i<nums.length; i++){
        //     map.put(nums[i], map.getOrDefault(nums[i],0)+1);
        // }
        // for(int num: nums){
        //     if(map.get(num) == 1) return num;
        // }
        // return 0;

        // Arrays.sort(nums);
        // for(int i = 0; i<nums.length-1; i+=2){
        //     if(nums[i] != nums[i+1])return nums[i];
        // }
        // if(nums.length%2==1)return nums[nums.length-1];
        // return 0;
    }
}