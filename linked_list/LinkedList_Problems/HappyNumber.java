class HappyNumber{
    // https://leetcode.com/problems/happy-number/
    public static void main(String[] args){

        int n = 19;  // is a happy number
        // int n = 2; // not a happy number

        int slow = n;
        int fast = n;
        
        do{
            slow = square(slow);
            fast = square(square(fast));
        }while(slow != fast);
        
        if(slow == 1){
            System.out.println("true");
        }else{
            System.out.println("false");
        }

    }

    public static int square(int num){
        int ans = 0;
        while(num > 0){
            int rem = num % 10;
            ans = ans + (rem * rem);
            num = num/10;
        }
        return ans;
    }

}