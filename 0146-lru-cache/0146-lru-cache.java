class LRUCache {
    class Node{
        int key;
        int value;
        Node prev;
        Node next;
    }
    Node head;
    Node tail;
    int capacity;
    int size;
    Map<Integer, Node> cache;
    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.cache = new HashMap<>(capacity);
        this.head = new Node();
        this.tail = new Node();
        this.head.next = this.tail;
        this.tail.prev = this.head;
        this.size = 0;
    }
    
    private void addNode(Node node){
        node.next = this.head.next;
        node.prev = head;
        this.head.next.prev = node;
        this.head.next = node;
    }
    
    private void removeNode(Node node){
        Node prev = node.prev;
        Node next = node.next;
        prev.next = next;
        next.prev = prev;
    }
    
    private void moveNode(Node node){
        removeNode(node);
        addNode(node);
    }
    
    public int get(int key) {
        Node node = null;
        if(cache.containsKey(key)){
            node = cache.get(key);
            moveNode(node);
            return node.value;
        } else {
            return -1;
        }
    }
    
    public void put(int key, int value) {
        Node node = null;
        if(cache.containsKey(key)){
            node = cache.get(key);
            node.value = value;
            moveNode(node);
        } else {
            node = new Node();
            node.key = key;
            node.value = value;
            this.size++;
            if(this.size > this.capacity){
                Node leastUsed = this.tail.prev;
                removeNode(leastUsed);
                cache.remove(leastUsed.key);
                this.size--;
            }
            addNode(node);
        }
        //System.out.println(key);
        cache.put(key, node);
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */