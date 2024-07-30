class Solution {
    public String removeStars(String s) {
        Stack<Character> stack = new Stack<>();
        Stack<Character> stack2 = new Stack<>();
        for(int i=s.length()-1;i>-1;i--){
            stack.push(s.charAt(i));
        }
        int m = stack.size();
        for(int i=0;i<m;i++){
            if(!stack.isEmpty()){
                if(stack.peek()=='*'){
                    stack.pop();
                    stack2.pop();
                }else{
                    stack2.push(stack.pop());
                }
            }
        }
        m=stack2.size();
        for(int i=0;i<m;i++) stack.push(stack2.pop());
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<m;i++) sb.append(stack.pop());
        System.out.println(stack);
        System.out.println(stack2);
        return sb.toString();
    }
}