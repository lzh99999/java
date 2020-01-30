import java.util.Arrays;

/**
 * 描述:冒泡排序（从小到大）
 * 1,从前向后遍历，如果arr[i] > arr[i+1]  进行交换
 * 2，每次交换的次数减一
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = new int[]{55, 22, 11, 77, 44, 32, 88, 99};
        System.out.println(Arrays.toString(arr));
        System.out.println("--------------------------------------");
        arr = bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static int[] bubbleSort(int[] arr) {
        //控制循环次数 进行arr.length-1 次
        for (int i = 0; i < arr.length - 1; i++) {
            //每次交换的元素个数
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int t = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = t;
                }
                System.out.println(Arrays.toString(arr));
            }
            System.out.println("----------------------");
        }
        return arr;
    }
}
