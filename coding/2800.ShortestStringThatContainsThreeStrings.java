public class Solution {
    public String getMinString(String a, String b) {
        return (a.length() < b.length() || (a.length() == b.length() && a.compareTo(b) < 0)) ? a : b;
    }
    
    public String addTwoStrings(String a, String b){
        if(b.contains(a)) return b; 
        for(int i = 0; i < a.length(); i++){
            String t1 = a.substring(i);
            String t2 = b.substring(0, Math.min(t1.length(), b.length()));
            if(t1.equals(t2)) return a + b.substring(t1.length());
        }
        return a + b;
    }
    
    public String solve(String a, String b, String c) {
        String t1 = addTwoStrings(a, b);
        String t2 = addTwoStrings(b, a);
        String res = "";
        res = getMinString(addTwoStrings(t1, c), addTwoStrings(c, t1));
        res = getMinString(res, addTwoStrings(t2, c));
        res = getMinString(res, addTwoStrings(c, t2));
        return res;
    }
    
    public String minimumString(String a, String b, String c) { 
        String res = solve(a, b, c);      
        res = getMinString(res, solve(b, c, a));
        res = getMinString(res, solve(c,a,b));
        return res;  
    }
}
