import java.util.*;

class SelectionSort {
  public static void main(String[] args) {
    int[] arr = {3,1,5,4,2,23,12,16};
    // int[] arr = {5,4,3,2,1};
    
    System.out.println(Arrays.toString(sort(arr)));

  }

  public static int[] sort(int[] arr){
    for(int i=0;i<arr.length;i++){
      int last = arr.length-i-1;
      int max = findMaxIndex(arr,0,last);
      swap(arr, max, last);
      System.out.println(i+" "+Arrays.toString(arr));
    }
    System.out.println();
    System.out.println("Sorted array");
    return arr;
  }

  public static int findMaxIndex(int[] arr,int start,int last){
    int max = start;
    for(int i=0;i<=last;i++){
      if(arr[max] < arr[i]) max = i;
    }
    return max;
  }

  public static void swap(int[] arr,int first,int second){
    int temp = arr[first];
    arr[first] = arr[second];
    arr[second] = temp;
  }

  public static int[] bubbleSort(int[] arr){
    boolean swapped;
    for(int i = 0;i<arr.length;i++){
      swapped = false;
      for(int j=i;j<arr.length-i-1;j++){
        if(arr[j]>arr[j+1]){
          int temp = arr[j];
          arr[j] = arr[j+1];
          arr[j+1] = temp;
          swapped = true;
        }
        System.out.println(arr.length-i-1);
      }
      if(!swapped) break;
      System.out.println(i+" "+Arrays.toString(arr));
    }
    return arr;
  } 

}