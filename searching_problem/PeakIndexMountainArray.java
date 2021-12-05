import java.util.*;

class PeakIndexMountainArray {
  public static void main(String[] args) {
    
    // https://leetcode.com/problems/peak-index-in-a-mountain-array/
    
    int[] arr = {3, 5, 6, 7, 9, 10, 6, 5, 3};
    // int[] arr = {1,2,1};

    System.out.println(search(arr)); 

  }

  public static int search(int[] nums){

    int start = 0;
    int end = nums.length-1;
    while(start<end){
       int mid = (start+end)/2;
      if(nums[mid]>nums[mid+1]){
        end = mid;
      }else if(nums[mid]<nums[mid+1]){
        start = mid+1;
      }
     }
    return start; // both start and end pointing at ans so can return any
  }

}