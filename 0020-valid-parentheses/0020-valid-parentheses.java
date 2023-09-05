class Solution {
    public boolean isValid(String s) {
       Stack<Character> stack = new Stack<>();
       for(int i=0; i<s.length(); i++){
           Character ch = s.charAt(i);
           if(ch == '(' || ch == '{' || ch == '['){
               stack.push(ch);
           } else {
               if(stack.isEmpty()) return false;
               Character op = stack.pop();
               if(ch == ')' && op == '(' ||
                   ch == '}' && op == '{' || 
                    ch == ']' && op == '['){
                        continue;
                    } else {
                        return false;
                    }
           }
       }
       if(stack.isEmpty()){
           return true;
       } else {
           return false;
       }
    }
}