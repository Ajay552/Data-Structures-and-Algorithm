// https://leetcode.com/problems/online-stock-span/
public class StockSpan{
  
    class StockSpanner {
    Stack<int[]> s;
    public StockSpanner() {
        s = new Stack<>();
    }
    
    public int next(int price) {
        
        int count = 0;
        while(!s.isEmpty() && price >= s.peek()[0]){
            count += s.pop()[1];
        }
        count++;
        s.push(new int[]{price,count});
        
        return count;    
        
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */
}