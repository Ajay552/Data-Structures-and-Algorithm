public class LL_Queues {
    int size;
    Node head; // front
    Node tail; // rear
    LL_Queues(){
        size = 0;
    }

    boolean isEmpty(){
        return (head == null);
    }

    void enque(int val){
        Node node = new Node(val);
        if(head == null){
            head = node;
            tail = node;
            size++;
            // return;
        }
        tail.next = node;
        tail = node;
        size++;
    }

    void deque(){
        if(isEmpty()) return;
        head = head.next;
        if(head == null) tail = null;
        size--;
    }

    int getFront(){
        return (head != null) ? head.val : -1;
    }

    int getRear(){
        return (tail != null) ? tail.val : -1;
    }

}

class Node{
    int val;
    Node next;
    Node(int val){
        this.val = val;
    }
}

class Test1{
    public static void main(String[] args) {
        LL_Queues q = new LL_Queues();
        q.enque(10);
        q.enque(20);
        q.enque(30);
        q.enque(40);

        q.deque();
        q.deque();

        System.out.println(q.getFront());
    }
}