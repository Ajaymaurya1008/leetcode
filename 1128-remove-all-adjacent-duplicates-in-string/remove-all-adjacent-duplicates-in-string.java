class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> z = new Stack<>();
        for(char m:s.toCharArray()){
            if(!z.isEmpty()){
                if(z.peek()==m){
                    z.pop();
                }else{
                    z.push(m);
                }
            }else{
                z.push(m);
            }
        }
        StringBuilder sb = new StringBuilder();
        for(char m:z){
            sb.append(m);
        }
        return sb.toString();
    }
}