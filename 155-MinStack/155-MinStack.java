// Last updated: 13/08/2026, 09:21:14

class MinStack {
    Stack<Integer> s = new Stack<>() , st =new Stack<>();

    
    public void push(int value) {
        s.push(value);
        if(st.isEmpty() || value<=st.peek()){
            st.push(value);
        }
    }
    
    public void pop() {
        if(s.peek().equals(st.peek())){
            st.pop();

        }
        s.pop();
    }
    
    public int top() {
        return s.peek();
    }
    
    public int getMin() {
        return  st.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */