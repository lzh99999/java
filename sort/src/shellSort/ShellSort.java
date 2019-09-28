package shellSort;

import java.util.Arrays;

public class ShellSort {
    public static void main(String[] args) {
        int[] arr={2,4,1,6,5,7,9,8};
        shellSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void insertSortWithSpeed(int[] arr,int speed){
        for (int i=speed;i<arr.length;i++){
            int key = arr[i];
            int j;
            for(j=i-speed;j>=0&&key<arr[j];j-=speed){
                arr[j+speed]=arr[j];
            }
            arr[j+speed]=key;
        }

    }
    public static void shellSort(int[] arr){
        int speed =arr.length;
        while(true){
            speed=(speed/3)+1;
            //speed=speed/2;
            insertSortWithSpeed(arr,speed);
            if (speed==1){
                break;
            }
        }
    }
}
