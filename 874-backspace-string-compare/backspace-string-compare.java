class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> stack = new Stack<>();
        Stack<Character> stack2 = new Stack<>();
        for(char m:s.toCharArray()){
            if(!stack.isEmpty()){
                char top = stack.peek();
                if(m=='#'){
                    stack.pop();
                }else{
                    stack.push(m);
                }
            }else{
                if(m=='#'){
                    continue;
                }else{
                    stack.push(m);
                }
            }
        }
        for(char m:t.toCharArray()){
            if(!stack2.isEmpty()){
                char top = stack2.peek();
                if(m=='#'){
                    stack2.pop();
                }else{
                    stack2.push(m);
                }
            }else{
                if(m=='#'){
                    continue;
                }else{
                    stack2.push(m);
                }
            }
        }
        System.out.println(stack);
        System.out.println(stack2);
        if(stack.equals(stack2)){
            return true;
        }
        return false;
    }
}