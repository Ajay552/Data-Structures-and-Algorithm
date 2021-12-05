import java.util.*;

class RotatedSortedArray {
  public static void main(String[] args) {
    
    // https://leetcode.com/problems/search-in-rotated-sorted-array/
    
    int[] arr = {12,13,1,2,3,4,5,6,7,8};
    // int[] arr = {1,2,3,4,5,6,7};
    // int[] arr = {4,5,6,7,0,1,2};
    // int[] arr = {2,1};
    // int[] arr = {0,2,3,4,2,1};
    // int[] arr = {3, 5, 6, 7, 9, 10, 6, 5, 3};
    // int[] arr = {1,2,1};
    // int[] arr = {5,6,7,1,2,3,4};
    int target = 3;

    int index = pivot(arr);

    int res = binarySearch(arr, target, 0, index);
    if(res == -1){
      res = binarySearch(arr, target, index+1, arr.length-1);
    }
    System.out.println(res);

  }

  public static int pivot(int[] arr){
    
    int start = 0;
    int end = arr.length-1;
    while(start <= end){
      int mid = (start+end)/2;
      if(mid < end && arr[mid] > arr[mid+1]){
        return mid;
      }
      if(mid > start && arr[mid-1] > arr[mid]){
        return mid - 1;
      }
      if(arr[start] > arr[mid]){
        end = mid - 1;
      }else{
        start = mid + 1;
      }
    }
    return -1;
  }

  public static int binarySearch(int[] arr,int target,int start,int end){

    while(start <= end){
      int mid = (start+end)/2;
      if(arr[mid] == target){
        return mid;
      }else if(arr[mid] > target){
        end = mid - 1;
      }else{
        start = mid + 1;
      }
    }
    return -1;
  }


}