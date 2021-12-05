public class Singly_LL {

    // private is not compulsory to add
    private Node head;
    private Node tail;
    private int size;

    public Singly_LL(){
        this.size = -1;  // so that the linked list start from zero
    }
    public void size(){
        System.out.println(size);
    }

    public void insertFirst(int value){
        Node node = new Node(value);
        node.next = head;
        head = node;

        if(tail == null){
            tail = head;
        }

        size++;
    }

    public void deleteFirst(){
        head = head.next;
        size--;
    }

    public void insertLast(int value){
        if(tail == null){
            insertFirst(value);
            return;
        }
        Node node = new Node(value);
        tail.next = node;
        tail = node;
        size++;
    }

    public void deleteLast(){
        Node temp = head;
        for(int i = 0;i<size-1;i++){
            temp = temp.next;
        }
        temp.next = null;
        size--;
    }

    //  insert without tail
    public void insert(int value){
        Node node = new Node(value);
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = node;
        size++;
    }
    
    // insert at specific index
    public void insertIndex(int value,int index){
        if(index == 0){
            insertFirst(value);
            return;
        }
        if(index == size){
            insertLast(value);
            return;
        }

        Node temp1 = head;
        //  Assuming the index of linked list starts from 0
        for(int i = 1;i < index;i++){
            temp1 = temp1.next;
        }
        Node node = new Node(value);
        Node temp2 = temp1.next;
        temp1.next = node;
        node.next = temp2;

        // without using 2 temp variables
        // Node node = new Node(value,temp1.next);
        // temp1.next = node;

        size++;
    }
    // Assume index from zero   
    public void deleteIndex(int index){
        if(head == null) return;
        if(index == 0){
            // deleteFirst();
            head = head.next;
            size--;
            return;
        }
        Node temp1 = head;
        for(int i = 0;i<index-1;i++){
            temp1 = temp1.next;
        }
        Node temp2 = temp1.next.next;
        temp1.next = temp2;
        size--;
    }

    public int findIndex(int value){
        Node temp = head;
        int count = 0;
        while(temp != null){
            if(value == temp.value) return count;
            temp = temp.next;
            count++;
        }
        return -1;
    }

    public int findValue(int index){
        Node temp = head;
        for(int i = 0;i<=index-1;i++){
            temp = temp.next;
        }
        return temp.value;
    }

    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value + " --> ");
            temp = temp.next;
            // System.out.println(temp);
        }
        System.out.println("END");
    }

    private class Node{
        private int value;
        private Node next;

        public Node(int value){
            this.value = value;
        }

        // can be done without this 2 argument constructor also
        public Node(int value,Node next){
            this.value = value;
            this.next = next;
        }

    }
    
}
