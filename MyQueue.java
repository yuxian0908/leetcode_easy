package leetcode;

import java.util.Stack;

public class MyQueue {

	Stack<Integer> store;
	Stack<Integer> trans;
	
    /** Initialize your data structure here. */
    public MyQueue() {
        store = new Stack<>();
        trans = new Stack<>();
    }
    
    private void transfer() {
    	while(!store.isEmpty()) {
        	trans.push(store.pop());
    	}
    }
    
    /** Push element x to the back of queue. */
    public void push(int x) {
        store.push(x);
    }
    
    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        if(trans.isEmpty()){
            transfer();
        }
        return trans.pop();
    }
    
    /** Get the front element. */
    public int peek() {
        if(trans.isEmpty()){
            transfer(); 
        }      
        return trans.peek(); 
    }
    
    /** Returns whether the queue is empty. */
    public boolean empty() {
        return store.isEmpty()&&trans.isEmpty();
    }
}
