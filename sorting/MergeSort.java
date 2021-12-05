import java.util.*;

public class MergeSort {
    public static void main(String[] args){

        // int[] arr = {7,6,5,4,3,2,1};
        int[] arr = {8,11,5,2,9,16,20};
        System.out.println(Arrays.toString(arr));
        int[] mergeArr = mergeSort(arr);
        System.out.println(Arrays.toString(mergeArr));

    }

    private static int[] mergeSort(int[] arr) {
        if(arr.length == 1) return arr;

        int mid = arr.length/2;

        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left,right);
    }

    private static int[] merge(int[] left, int[] right) {
        int i = 0;
        int j = 0;
        int k = 0;
        
        int[] mix = new int[left.length + right.length];

        while(left.length > i && right.length > j){
            if(left[i] < right[j]){
                mix[k] = left[i];
                i++;
            }else{
                mix[k] = right[j];
                j++;
            }
            k++;
        }

        while(left.length > i){
            mix[k] = left[i];
            i++;
            k++;
        }

        while(right.length > j){
            mix[k] = right[j];
            j++;
            k++;
        }
        return mix;

    }
    
}
