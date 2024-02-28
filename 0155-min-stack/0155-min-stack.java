class MinStack {
    Node head;
    public MinStack() {
        this.head = null;
    }
    
    public void push(int val) {
        Node node;
        if(this.head == null){
            node = new Node(val, null, val);
        } else {
            node = new Node(val, head, Math.min(head.min, val));
        }
        this.head = node;
       
    }
    
    public void pop() {
        this.head = this.head.prev;
    }
    
    public int top() {
        return this.head.val;
    }
    
    public int getMin() {
        return head.min;
    }
}

class Node {
    int val;
    Node prev;
    int min;
        
    public Node(int val, Node prev, int min){
        this.val = val;
        this.prev = prev;
        this.min = min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */