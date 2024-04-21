class Solution {
    public int minBitFlips(int start, int goal) {
        // if(start == goal)return 0;

        // String startB = Integer.toBinaryString(start);
        // String goalB = Integer.toBinaryString(goal);
        // int longer = Math.max(startB.length(), goalB.length());
        // int shorter = Math.min(startB.length(), goalB.length());
        // int ans = 0;
        // int diff = 0;
        // if(longer>shorter)diff = longer - shorter;
        // for(int j = 0; j<diff; j++){
        //     startB = "0" + startB;
        //     goalB = "0"  + goalB;
        // }
        // for(int i = 0; i<longer; i++){
        //     if(startB.charAt(startB.length()-1-i) != goalB.charAt(goalB.length()-1-i))ans++;
        // }
        
        // return ans;

        String xor = Integer.toBinaryString(start ^ goal);
        int ans = 0;
        for(int i=0; i<xor.length(); i++){
            if(xor.charAt(i) == '1')ans++;
        }
        return ans;  
    }
}