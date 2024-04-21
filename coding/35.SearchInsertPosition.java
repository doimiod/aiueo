class Solution {
    public int searchInsert(int[] nums, int target) {
        
        int left = 0;
        int right = nums.length-1;
        
        while(left<=right){

            System.out.println("left = "+left);
            System.out.println("right = "+ right);
            int mid = ((left+right)/2);
            System.out.println(mid);
            System.out.println("unko = "+ nums[mid]);
            if(nums[mid]>target){
                System.out.println("a");
                right = mid-1;
            }
            else if(nums[mid]<target){
                System.out.println("b");
                left = mid+1;
            }
            else{System.out.println("c");
                return mid;
            } 
        }
        
        return left;
    }