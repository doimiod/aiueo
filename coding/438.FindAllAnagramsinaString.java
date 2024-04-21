class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        ArrayList<Integer> ans = new ArrayList<Integer>();
        if(s.length()<p.length())return ans;
        HashMap<Character, Integer> map1 = new HashMap<Character, Integer>();
        HashMap<Character, Integer> map2 = new HashMap<Character, Integer>();
        for(int i = 0; i<p.length(); i++){
            char c1 = s.charAt(i);
            char c2 = p.charAt(i);
            map1.put(c1, map1.getOrDefault(c1,0)+1);
            map2.put(c2, map2.getOrDefault(c2,0)+1);
        }
        if(map1.equals(map2))ans.add(0);
        
        for(int i = p.length(), j = 0; i<s.length(); i++, j++){
            char c1 = s.charAt(i);
            char c2 = s.charAt(j);
            map1.put(c1, map1.getOrDefault(c1,0)+1);
            map1.put(c2, map1.getOrDefault(c2,0)-1);
            if(map1.get(c2)==0)map1.remove(c2);
            if(map1.equals(map2))ans.add(i-p.length()+1);
        }
        return ans;
    }
}