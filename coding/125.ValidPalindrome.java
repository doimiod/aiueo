class Solution {
    public boolean isPalindrome(String s) {

        s = s.replace(" ", "");
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        String reversed = new StringBuilder(s).reverse().toString();

        for(int i = 0; i<s.length(); i++){
            char c = s.charAt(i);
            char c2 = reversed.charAt(i);
            if(!Character.isLowerCase(c)) c = Character.toLowerCase(c);
            if(!Character.isLowerCase(c2)) c2 = Character.toLowerCase(c2);
            if(c != c2) return false;
        }

        return true;
    }
}