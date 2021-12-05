public class SLL {
    public static void main(String[] args){
        Singly_LL LL = new Singly_LL();

        LL.insertFirst(10);
        LL.insertFirst(20);
        LL.insertFirst(30);
        LL.insertFirst(40);
        LL.insertFirst(50);
        LL.insertLast(60);
        LL.insert(70);
        LL.insertIndex(45, 4);
        LL.deleteFirst();
        LL.deleteFirst();
        LL.deleteLast();
        LL.insertFirst(25);
        LL.insertFirst(28);
        LL.insertLast(65);
        LL.display();
        LL.deleteIndex(7);
        // LL.deleteIndex(5);
        // LL.deleteIndex(1);
        LL.display();
        System.out.println(LL.findIndex(60));
        System.out.println(LL.findValue(6));
        System.out.println();
        System.out.println();
        LL.deleteLast();


        LL.display();

        LL.size();

    }
}
