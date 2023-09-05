class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();
        for(int i=0; i<operations.length; i++){
            String op = operations[i];
            if(op.equals("C")){
                stack.pop();
            } else if(op.equals("+")){
                int lastNum = stack.pop();
                int previousLastNum = stack.peek();
                stack.push(lastNum);
                stack.push(lastNum + previousLastNum);
            } else if(op.equals("D")){
                int previous = stack.peek();
                stack.push(2 * previous);
            } else {
                stack.push(Integer.parseInt(op));
            }
        }
        int result = 0;
        while(!stack.isEmpty()){
            result += stack.pop();
        }
        return result;
    }
}