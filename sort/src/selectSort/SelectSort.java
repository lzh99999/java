package selectSort;

import java.util.Arrays;

public class SelectSort {
    public static void main(String[] args) {
        int[] arr={9,2,1,3,4,8,0,7};
        selectSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    private static void selectSort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            //无序[0,arr.length-i]
            //有序[arr.length-i,arr.length]
            int maxIndex=0;
            //一直找最大的数放在数组的最后
            for(int j=1;j<arr.length-i; j++){
                if(arr[j]>arr[maxIndex]){
                    maxIndex=j;
                }
            }
            wsap(arr,maxIndex,arr.length-i-1);
        }
    }

    private static void wsap(int[] arr, int i, int j) {
        int tep=arr[i];
        arr[i]=arr[j];
        arr[j]=tep;
    }
}
