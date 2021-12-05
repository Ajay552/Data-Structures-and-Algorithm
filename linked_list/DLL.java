public class DLL {
    public static void main(String[] args){
        
        Doubly_LL DLL = new Doubly_LL();

        DLL.insertFirst(10);
        DLL.insertFirst(20);
        DLL.insertFirst(30);
        DLL.insertFirst(40);
        DLL.insertFirst(50);
        DLL.insertLast(100);
        DLL.insertLast(110);
        DLL.insertIndex(85, 2);
        DLL.insertIndex(125, 8);
        DLL.deleteFirst();
        DLL.deleteLast();
        DLL.deleteLast();
        DLL.insertFirst(150);
        DLL.insertIndex(65, 7);
        DLL.insert(20, 15);

        DLL.deleteIndex(0);

        DLL.display();
        DLL.displayReverse();
        DLL.size();
    }
}
