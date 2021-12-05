class BinarySearch {
    public static void main(String[] args) {
  
      int[] arr = {1,4,7,9,22,27,30,39,46,60,83,95};
      int target = 83;
      System.out.println(search(arr, target, 0, arr.length-1));
    }
  
    public static int search(int[] arr,int target,int start,int end){
         
        int mid = (start+end)/2;
        if(start > end) return -1;

        if(arr[mid] == target){
          return mid;
        }
        if(arr[mid] < target){
          return search(arr,target,mid+1,end);
        }else{
          return search(arr,target,start,mid-1);
        }
    }
  
  }