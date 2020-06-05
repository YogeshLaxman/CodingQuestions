public class LRUCache {

    class Node{
        int key;
        int value;
        Node next;
        Node prev;
        public Node(int k, int v){
            key = k;
            value = v;
        }
    }

    //Initialize DLL
    Node head,tail;
    Map<Integer,Node> hm = new HashMap<>();
    int maxCapacity=0;
    int currentSize=0;

    public LRUCache(int capacity) {
        maxCapacity=capacity;
        head = new Node(0,0);
        tail = new Node(0,0);
        head.next = tail;
        tail.prev = head;
    }

    public int get(int key) {
        if(hm.containsKey(key)){
            Node tempNode = hm.get(key);
            remove(key);
            add(tempNode.key, tempNode.value);
            return tempNode.value;
        }
        else{
            return -1;
        }
    }

    public void put(int key, int value) {
        if(hm.containsKey(key)){
            remove(key);
        }
        add(key,value);
    }

    public void add(int key, int value){

        Node newNode = new Node(key, value);
        Node firstNode = head.next;

        newNode.next = firstNode;
        newNode.prev = head;

        head.next = newNode;
        firstNode.prev = newNode;

        currentSize++;
        hm.put(key,newNode);

        if( currentSize > maxCapacity){
            Node leastNode = tail.prev;
            remove(leastNode.key);
        }

    }

    public void remove(int key){
        Node toRemove = hm.get(key);
        Node prevNode = toRemove.prev;
        Node nextNode = toRemove.next;

        prevNode.next = toRemove.next;
        nextNode.prev = prevNode;

        currentSize--;
        hm.remove(key);
    }

}
