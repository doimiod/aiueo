class Solution {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        int ans = 0;
        for(int i = citations.length-1, j=1; i>=0; i--, j++){
            ans = Math.max(ans, Math.min(citations[i], j));
        }
        return ans;
    }
}