public class LL_Deque {
    Node head;
    Node tail;
    
    void insertFront(int val){
        Node node = new Node(val);
        if(head == null){
            head = node;
            return;
        }

    }

}

class Node{
    int val;
    int next;
    int prev;
    Node(int val){
        this.val = val;
    }
}
