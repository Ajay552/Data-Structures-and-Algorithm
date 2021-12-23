// https://leetcode.com/problems/largest-rectangle-in-histogram/

import java.util.*;

public class AreaHistogram{
    public static void main(String[] args) {

        int[] arr = new int[]{2,1,5,6,2,3};
        int n = arr.length;
        int[] nsl = new int[n];
        int[] nsr = new int[n];
        int[] area = new int[n]; 
        Stack<int[]> s = new Stack<>();
      
        // nearest smallest left index
        for(int i = 0;i<n;i++){
          if(s.isEmpty()) s.push(new int[]{Integer.MIN_VALUE,-1});
          while(!s.isEmpty() && s.peek()[0] >= arr[i]){
            s.pop();
          }
          if(!s.isEmpty()){
            nsl[i] = s.peek()[1];
          }
          s.push(new int[]{arr[i],i});
        }
        
        s.removeAllElements(); // empty the stack 
  
        // nearest smallest right index
        for(int i = n-1;i>=0;i--){
          if(s.isEmpty()) s.push(new int[]{Integer.MIN_VALUE,n});
          while(!s.isEmpty() && s.peek()[0] >= arr[i]){
            s.pop();
          }
          if(!s.isEmpty()){
            nsr[i] = s.peek()[1];
          }
          s.push(new int[]{arr[i],i});
        }
  
        for(int i = 0;i < n;i++){
          area[i] = ((nsr[i] - nsl[i])-1) * arr[i];
        }
        System.out.println(Arrays.stream(area).max().getAsInt());
     
      }

}