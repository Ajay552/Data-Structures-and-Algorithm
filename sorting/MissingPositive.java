import java.util.*;

class MissingPositive {

  // https://leetcode.com/problems/first-missing-positive/submissions/

  public static void main(String[] args) {
    
    int[] arr = {2147483647,2147483646,2147483645,3,2,1,-1,0,-2147483648};
    System.out.println(sort(arr));

  }

  public static int sort(int[] arr){
    int i = 0;
    while(i<arr.length){
      int correctIndex = arr[i]-1;

      if(arr[i] <= arr.length && arr[i]>0 && arr[i] != arr[correctIndex]){
        swap(arr, i, correctIndex);
      }else{
        i++;
      }
    }

    for(int index = 0;index<arr.length;index++){
      if(arr[index] != index+1){
        return index+1;
      }
    }
    

    return arr.length+1;
  }

  public static void swap(int[] arr,int first,int second){
    int temp = arr[first];
    arr[first] = arr[second];
    arr[second] = temp;
  } 

}