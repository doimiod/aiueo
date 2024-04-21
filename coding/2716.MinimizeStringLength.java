class Solution {
    public int minimizedStringLength(String s) {
        // int delete = 0;
        // for(int i = 0;i<s.length()-1; i++){
        //     char c = s.charAt(i);
        //     String s2 = s.substring(i+1);
        //     if(s2.contains(String.valueOf(c)))delete++;
        // }
        // return s.length()-delete;
        HashSet<Character> set = new HashSet<Character>();
        for(int i = 0; i<s.length(); i++){
            set.add(s.charAt(i));
        }
        return set.size();
    }
}