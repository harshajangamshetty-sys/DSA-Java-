class Node {
    int key , value;
    Node next , prev;

    Node(int key , int value) {
        this.key = key;
        this.value = value;
    }
}
class LRUCache {

    Map<Integer , Node> map;
    int capacity;
    Node dummy_head;
    Node dummy_tail;
    

    public LRUCache(int capacity) {
        map = new HashMap<>();
        this.capacity = capacity;
        dummy_head = new Node(0 ,0);
        dummy_tail = new Node(0 , 0);
        dummy_head.next = dummy_tail;
        dummy_tail.prev = dummy_head;
    }

    public void remove(Node node) {
        Node A = node.next;
        Node B = node.prev;

        B.next = A;
        A.prev = B;
    }

    public void insertNode(Node node) {
       Node A = dummy_tail.prev;
       Node B = dummy_tail;

       A.next = node;
       node.prev = A;
       B.prev = node;
       node.next = B;
    }
    
    public int get(int key) {
        Node node = map.get(key);
        if(node == null) {
            return -1;
        }

        remove(node);
        insertNode(node);
        return node.value;
    }
    
    public void put(int key, int value) {
        

        if(map.containsKey(key)) {
        Node node = map.get(key);
            node.value = value;
            remove(node);
            insertNode(node);
        }else if(map.size() == capacity) {
            Node lru = dummy_head.next;
            remove(lru);
            map.remove(lru.key);

            Node node = new Node(key , value);
            map.put(key , node);
            insertNode(node);
        }else {
            Node node = new Node (key , value);
            map.put(key , node);
            insertNode(node);
        }
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */