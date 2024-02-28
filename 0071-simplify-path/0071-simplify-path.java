class Solution {
    public String simplifyPath(String path) {
        Deque<String> stack = new ArrayDeque<>();
        String[] words = path.split("/");
        String result = "";
        for(String word : words){
            if(word.equals("..")){
                if(!stack.isEmpty()){
                    stack.pollLast();
                }
            } else if(word.equals(".")){
                continue;
            } else if(!word.isEmpty()){
                stack.offerLast(word);
            } else {
                continue;
            }
        }
        if(stack.isEmpty()){
            return "/";
        }
        while(!stack.isEmpty()){
            result = result + "/" + stack.pollFirst();
        }
        return result;
    }
}