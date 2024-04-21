class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length())return false;
        HashMap<Character, Integer> map1 = new HashMap<Character, Integer>();
        HashMap<Character, Integer> map2 = new HashMap<Character, Integer>();
        for(int i = 0; i<s1.length(); i++){
            char c1 = s1.charAt(i);
            char c2 = s2.charAt(i);
            map1.put(c1, map1.getOrDefault(c1,0)+1);
            map2.put(c2, map2.getOrDefault(c2,0)+1);
        }
        if(map1.equals(map2))return true;
        for(int i = s1.length(), j=0; i<s2.length(); i++){
            char c1 = s2.charAt(j);
            char c2 = s2.charAt(i);
            map2.put(c1, map2.get(c1)-1);
            map2.put(c2, map2.getOrDefault(c2,0)+1);
            if(map2.get(c1)==0)map2.remove(c1);
            if(map1.equals(map2))return true;
            j++;
        }
        return false;
    }
}