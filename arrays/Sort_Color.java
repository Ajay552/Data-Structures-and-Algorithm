// https://leetcode.com/problems/sort-colors/
public class Sort_Color{
    class Solution {
    public void sortColors(int[] arr) {
          
          int n = arr.length;
          int mid = 0,low = 0,high = n-1;
          while(mid <= high){
            if(arr[mid] == 0){
              swap(arr,mid,low);
              mid++;
              low++;
            }else if(arr[mid] == 1){
              mid++;
            }else{
              swap(arr,mid, high);
              high--;
            }
          }

          System.out.println(Arrays.toString(arr));

        }

        public static void swap(int[] arr,int a,int b){
          int temp = arr[a];
          arr[a] = arr[b];
          arr[b] = temp;
        }
    }

}