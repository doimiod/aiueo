class Solution {
    public long matrixSumQueries(int n, int[][] queries) {
        
        long ans = 0;
        int[] rowPassed = new int[n];
        int[] colPassed = new int[n];
        int rowCount = 0;
        int colCount = 0;

        for(int i = queries.length-1; i>=0; i--){
            int type = queries[i][0];
            int idx = queries[i][1];
            long val = queries[i][2];
            if(type==0 && rowPassed[idx] == 0){
                ans += (n-colCount)*val;
                rowPassed[idx] = 1;
                rowCount++;
            }
            else if(type==1 && colPassed[idx] == 0){
                ans += (n-rowCount)*val;
                colPassed[idx] = 1;
                colCount++;
            }
        }
        return ans;
    }
}