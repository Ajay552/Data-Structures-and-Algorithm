public class LL_Reverse {

    public static void main(String[] args){
        System.out.println("Hello World");
        Singly_LL1 LL = new Singly_LL1();
        LL.insertFirst(10);
        LL.insertFirst(20);
        LL.insertFirst(30);
        LL.insertFirst(40);
        LL.reverseList();

        LL.display();
    }
    
}

class Singly_LL1{
    
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

    public void reverseList(){
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
