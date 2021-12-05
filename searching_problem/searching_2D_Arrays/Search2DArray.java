import java.util.*;

class Search2DArray {
  public static void main(String[] args) {

    System.out.println("Hello World");   
    int[][] arr = {
              {10,20,30,40},
              {15,25,35,45},
              {28,29,37,49},
              {33,34,38,50}
    };

    int target = 35;

    System.out.println(Arrays.toString(search(arr, target)));

  }

   public static int[] search(int[][] mat,int target){
    int row = 0;
    int col = mat.length-1;
    
    while(row <= mat.length-1 && col >= 0){
      if(mat[row][col] == target){
        return new int[]{row,col};
      }else if(mat[row][col] > target){
        col--;
      }else{
        row++;
      }
      // System.out.println(row+" "+col);
    }
    return new int[]{-1,-1};
  }


}