import javax.print.attribute.standard.Finishings;

public class Doubly_LL {
    
    Node head;
    int size;
    public Doubly_LL(){
        size = -1;
    }

    public void insertFirst(int value){
        Node node = new Node(value);
        // if(head == null){
        //     node.next = head;
        //     node.prev = null;
        //     head = node;
        //     size++;
        //     return;
        // }
        node.next = head;
        node.prev = null;
        if(head!=null){
            head.prev = node;
        }
        head = node;
        size++;
    }

    public void deleteFirst(){
        head = head.next;
        head.prev = null;
        size--;
    }

    public void insertLast(int value){
        Node node = new Node(value);
        node.next = null;
        if(head == null){
            node.prev = null;
            head = node;
            size++;
            return;
        }
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = node;
        node.prev = temp;
        size++;
    }

    public void deleteLast(){
        Node temp1 = head;
        while(temp1.next != null){
            temp1 = temp1.next;
        }
        Node temp2 = temp1.prev;
        temp1.prev = null;
        temp2.next = null;
        size--;
    }

    // check insert index once
    public void insertIndex(int value,int index){
        Node node = new Node(value);
        Node temp1 = head;

        for(int i=0;i<index-1;i++){
            temp1 = temp1.next;
        }
        // last insert
        if(temp1.next == null){
            temp1.next = node;
            node.prev = temp1;
            node.next = null;
            size++;
            return;
        }
        Node temp2 = temp1.next;
        temp1.next = node;
        node.prev = temp1;
        node.next = temp2;
        temp2.prev = node;
        size++;
    }

    public Node find(int value){
        Node temp = head;
        while(temp != null){
            if(temp.value == value){
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }

    // to insert after an element
    public void insert(int after,int value){
        Node val = find(after);
        if(val == null){
            System.out.println("Node Does not exist");
            return;
        }
        Node node = new Node(value);
        node.prev = val;
        node.next = val.next;
        val.next = node;
    }

    public void deleteIndex(int index){
        Node temp1 = head; 
        if(index == 0){
            head = head.next;
            head.prev = null;
            size--;
            return;
        }
        for(int i=0;i<index;i++){
            temp1 = temp1.next;
        }
        Node temp2 = temp1.next;
        Node temp3 = temp1.prev;
        temp2.prev = temp3;
        temp3.next = temp2;
        temp1.next = null;
        temp1.prev = null;
        size--;
    }

    public void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.value+"-->");
            temp = temp.next;
        }
        System.out.println("End");
    }

    public void displayReverse(){
        Node temp = head;
        Node last = null;
        while(temp!=null){
            last = temp;
            temp = temp.next;
        }
        while(last!=null){
            System.out.print(last.value+"-->");
            last = last.prev;
        }
        System.out.println("Start");
    }

    public void size(){
        System.out.println(size);
    }
    
    class Node {
        int value;
        Node next;
        Node prev;
    
        public Node(int value){
            this.value = value;
        }
    
        public Node(int value,Node next,Node prev){
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    
    }

}

