class Solution {
    public int[] countBits(int n) {

        int[] ans = new int[n+1];

        // ans 1
        // for(int i = 0; i<n+1; i++){
        //     String binary = Integer.toBinaryString(i);
        //     binary = binary.replace("0","");
        //     ans[i] = binary.length();
        // }
        
        // ans 2
        // HashMap<Integer, Integer> map = new HashMap<Integer,Integer>();
        // for(int i = 0; i<n+1; i++){
        //     int count = 0;
        //     int num = i;
        //     while(num>0){
        //         if((num & 1) == 1) count++;
        //         num = num >> 1;
        //         if(map.containsKey(num)){
        //             System.out.println(map.get(num));
        //             count += map.get(num);
        //             break;
        //         }
        //     }
        //     ans[i] = count;
        //     map.put(i,count);
        // }

        // ans 3 brilliant
        for (int i = 1; i < n+1; i++) {
            ans[i] = ans[i & (i - 1)] + 1;
        }

        return ans;
    }
}