public class Deque_Arr {
    int size,cap;
    int front;
    int[] arr;
    Deque_Arr(int cap){
        this.cap = cap;
        size = 0;
        front = 0;
        arr = new int[cap];
    }

    boolean isFull(){
        return (size == cap);
    }

    boolean isEmpty(){
        return (size == 0);
    }

    void insertRear(int val){
        if(isFull()) return;
        // arr[size] = val;
        // size++;
        int new_rear = (front+size) % cap;
        arr[new_rear] = val;
        size++;
    }

    void insertFront(int val){
        if(isFull()) return;
        // for(int i = size-1;i>=0;i--){
        //     arr[i+1] = arr[i]; 
        // }
        // arr[0] = val;
        // size++;
        // O(1) implementation
        front = (front + cap-1) % cap;
        arr[front] = val;
        size++;
    }

    void deleteRear(){
        if(isEmpty()) return;
        size--;
        // rear = ((rear-1) + cap) % cap;
        
    }

    int getRear(){
        if(isEmpty()) return -1;
        return arr[(front+size-1) % cap];
    }

    int getFront(){
        if(isEmpty()) return -1;
        return arr[front];
    }

    void deleteFront(){
        if(isEmpty()) return;
        // for(int i = 0;i<size-1;i++){
        //     arr[i] = arr[i+1];
        // }
        // size--;
        front = (front+1)%cap;
        size--;
    }

}

class Test3{
    public static void main(String[] args) {
        Deque_Arr q = new Deque_Arr(5);
        System.out.println(q.isEmpty());
        System.out.println(q.isFull());
        q.insertFront(10);
        q.insertFront(20);
        q.insertRear(30);

        System.out.println(q.getFront());
        System.out.println(q.getRear());
    }
}
