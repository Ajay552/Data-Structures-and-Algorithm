import java.util.*;
// https://leetcode.com/problems/convert-binary-number-in-a-linked-list-to-integer/

public class BinaryNo_LL_Integer {
    public static void main(String[] args){
        System.out.println("Hello World");

        Singly_LL2 LL = new Singly_LL2();
        LL.insertFirst(0);
        LL.insertFirst(1);
        LL.insertFirst(0);
        LL.insertFirst(1);
        // LL.insertFirst(50);

        LL.display();

        System.out.println(LL.getDecimalValue());


    }
}

class Singly_LL2{
    
    ListNode head;
    
    public class ListNode{
        int value;
        ListNode next;

        public ListNode(int value){
            this.value = value;
        }

    }

    public void insertFirst(int value){
        ListNode node = new ListNode(value);
        if(head == null){
            head = node;
            head.next = null;
            return;
        }
        node.next = head;
        head = node;

    }

    public ListNode reverseList(){
        ListNode current = head;
        ListNode left = null;  // previous
        // ListNode next = 
        ListNode right = null; // next

        while(current != null){
            right = current.next;
            current.next = left;
            left = current;
            current = right;
        }
        head = left;
        return head;
    }   

    public int getDecimalValue(){
        // ListNode node = reverseList();
        ListNode node = head;
        // int decimal = 0,p=0,base = 1;
        // while(node != null){
        //     int ref =node.value;
        //     decimal = decimal + (node.value * base);
        //     base = base * 2;
        //     p++;
        //     node = node.next;
        // }
        // return decimal;

        int num = node.value;
        while (node.next != null) {
            num = num * 2 + node.next.value;
            node = node.next;    
        }
        return num;


    }

    public void display(){
        ListNode temp = head;
        while(temp != null){
            System.out.print(temp.value);
            if(temp.next != null) System.out.print("-->");
            temp = temp.next;
        }
        System.out.println();
    }
}
