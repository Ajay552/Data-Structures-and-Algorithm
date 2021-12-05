public class LL_Stack{
    Node head;
    int size = 0;

    void push(int val){
        Node s = new Node(val);
        if(head == null){
            head = s;
            size++;
            return;
        }
        s.next = head;
        head = s; 
        size++;
    }

    int pop(){
        if(head == null){
            // return Integer.MAX_VALUE;
            throw new StackOverflowError("Stack underflow");
        }
        Node temp = head;
        head = head.next;
        size--;
        return temp.val;
    }

    int size(){
        return size;
    }

    int peek(){
        return head.val;
    }

    boolean isEmpty(){
        if(head == null){
            return true;
        }
        return false;
    }

}

class Node {
    int val;
    Node next;
    Node(int val){
        this.val = val;
    }
}
class Test1{
    public static void main(String[] args){
        // System.out.println("Hello World");
        LL_Stack s = new LL_Stack();
        System.out.println(s.isEmpty());
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println(s.size());
        System.out.println(s.peek());
        s.pop();
        System.out.println(s.peek());
        System.out.println(s.isEmpty());
        System.out.println(s.size());

    }
}
