// problem with this implementation is it dosent handle overflow and underflow

public class MyStack {
    
        int arr[];
        int top;
        int cap;
        MyStack(int cap){
            top = -1;
            this.cap = cap;
            arr = new int[cap];
        }

        void push(int val){
                // if(top == cap+1){
                //     try {
                //         // 
                //     } catch (Exception e) {
                //         System.out.println("Stack Overflow");
                //     }
                // }
            top++;
            arr[top] = val;
        }

        int pop(){
            // if(top == -1){
            //     try {
            //         //
            //     } catch (Exception e) {
            //         System.out.println("Stack Underflow");
            //     }
            // }
            int res = arr[top];
            top--;
            return res;
        }

        int size(){
            return top+1;
        }

        boolean isEmpty(){
            if(top == -1){
                return true;
            }
            return false;
        }
        
        int peek(){
            return arr[top];
        }
}

class test {
    public static void main(String[] args){
        System.out.println("Hello World");
        MyStack s = new MyStack(5);

        s.push(10);
        s.push(20);
        s.push(30);
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println(s.size());
        System.out.println(s.pop());
        System.out.println(s.size());


    }
}
