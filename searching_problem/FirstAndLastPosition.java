import java.util.*;

class FirstAndLastPosition {
  public static void main(String[] args) {
    
    // Find First and Last Position of Element in Sorted Array
    // https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
    int[] arr = new int[] {2,4,4,4,4,6,9,11,11,11,12,14,20,36,48};
    int target = 11;
    int[] ans = {-1,-1};

    ans = searchRange(arr, target);
    System.out.println(Arrays.toString(ans)); 

  }

  public static int[] searchRange(int[] nums, int target) {

    int[] ans = {-1,-1};

    ans[0] = search(nums,target,true); // to cheak left side
    if(ans[0]!=-1){
      ans[1] = search(nums,target,false); // to check right side
    } 

    return ans;
  }

  public static int search(int[] nums,int target,boolean check){

    int start = 0;
    int end = nums.length-1;
    int ans = -1;
    while(start<=end){
      int mid = (start+end)/2;

      if(target>nums[mid]){
        start = mid+1;
      }else if(target<nums[mid]){
        end = mid-1;
      }else{
        ans = mid;
        if(check){
          end = mid-1;
        }else{
          start = mid+1;
        } 
      }
    }
    return ans;
  }

}