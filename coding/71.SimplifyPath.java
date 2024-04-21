class Solution {
    public String simplifyPath(String path) {
       String[] s = path.split("/");
       String ans = "";

       Stack<String> stack = new Stack<String>();
       for(String str: s){
           if(str.equals("") || str.equals("."))continue;
           else if(str.equals("..")){
               if(!stack.isEmpty())stack.pop();
           }
           else stack.push(str);
       }
       while(!stack.isEmpty()){
           ans = "/" + stack.pop() + ans;
       }
       return ans.isEmpty() ? "/" : ans;
    }
}