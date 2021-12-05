import java.util.*;

class AllNumbersDisappearedinArray {
// https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
  public static void main(String[] args) {

    // int[] arr = {3,5,1,2,4};
    int[] arr = {4,3,2,7,8,2,3,1};
    // int[] arr = {1};


    // int[] arr = {9,6,4,2,3,5,7,0,1};
    // int[] res = sort(arr);
    System.out.println(sort(arr));
    // System.out.println("Missing number is");
    // System.out.println(Arrays.toString(res));
    // System.out.println(res);

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
        items.add(index+1);
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