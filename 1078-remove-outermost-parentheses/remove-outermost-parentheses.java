class Solution {
    public String removeOuterParentheses(String s) {
        Stack<Character> stack = new Stack();
        StringBuilder sb = new StringBuilder();
        for(char m:s.toCharArray()){
            if(!stack.isEmpty()){
                if(m=='('){
                    stack.push(m);
                    sb.append("(");
                }else{
                    stack.pop();
                    if(!stack.isEmpty()){
                        sb.append(")");
                    }
                }
            }else{
                stack.push(m);
            }
        }
        return sb.toString();
    }
}