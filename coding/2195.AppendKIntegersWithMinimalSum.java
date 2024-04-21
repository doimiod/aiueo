class Solution {
    public long minimalKSum(int[] nums, int k) {
        Arrays.sort(nums);
        long ans = 0;
        long j = 1;
        int count = 0;
        for(int i = 0; i<nums.length; i++){
            int num = nums[i];
            while(j<num){
                ans += j;
                count++;
                j++;
                if(count==k)break;
            }
            if(count==k)break;
            j = num + 1;
        }
        
        while(count<k){
            ans+=j;
            j++;
            count++;
        }
        return ans;
    }
}
