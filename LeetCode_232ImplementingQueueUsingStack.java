public class LeetCode_232ImplementingQueueUsingStack {
  class MyQueue {
    Stack<Integer> q1,q2;

    public MyQueue() {
        q1=new Stack<>();// for push
        q2 = new Stack<>(); // for pop/peek
    }
    
    public void push(int x) {
        q1.push(x);
    }
    
    public int pop() {
        if(q2.isEmpty()){
            while(!q1.isEmpty()){
                q2.push(q1.pop());
            }
        }
        return q2.pop();
    }
    
    public int peek() {
        if (q2.isEmpty()) {
            while (!q1.isEmpty()) {
                q2.push(q1.pop());
            }
        }
        return q2.peek();
    }
    
    public boolean empty() {
        return q1.isEmpty() && q2.isEmpty();
    }
}

    public static void main(String[] args) {
        
    }
}