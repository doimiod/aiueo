class Solution {
    public boolean isItPossible(String word1, String word2) {
        HashMap<Character, Integer> map1 = new HashMap<Character, Integer>();
        HashMap<Character, Integer> map2 = new HashMap<Character, Integer>();
        for(char c: word1.toCharArray())map1.put(c, map1.getOrDefault(c, 0)+1);
        for(char c: word2.toCharArray())map2.put(c, map2.getOrDefault(c, 0)+1);
        
        for(char c1='a'; c1<='z'; c1++){
            for(char c2='a'; c2<='z'; c2++){
                if(map1.containsKey(c1) && map2.containsKey(c2)){
                    addAndRemove(map1, c2, c1);
                    addAndRemove(map2, c1, c2);
                    if(map1.size()==map2.size())return true;
                    addAndRemove(map1, c1, c2);
                    addAndRemove(map2, c2, c1);
                }
            }
        }
        return false;
    }

    public void addAndRemove(HashMap<Character, Integer> map, Character add, Character remove){
        map.put(add, map.getOrDefault(add, 0)+1);
        map.put(remove, map.get(remove)-1);
        if(map.get(remove)==0)map.remove(remove);
    }
}