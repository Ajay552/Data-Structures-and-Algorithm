import java.util.*;

class SortedArrayInfinetElementsin {
  public static void main(String[] args) {
    
    // https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/
    
    int[] arr = {3, 5, 7, 9, 10, 90,
                100, 130, 140, 160, 170};
    int target = 10;
    System.out.println(ans(arr,target)); 

  }

  public static int ans(int[] nums, int target) {

    int start = 0;
    int end = 1;

    while(target>nums[end]){
      int temp = end + 1;
      end = end+(end-start+1)*2;
      start = temp;
    }
    System.out.println(start+" "+end);
    int ans = search(nums, target, start, end);

    return ans;
  }

  public static int search(int[] nums,int target,int start,int end){

    while(start<=end){
      int mid = (start+end)/2;

      if(target>nums[mid]){
        start = mid+1;
      }else if(target<nums[mid]){
        end = mid-1;
      }else{
        return mid;
        } 
      }
    return -1;
  }

}