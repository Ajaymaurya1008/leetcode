class MyStack {

    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();
    
    public void push(int x) {
        if(!q1.isEmpty()){
            int m= q1.size();
            for(int i=0;i<m;i++){
                q2.add(q1.remove());
            }
            q1.add(x);
            for(int i=0;i<m;i++){
                q1.add(q2.remove());
            }
        }else{
            q1.add(x);
        }
    }
    
    public int pop() {
        return q1.remove();
    }
    
    public int top() {
        return q1.peek();
    }
    
    public boolean empty() {
        return q1.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */