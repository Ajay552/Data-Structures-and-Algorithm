import java.util.*;

class FindMountainInArray {
  public static void main(String[] args) {
    
    // https://leetcode.com/problems/find-in-mountain-array/
    
    // int[] arr = new int[] {1,2,3,4,5,3,1};
    int[] arr = {0,2,3,4,2,1};
    // int[] arr = {3, 5, 6, 7, 9, 10, 6, 5, 3};
    // int[] arr = {1,2,1};
    int target = 4;
    System.out.println(search(arr,target)); 

  }

  public static int search(int[] nums,int target){

    int start = 0;
    int end = nums.length-1;
    while(start<end){
       int mid = start + (end - start)/2;
      if(nums[mid]>nums[mid+1]){
        end = mid;
      }else if(nums[mid]<nums[mid+1]){
        start = mid+1;
      }
     }
    //  System.out.println(start);
     int res = binary(nums,target,0,end); // search left of the peak element
     if(res==-1){
      //  System.out.println(res);
       res = binary(nums, target, start+1, nums.length-1); // search right of the peak element
     }
    return res; // both start and end pointing at ans so can return any
  }

  public static int binary(int []nums,int target,int start,int end){
    boolean check = false;
    if(nums[start]>nums[start+1]){
      check = true;
    }
    while(start<=end){
       int mid = start + (end - start)/2;

       if(target == nums[mid]) return mid; 

      if(check){              // after peak array is decending 
        if(nums[mid]>target){
          start = mid+1;
        }else{
          end = mid-1;
        }
      }else{                  // befor peak array ascending
        if(nums[mid]>target){
          end = mid-1;
        }else{
          start = mid+1;
        }
      }
      
    }
    return -1;
  }

}