class Solution {
    public int longestAlternatingSubarray(int[] nums, int threshold) {
        int curr = 0;
        int max = 0;
        int previous = 0;
        for(int i = 0; i<nums.length; i++){
            int num = nums[i];
            if(curr == 0){
                if(num%2 == 0 && num<=threshold){
                    curr++;
                }
            }
            else if((previous %2 != num % 2) && (num<=threshold)){
                curr++;
            }
            else if(num>threshold)curr=0;
            else if(previous %2 == num % 2){
                curr = 0;
                i--;
            }
            max = Math.max(max,curr);
            previous = num;
            
            System.out.println(curr);
        }
        return max;
    }
}