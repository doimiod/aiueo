class Solution {
    public boolean isPalindrome(int x) {
        
        if(x < 0) return false;
        if(x < 10) return true;

        String str = String.valueOf(x);

        int i = 0;
        int j = str.length()-1;

        while(i <= j){

            char first = str.charAt(i);
            char last = str.charAt(j);
            i++;
            j--;
            if(first != last) return false;
        }

        return true;
    }
}