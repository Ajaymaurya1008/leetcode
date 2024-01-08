class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> s = new Stack<>();
        for(String m:operations){
            if(m.equals("C")){
                s.pop();
            }else if(m.equals("D")){
                int top=s.peek();
                s.push(top*2);
            }else if(m.equals("+")){
                int a = s.peek();
                s.pop();
                int b = s.peek();
                s.push(a);
                s.push(a+b);
            }else{
                s.push(Integer.parseInt(m));
            }
        }
        int sum=0;
        while(!s.isEmpty()){
            int num = s.peek();
            sum+=num;
            s.pop();
        }
        return sum;
    }
}