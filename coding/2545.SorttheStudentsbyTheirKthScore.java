class Solution {
    public int[][] sortTheStudents(int[][] score, int k) {
        Arrays.sort(score, (x,y) ->{
           return y[k] - x[k]; 
        });
        
        return score;


        //another ans
        // PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> b[0]-a[0]);
        
        // for(int i = 0; i<score.length; i++){
        //     pq.add(new int[]{score[i][k], i});
        // }
        
        // int[][] ans = new int[score.length][score[0].length];
        // int j = 0;
        // while(!pq.isEmpty()){
        //     int[] row = pq.poll();
        //     int rowN = row[1];
        //     ans[j] = score[rowN];
        //     j++;
        // }
        
        // return ans;

    }
}