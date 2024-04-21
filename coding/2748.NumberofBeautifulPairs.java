class Solution {
    public int countBeautifulPairs(int[] nums) {
        int ans = 0;
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i = 0; i<nums.length; i++){
            for(int j = i+1; j<nums.length; j++){
                int num1 = Integer.parseInt(Integer.toString(nums[i]).substring(0, 1));  // First digit of nums[i]
                int num2 = nums[j] % 10;  // Last digit of nums[j]
                if(gcd(num1, num2) == 1){
                    ans++;
                }
            }
        }
        return ans;
    }
    
    public static int gcd(int n, int m){
        if(m == 0)return n;
        return gcd(m, n % m);
    }
    
    
}