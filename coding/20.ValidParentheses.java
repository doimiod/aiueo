class Solution {
    public boolean isValid(String s) {

        Stack<Character> stack = new Stack<Character>();


        for(int i = 0; i<s.length(); i++){

            char c = s.charAt(i);
            System.out.println(c);

            if(c == '(' || c == '[' || c == '{'){
                stack.push(c);
                System.out.println("check");
            }
            
            if ((c == ')' || c == ']' || c == '}') && stack.isEmpty())
            return false;
            else if(c == ')')
            {
                System.out.println("check 1");
                if(stack.pop() != '(')
                return false;
            }
            else if(c == ']')
            {
                System.out.println("check 2");
                if(stack.pop() != '[')
                return false;
            }
            else if(c == '}')
            {
                System.out.println("check 3");
                if(stack.pop() != '{')
                return false;
            }
            



            // if((st == ")" || st == "]" || st == "}") && stack.isEmpty())
            //     return false;
            
        }

        return stack.isEmpty();
        
    }
}