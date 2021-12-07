import java.util.*;
public class myHash{
    int BUCKET;
    ArrayList<LinkedList<Integer>> table;

    myHash(int BUCKET){
        this.BUCKET = BUCKET;
        table = new ArrayList<LinkedList<Integer>>();
        for(int i = 0;i<BUCKET;i++){
            table.add(new LinkedList<Integer>());
        }
    }

    void insert(int key){
        int index = key%7;
        // if(table.get(index).peek() != null){
            table.get(index).add(key);
        // } 
    }

    boolean search(int key){
        int index = key%7;
        // for(int i = 0;i<table.get(index).size();i++){
        //     if(key == table.get(index).get(i)) return true;
        // }
        return table.get(index).contains(key);
    }

    void remove(int key){
        int index = key%7;
        for(int i = 0;i<table.get(index).size();i++){
            if(key == table.get(index).get(i)){
                table.get(index).remove(i);
            }
        }
    }
}

class Test{
    public static void main(String[] args) {
        System.out.println("Hello World");
        myHash h = new myHash(7);
        h.insert(50);
        h.insert(21);
        h.insert(58);
        h.insert(17);
        h.insert(15);
        h.insert(49);
        h.insert(56);
        h.insert(22);
        h.insert(23);
        h.insert(25);

        System.out.println(h.search(15));
        h.remove(15);
        System.out.println(h.search(15));
    }
}