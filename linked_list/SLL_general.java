import java.util.*;

public class SLL_general {
    public static void main(String[] args){
        System.out.println("Hello World");

        Sll list = new Sll();

        list.insertFirst(1);
        list.insertFirst(1);
        list.insertFirst(2);
        // list.insertFirst(2);
        list.insertFirst(1);
        // list.insertFirst(1);
        list.display();
        // list.display();

        boolean state = list.pal();
        // list.displayRev();
        list.display();
        System.out.println(state);


    }
}

class Sll {

    Node head = null;
    // Node temp;

    public void insertFirst(int val){
        Node node = new Node(val);
        if(head == null){
            head = node;
            head.next = null;
            return;
        }
        node.next = head;
        head = node;
    }

    public void display(){
        Node node = head;
        while(node != null){
            System.out.print(node.val);
            if(node.next != null) System.out.print("-->");
            node = node.next;
        }
        System.out.println();
    }
    // public void displayRev(){
    //     Node node = temp;
    //     while(node != null){
    //         System.out.print(node.val);
    //         if(node.next != null) System.out.print("-->");
    //         node = node.next;
    //     }
    //     System.out.println();
    // }

    public boolean pal(){
        Node temp;
        Node current = head;
        Node left = null;
        Node right;
        while(current != null){
            right = current.next;
            current.next = left;
            left = current;
            current = right;
        }
        temp = left;
        // System.out.println(temp.val);
        Node node = temp;
        while(node != null){
            System.out.print(node.val);
            if(node.next != null) System.out.print("-->");
            node = node.next;
        }
        System.out.println();
        
    
        Node temp1 = head;
        boolean state = true;
        // while(temp.next != null){
        //     System.out.println(temp1.val+"  "+temp.val);
        //     if(temp1.val != temp.val){
        //         return false;
        //     }

        //     temp1 = temp1.next;
        //     temp = temp.next;
        // }
        
        return state;
    }

    public class Node{
        int val;
        Node next;
      

        public Node(int val){
            this.val = val;
        }
    }

}