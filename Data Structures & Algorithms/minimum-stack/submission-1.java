class MinStack {
    private Stack<Integer> stack = new Stack<>();
    private Stack<Integer> minStack = new Stack<>();
    public MinStack() {

    }
    
    public void push(int val) {
        stack.push(val);
        if (!minStack.isEmpty()) {
            Integer tmpVal = Math.min(val, minStack.peek());
            minStack.push(tmpVal);
        }
        else {
            minStack.push(val);
        }
    }
    
    public void pop() {
        stack.pop();
        minStack.pop();
    }
    
    public int top() {
        return stack.peek();
        
    }
    
    public int getMin() {
        return minStack.peek();
    }
}
