import java.util.*;

class cycleSort {
  public static void main(String[] args) {

    int[] arr = {3,5,2,1,4};
    sort(arr);
    System.out.println();
    System.out.println("Sorted Array");
    System.out.println(Arrays.toString(arr));

  }

  public static void sort(int[] arr){
    int i = 0;
    while(i<arr.length){
      int correctIndex = arr[i] - 1;
      if(arr[i] != arr[correctIndex]){
        swap(arr,i,correctIndex);
      }else{
        i++;
      } 
      System.out.println(i+" "+Arrays.toString(arr));
    }
  }

  public static void swap(int[] arr,int first,int second){
    int temp = arr[first];
    arr[first] = arr[second];
    arr[second] = temp;
  } 

}