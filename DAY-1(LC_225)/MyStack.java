import java.util.LinkedList;
import java.util.Queue;

class MyStack {
    // Initial queue creation
    Queue<Integer> myQue;

    public MyStack() {
        myQue = new LinkedList<>(); // Initialize queue
    }
    
    public void push(int x) {
        myQue.add(x); // Add element to queue
        int n = myQue.size();
        // Rotate queue to make last added element the front
        for (int i = 1; i < n; i++) {
            myQue.add(myQue.remove());
        }
    }
    
    public int pop() {
        if (empty()) return -1; // Check if stack is empty
        return myQue.remove(); // Remove and return top element
    }
    
    public int top() {
        return myQue.element(); // Get top element without removing
    }
    
    public boolean empty() {
        if (myQue.size() == 0) return true; // Check if queue is empty
        return false;
    }
}
