class MyQueue {
    Stack<Integer> myStack,temp;
    public MyQueue() {
        myStack=new Stack<>();
        temp=new Stack<>();
    }
    
    public void push(int x) {
        myStack.push(x);
    }
    
    public int pop() {
        if(!temp.isEmpty()) return temp.pop();
        while(!myStack.isEmpty()){
                temp.push(myStack.pop());
            }
        return temp.pop();
    }
    
    public int peek() {
        if(!temp.isEmpty()) return temp.peek();
        while(!myStack.isEmpty()){
                temp.push(myStack.pop());
            }
        return temp.peek();
    }
    
    public boolean empty() {
        if(temp.isEmpty() && myStack.isEmpty()) return true;
        return false;
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */