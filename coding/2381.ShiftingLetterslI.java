class Solution {
    public String shiftingLetters(String s, int[][] shifts) {
        int[] a = new int[s.length()+1];
        for(int i = 0; i<shifts.length; i++){
            int start = shifts[i][0];
            int end = shifts[i][1]+1;
            int diff = (shifts[i][2]==0)?-1:1;
            a[start] = a[start] + diff;
            a[end] = a[end] + ((diff==-1)?1:-1);
        }
        for(int i = 1; i<a.length; i++){
            a[i] = a[i-1] + a[i];
            // System.out.println("when i = "+i+" "+a[i]);
        }
        char[] c = s.toCharArray();
        for(int i = 0; i<s.length(); i++){
            int base = (c[i]-'a'+a[i])%26;
            if(base<0)base = 26 + base;
            // System.out.println(base);
            c[i] = (char)(base + 'a');
            // System.out.println(c[i]-'a');
        }
        
        return String.valueOf(c);
    }
}