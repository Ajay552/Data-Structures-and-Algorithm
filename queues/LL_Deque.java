public class LL_Deque {
    Node head;
    Node tail;
    
    void insertFront(int val){
        Node node = new Node(val);
        if(head == null){
           head = tail = node;
            return;
        }
        head.prev = node;
        node.next = head;
        head = node;
    }

    void insertLast(int val){
        Node node = new Node(val);
        if(tail == null){
            head = tail = null;
            return;
        }

        tail.next = node;
        node.prev = tail;
        tail = node;
    }
    
    boolean isEmpty(){
        return ((head == null) && (tail == null));
    }

    int getFirst(){
        if(isEmpty()) return -1;
        return head.val;
    }

    int getRear(){
        if(isEmpty()) return -1;
        return tail.val;
    }

    class Node{
        int val;
        Node next;
        Node prev;
        Node(int val){
            this.val = val;
        }

    }

}

class test2{
    public static void main(String[] args) {
        LL_Deque q = new LL_Deque();
        System.out.println(q.isEmpty());
        q.insertFront(10);
        q.insertFront(20);
        q.insertLast(30);

        System.out.println(q.getFirst());
        System.out.println(q.getRear());
        System.out.println(q.isEmpty());

    }
}
