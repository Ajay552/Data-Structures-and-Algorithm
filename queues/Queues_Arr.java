public class Queues_Arr {
    int size,cap;
    int front; // for O(1) dequeue (Circular array implementation)
    int[] arr;

    Queues_Arr(int cap){
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

    void enque(int val){
        // if(isFull()) return;
        // arr[size] = val;
        // size++;
        // using rear
        int rear = (front+(size-1))%cap;
        rear = rear+1;
        arr[rear] = val;
        size++;
    }

    void deque(){
        if(isEmpty()) return;
        // for(int i = 0;i < size-1; i++){
        //     arr[i] = arr[i+1];
        // }
        // size--;
        // removal in O(1)
        front = (front+1)%cap;
        size--;
    }

    int getFront(){
        return (isEmpty()) ? -1:arr[0];
    }

    int getRear(){
        return (isEmpty()) ? -1:arr[size-1];
    }
}

class Test{
    public static void main(String[] args) {
        Queues_Arr q = new Queues_Arr(5);
        q.enque(10);
        q.enque(20);
        q.enque(30);
        q.enque(40);

        System.out.println(q.getFront());
        System.out.println(q.getRear());
        q.deque();
        q.deque();
        
        System.out.println(q.getFront());
        System.out.println(q.getRear());

    }
}
