class Solution {
    public int countOdds(int low, int high) {
        return (high + 1) / 2 - low / 2;
        // if(high==low)return (low%2==0)?0:1;
        // if(high-low==1)return 1;
        // if(high%2==0)high--;
        // if(low%2==0)low++;
        // return ((high-low)/2) + 1;
    }
}