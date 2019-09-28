package bubbleSort;

import java.lang.reflect.Array;
import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr={9,2,0,1,4,6,3};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void bubbleSort(int[] arr){
        for (int i = 0; i <arr.length-1 ; i++){
            for (int j = 0; j < arr.length-i-1; j++) {
                if(arr[j]>arr[j+1]){
                    swap(arr,j,j+1);
                }
            }

        }
    }

    private static void swap(int[] arr, int i, int j) {
        int tep =arr[i];
        arr[i]=arr[j];
        arr[j]=tep;
    }
}
