import java.util.*;

class InsertionSort {
  public static void main(String[] args) {

    int[] arr = {3,1,5,4,2,23,12,16};
    // int[] arr = {5,4,3,2,1};

    System.out.println(Arrays.toString(sort(arr)));

  }

  public static int[] sort(int[] arr){
    for(int i=0;i<arr.length-1;i++){
      for(int j=i+1;j>0;j--){
        if(arr[j] < arr[j-1]){
          swap(arr,j,j-1);
        }else{
          break;
          }

          System.out.println(i+" "+Arrays.toString(arr));
      }
    }
    System.out.println();
    System.out.println("Sorted Array");
    return arr;
  }

  public static void swap(int[] arr,int first,int second){
    int temp = arr[first];
    arr[first] = arr[second];
    arr[second] = temp;
  } 

}