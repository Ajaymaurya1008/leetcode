class BrowserHistory {
    Stack<String> s = new Stack<>();
    Stack<String> ss = new Stack<>();

    public BrowserHistory(String homepage) {
        s.add(homepage);
    }
    
    public void visit(String url) {
        s.push(url);
        ss.clear();
    }
    
    public String back(int steps) {
        for(int i=0;i<steps;i++){
            if(s.size()==1){
                return s.peek();
            }
            ss.push(s.pop());
        }
        System.out.println(ss);
        return s.peek();
    }
    
    public String forward(int steps) {
        for(int i=0;i<steps;i++){
            if(!ss.empty()){
                s.push(ss.pop());
            }
        }
        return s.peek();
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */