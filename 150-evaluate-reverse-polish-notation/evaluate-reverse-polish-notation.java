class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> s = new Stack<>();
        for(String m:tokens){
            if(m.equals("/")){
                int a = s.pop();
                if(!s.isEmpty()){
                    int t = s.peek()/a;
                    s.pop();
                    s.push(t);
                }
            }else if(m.equals("*")){
                int a = s.pop();
                if(!s.isEmpty()){
                    int t = a * s.peek();
                    s.pop();
                    s.push(t);
                }
            }else if(m.equals("+")){
                int a = s.pop();
                if(!s.isEmpty()){
                    int t = a + s.peek();
                    s.pop();
                    s.push(t);
                }
            }else if(m.equals("-")){
                int a = s.pop();
                if(!s.isEmpty()){
                    int t = s.peek() - a;
                    s.pop();
                    s.push(t);
                }
            }else{
                s.push(Integer.parseInt(m));
            }
        }
        return s.peek();
    }
}