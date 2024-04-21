class Solution {
    public List<String> cellsInRange(String s) {
        
        int colStart = s.charAt(0);
        int colEnd = s.charAt(3);
        int rowStart = Integer.parseInt(s.substring(1,2));
        int rowEnd = Integer.parseInt(s.substring(4,5));
        
        ArrayList<String> ans = new ArrayList();
        
        for(int i = colStart; i<=colEnd; i++){
            for(int j = rowStart; j<=rowEnd; j++){
                String add = String.valueOf((char)i) + String.valueOf(j);
                ans.add(add);
            }
        }
        return ans;
    }
}
