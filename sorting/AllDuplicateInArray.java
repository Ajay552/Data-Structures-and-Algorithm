import java.util.*;

class AllDuplicateInArray {
// https://leetcode.com/problems/find-all-duplicates-in-an-array/
  public static void main(String[] args) {


    int[] arr = {4,3,2,7,8,2,3,1};
  
    System.out.println(sort(arr));

  }

  public static List<Integer> sort(int[] arr){
    int i = 0;
    while(i<arr.length){
      int correctIndex = arr[i]-1;
      if(arr[i] != arr[correctIndex]){
        swap(arr, i, correctIndex);
      }else{
        i++;
      }
    }
    
    List<Integer> items = new ArrayList<Integer>();
    for(int index=0;index<arr.length;index++){
      if(arr[index] != index+1){
        items.add(arr[index]);
      }
    }

    return items;
  }

  public static void swap(int[] arr,int first,int second){
    int temp = arr[first];
    arr[first] = arr[second];
    arr[second] = temp;
  } 

}