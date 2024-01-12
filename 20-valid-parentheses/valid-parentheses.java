class Solution {
    public boolean isValid(String s) {
        Stack<Character> m = new Stack<>();
        for(char a:s.toCharArray()){
            if(!m.isEmpty()){
                char c = m.peek();
                if(a==')' && c=='('){
                    m.pop();
                }else if(a==']' && c=='['){
                    m.pop();
                }else if(a=='}' && c=='{'){
                    m.pop();
                }else{
                    m.push(a);
                }
            }else{
                m.push(a);
            }
        }
        if(m.isEmpty()){
            return true;
        }
        return false;
    }
}