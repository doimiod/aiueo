class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        HashMap<String, List> map = new HashMap<String, List>();

        for(int i = 0; i<strs.length; i++){

            String s = strs[i];
            char[] c = s.toCharArray();
            Arrays.sort(c);
            String key = String.valueOf(c);

            if(!map.containsKey(key)) map.put(key, new ArrayList());
            map.get(key).add(s);

        }
        return new ArrayList(map.values());
    }
}