import java.util.Arrays;

/**
 * 描述:希尔排序
 */
public class ShellSort {
    public static void main(String[] args) {
        int[] arr = new int[]{6, 8, 3, 4, 1, 9, 0, 12, 7, 5};
        System.out.println(Arrays.toString(arr));
        shellSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void shellSort(int[] arr) {
        int d = arr.length/2;
        while (true){
            for (int i = 0; i < d; i++) {
                for (int j = i; j+d < arr.length ; j+=d) {
                    for (int k = i; d+k <arr.length ; k+=d) {
                        if (arr[k] > arr[k+d]) {
                            int tmp = arr[k];
                            arr[k] = arr[k+d];
                            arr[k+d] = tmp;
                        }
                    }
                }
            }
            if (d==1) {
                break;
            }
            d--;
        }
    }
}
