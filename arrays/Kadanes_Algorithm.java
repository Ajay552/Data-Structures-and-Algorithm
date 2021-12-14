// https://leetcode.com/problems/maximum-subarray/
public class Kadanes_Algorithm{
    class Solution {
    public int maxSubArray(int[] arr) {
          int n = arr.length;
          int max = Integer.MIN_VALUE,sum = 0;
          for(int i = 0;i < n;i++){
            sum = sum + arr[i];
            if(sum > max) max = sum;
            if(sum < 0) sum = 0; 
          }
        return max;
    }
}
}