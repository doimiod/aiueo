class Solution {
    public boolean doesValidArrayExist(int[] derived) {
        int start = 0;
        int end = start ^ derived[derived.length-1];
        for(int i = 0; i<derived.length-1;i++)
            start = start ^ derived[i];
        if(start!=end)return false;
        return true;
    }
}