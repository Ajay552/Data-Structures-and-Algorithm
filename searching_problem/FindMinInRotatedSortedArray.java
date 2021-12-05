// Still need to check for other test case ex:[2,1]
class FindMinInRotatedSortedArray {
  public static void main(String[] args) {
    
    //https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/
    
    // int[] arr = {12,13,1,2,3,4,5,6,7,8};
    int[] arr = {2,4,10,-7,-3};
    // int[] arr = {3,2,1};
    // int[] arr = {0,2,3,4,2,1};
    // int[] arr = {3, 5, 6, 7, 9, 10, 6, 5, 3};
    // int[] arr = {1,2,1};
    // int[] arr = {5,6,7,1,2,3,4};
    // int target = 1;
    System.out.println(0>1);
    System.out.println(arrRotatedIndex(arr)); 

  }

  public static int arrRotatedIndex(int[] arr){
    int start = 0;
    int end = arr.length-1;
    if(arr.length == 1) return arr[0];
    while(start<=end){
      int mid = (start+end)/2;
      int next = (mid+1)%arr.length;
      int prev = (mid+arr.length-1)%arr.length;

      if(arr[start]<arr[mid] && arr[mid]<arr[end]) return arr[0];
      if(arr[mid]<arr[next] && arr[mid]<arr[prev]){
        return mid;
      }else if(arr[start]<=arr[mid]){
        start = mid;
      }else{
        end = mid;
      }
    }
    
    return -1;
  }

}