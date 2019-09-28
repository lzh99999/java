package heapSort;

import java.util.Arrays;
public class HeapSort {
    public static void main(String[] args) {
        int[] arr={2,3,2,1,7,8,5,5,4};
        heapSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    //堆排序
    public static void heapSort(int[] arr){
        for (int i = (arr.length-1-1)/2; i >=0 ; i--) {
            adjust(arr,i,arr.length-1);
        }
        //上面的代码执行完 整棵树变为大树根
        for (int j = 0; j <=arr.length-1 ; j++) {
            int tmp = arr[0];
            arr[0]=arr[arr.length-1-j];
            arr[arr.length-1-j]=tmp;
            adjust(arr,0,arr.length-1-j-1);
        }
    }
//变成大树根
    private static void adjust(int[] arr, int start, int end) {
        int tmp = arr[start];
        for (int i = start*2+1; i <=end ; i=i*2+1) {
            if((i<end)&&arr[i]<arr[i+1]){
                i++;//最大值下标
            }
            if (arr[i]>tmp){
                arr[start]=arr[i];
                start=i;
            }else if (arr[i]<tmp){

            }
            arr[start]=tmp;
        }
    }

}
