class Solution {
    public long smallestNumber(long num) {
        if(num==0)return num;
        return num>0?positive(num):negative(num);
    }
    
    public long negative(long num){
        String s = String.valueOf(num);
        ArrayList<Integer> arr = new ArrayList();
        for(int i = 1; i<s.length(); i++){
            arr.add(Integer.parseInt(String.valueOf(s.charAt(i))));
        }
        Collections.sort(arr);
        String str = "";
        for(int n: arr){
            str = Integer.toString(n) + str;
        }
        return Long.parseLong(str)*-1;
    }
    
    public long positive(long num){
        String s = String.valueOf(num);
        String zero = "";
        ArrayList<Integer> arr = new ArrayList();
        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i)=='0')zero+="0";
            else arr.add(Integer.parseInt(String.valueOf(s.charAt(i))));
        }
        Collections.sort(arr);
        String str = "";
        for(int n: arr){
            if(str=="")str = Integer.toString(n) + zero;
            else str += Integer.toString(n);
        }
        return Long.parseLong(str);
    }
}
