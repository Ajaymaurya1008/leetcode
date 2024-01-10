class Solution {
    public int minLength(String s) {
        Stack<Character> stack = new Stack<>();
        for(char m:s.toCharArray()){
            if(!stack.isEmpty() && ( m=='B' || m=='D')){
                char top = stack.peek();
                String str= String.valueOf(top) + m;
                if(str.equals("AB") || str.equals("CD")){
                    stack.pop();
                }else{
                    stack.push(m);
                }
            }else{
                stack.push(m);
            }
        }
        return stack.size();
    }
}