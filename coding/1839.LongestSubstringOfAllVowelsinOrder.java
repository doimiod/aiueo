class Solution {
    public int longestBeautifulSubstring(String word) {
        int ans = 0;
        Stack<Character> stack = new Stack<Character>();
        for(int i = 0; i<word.length(); i++){
            char c = word.charAt(i);
            if(c=='a'){
                if(!stack.isEmpty() && stack.peek()!=c)stack.clear();
                stack.push(c);
            }
            
            if(c=='e'){
                if(!stack.isEmpty() && (stack.peek()=='a' || stack.peek()==c))stack.push(c);
                else stack.clear();
            }
            
            if(c=='i'){
                if(!stack.isEmpty() && (stack.peek()=='e' || stack.peek()==c))stack.push(c);
                else stack.clear();

            }
            
            if(c=='o'){
                if(!stack.isEmpty() && (stack.peek()=='i' || stack.peek()==c))stack.push(c);
                else stack.clear();
            }
            
            if(c=='u'){
                if(!stack.isEmpty() && (stack.peek()=='o' || stack.peek()==c)){
                    stack.push(c);
                    ans = Math.max(ans, stack.size());
                }
                else stack.clear();
            }
        }
        
        return ans;
    }
}

class Solution{
     public int longestBeautifulSubstring(String word) {
        int cnt=1;
        int len=1;
        int max_length=0;
        
        int n=word.length();
        
        for(int i=1;i<n;i++){
            if(word.charAt(i)==word.charAt(i-1)){
                 len++;
            }else if(word.charAt(i-1)<word.charAt(i)){
                cnt++;
                len++;
            }else{
                len=1;
                cnt=1;
            }
            
            if(cnt==5){
                max_length=Math.max(max_length,len);
            }
        }
        return max_length;
    }
}