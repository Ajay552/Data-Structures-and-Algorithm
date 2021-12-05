class CheckSorted {
    public static void main(String[] args) {
  
      // CHECK IF ARRAY IS SORTED OR NOT
  
      int[] arr = {1,2,3,4,5,6,10,7};
  
      System.out.println(sorted(arr,0));
  
    }
  
    public static boolean sorted(int[] arr,int index){
      
      if(index == arr.length-1){
        return true;
      }
  
      return arr[index] < arr[index+1] && sorted(arr,index+1);
  
    }
  
  }