import java.util.Arrays;

public class Test {

    public static int maxArray (int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }
    public static int minArray (int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }
    public static double aveArray (int[] arr) {
        double num = 0;
        for (int i = 0; i < arr.length; i++) {
              num += arr[i];
        }
        double ave = num/arr.length;
        return ave;
    }
    public static int[] nizhi (int[] arr) {
        for (int i = 0; i < arr.length/2; i++) {
            int tep = arr[arr.length-1-i];
            arr[arr.length-1-i] = arr[i];
            arr[i] = tep;
        }
        return arr;
    }
    public static void main2(String[] args) {
        int[] arr = {1,2,3,4,5};
        int[] nizhi = nizhi(arr);
        System.out.println("最大值："+maxArray(arr));
        System.out.println("最小值："+minArray(arr));
        System.out.println("平均值："+aveArray(arr));
        System.out.println("逆置"+Arrays.toString(nizhi));
    }
    public static String toString (int[] array) {
        String str = "[";
        for (int i = 0; i <array.length ; i++) {
            str += array[i];
            if (i != array.length-1) {
                str += ",";
            }
        }
        str += "]";
        return str;
    }
    public static int[] towAr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] * 2;
        }
        return arr;
    }
    public static void main1(String[] args) {
    int[] arr = {1,2,3,4,5};
        System.out.print(Arrays.toString(arr));
        int[] ret = towAr(arr);
        System.out.println();
        System.out.print(toString(ret));

    }
}
