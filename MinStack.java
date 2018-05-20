package leetcode;

import java.util.Stack;

public class MinStack {
    private class Node {
        int val;
        int last_min;
        public Node() {}
        public Node(int val, int last_min) {
            this.val = val;
            this.last_min = last_min;
        }
    }
	private Stack<Node> store;
	
	public MinStack() {
		store = new Stack<>();
	}
	
	public void push(int x) {
        if(store.isEmpty()) {
        	store.push(new Node(x,x));
        }else {
        	Node prev = store.peek();
        	int min = x>prev.last_min?prev.last_min:x;
        	store.push(new Node(x,min));
        }
    }
	public void pop() {
        store.pop();
    }
    
    public int top() {
        return store.peek().val;
    }
    
    public int getMin() {
        return store.peek().last_min;
    }
}
