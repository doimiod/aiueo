class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        // int i = 0, j = i+1, k = nums.length-1;
        Arrays.sort(nums);
        HashSet<List> set = new HashSet<>();
        ArrayList<List<Integer>> ans = new ArrayList<List<Integer>>();

        for(int i = 0; i<nums.length-2; i++){
            int j = i+1, k = nums.length-1;

            while(j<k){
                int num = nums[i] + nums[j] + nums[k];
                if(num==0){
                    ArrayList<Integer> row = new ArrayList<>();
                    row.add(nums[i]);
                    row.add(nums[j]);
                    row.add(nums[k]);
                    if(!set.contains(row))ans.add(new ArrayList<Integer>(row));
                    set.add(row);
                    j++;
                }
                else if(num<0)j++;
                else k--;
            }
        }

        return ans;
    }
}