public class Circular_LL {
    Node head;
    Node tail;

    public void insertFirst(int value){
        Node node = new Node(value);
        if(head == null){
            head = node;
            tail = node;
            return;
        }
        node.next = head;
        tail.next = node;
        tail = node;
    }

    public void display(){
        Node temp = head;
        while(true){
            System.out.print(temp.value);
            temp = temp.next;
            if(temp == head) break;
            System.out.print("-->");
        }
        System.out.println();
    }

    public class Node {
        int value;
        Node next;    
        
        public Node(int value){
            this.value = value;
        }
    }


}
