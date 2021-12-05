import java.util.*;

class bubbleSort {
  public static void main(String[] args) {
  
    int[] arr = {3,1,5,4,2,23,12,16};

    System.out.println(Arrays.toString(sort(arr)));

  }

  public static int[] sort(int[] arr){
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
      }
      if(!swapped) break;
    }
    return arr;
  } 

}