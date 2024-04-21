class Solution {
    public int minMeetingRooms(int[][] intervals) {
        Map<Integer, Integer> map = new TreeMap<>();
        for(int i = 0; i<intervals.length; i++){
            int num1 = intervals[i][0];
            int num2 = intervals[i][1];
            map.put(num1, map.getOrDefault(num1,0)+1);
            map.put(num2, map.getOrDefault(num2,0)-1);
        }
        int ans = 0;
        int curr = 0;
        for(int n: map.values()){
            curr+=n;
            ans=Math.max(ans, curr);
        }
        return ans;
    }
}