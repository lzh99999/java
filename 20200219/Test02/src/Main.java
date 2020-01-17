import java.util.Arrays;

/**
 * 描述:直接插入排序
 */
public class Main {
    public static void main(String[] args) {
        int[] arr = new int[]{2,1,7,5,87,45,98,23,45};
        System.out.println(Arrays.toString(arr));
        insertSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void insertSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int tmp = arr[i];
            int j;
            for (j = i - 1; j >= 0; j--) {
                if (tmp < arr[j]) {
                    arr[j + 1] = arr[j];
                }else {
                    break;
                }
            }
            arr[j+1] = tmp;
        }
    }
}
