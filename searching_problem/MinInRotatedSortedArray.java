import java.util.*;

class MinInRotatedSortedArray {
  public static void main(String[] args) {
    
    // https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/submissions/
    
    int[] arr = {8,9,10,11,12,13,14,1,2,3,4,5};
    // int[] arr = {4,5,6,7,8};
    System.out.println(pivot(arr));
  }

  public static int pivot(int[] arr){

   int start = 0;
   int end = arr.length - 1;
  //  if the array is not rotated and is sorted
   if(arr[start] < arr[end]) return arr[start];
   // if only one element in an array   
   if(end == 0) return end; 
   while(start <= end){
     int mid = (start + end)/2;
     // to check if mid+1 is grater than mid 
     if(mid < end && arr[mid] > arr[mid+1]) return mid+1;
     // to check id mid-1 id greater than mid
     if(start < mid && arr[mid-1] > arr[mid]) return mid;

     if(arr[start] > arr[mid]){
       end = mid - 1;
     }else {
       start = mid + 1;
     }

   } 
   return -1;
  }

}