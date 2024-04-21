class Solution {
    public long minOperations(int[] nums1, int[] nums2, int k) {
        
        long add = 0, sub = 0;
        for(int i = 0; i<nums1.length; i++){
            int num = nums1[i];
            int target = nums2[i];
            if(k==0 && num!=target)return -1;
            if(num>target){
                if((num-target)%k==0)sub += (num-target)/k;
                else {
                    return -1;
                }
            }
            else if(num<target){
                if((target-num)%k==0)add += (target-num)/k;
                else {
                    return -1;
                }
        System.out.println(add);
                
            }
        }
        return add==sub?add:-1;
    }
}