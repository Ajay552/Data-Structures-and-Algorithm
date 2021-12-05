import java.util.*;

class MissingNumber {
  // https://leetcode.com/problems/missing-number/
  public static void main(String[] args) {

    // int[] arr = {3,5,1,2,0};
    int[] arr = {9,6,4,2,3,5,7,0,1};
    int res = sort(arr);
    System.out.println();
    System.out.println("Missing number is");
    // System.out.println(Arrays.toString(arr));
    System.out.println(res);

  }

  public static int sort(int[] arr){
    int i = 0;
    while(i<arr.length){
      int correctIndex = arr[i];
      if(arr[i]<arr.length && arr[i] != arr[correctIndex]){
        swap(arr,i,correctIndex);
        System.out.println(i+" "+Arrays.toString(arr));
      }else{
        i++;
      }

      for(int j=0;j<arr.length;j++){
        if(arr[j] != j) return j;
      }
    }
    return arr.length;
  }

  public static void swap(int[] arr,int first,int second){
    int temp = arr[first];
    arr[first] = arr[second];
    arr[second] = temp;
  } 

}