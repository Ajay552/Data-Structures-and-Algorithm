import java.util.*;
class FindAllIndex {
  public static void main(String[] args) {

    // Linear search all index  using recursion

    int[] arr = {1,4,8,10,21,27,12,44,21,53,16,19,21,49,73,11,6,13};

    search(arr,21,0);

    System.out.println(list);

  }

  static ArrayList<Integer> list = new ArrayList<>();

  public static void search(int[] arr,int target,int index){
    
    if(index == arr.length){
      return;
    }

    if(target == arr[index]) list.add(index);

    search(arr,target,index+1);

  }

}