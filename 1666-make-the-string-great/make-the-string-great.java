class Solution {
    public String makeGood(String s) {
        Stack<Character> stack = new Stack<>();
        for(char m:s.toCharArray()){
            if(!stack.isEmpty()){
                char top = stack.peek();
                boolean isPairValid = (Character.toLowerCase(top) == Character.toLowerCase(m)) &&
                      (top != m);
                if(isPairValid){
                    stack.pop();
                }else{
                    stack.push(m);
                }
            }else{
                stack.push(m);
            }
        }
        StringBuilder sb= new StringBuilder();
        for(char m:stack){
            sb.append(m);
        }
        return sb.toString();
    }
}