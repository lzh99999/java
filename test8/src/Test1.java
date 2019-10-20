import java.util.Arrays;

public class Test1 {
    public static int binarySearch (int[] arr,int from,int to,int k) {
        int left = from;
        int right = to;
        int mid = (left + right) / 2;
        if (left < right) {
            if (arr[mid] > k ) {
                return binarySearch(arr, left, mid, k);
            } else if (arr[mid] == k ) {
                return mid;
            } else  {
                return binarySearch(arr, mid + 1, right, k);
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        System.out.println(binarySearch(arr,0,arr.length,2));
    }

    public static int binarySearch1 (int[] arr,int key) {
        int left = 0;
        int right = arr.length-1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] > key) {
               right = mid -1;
            }else if (arr[mid]== key) {
                return mid;
            }else {
                left = mid + 1;
            }

        }
        return -1;
    }
//    public static void main1(String[] args) {
//       int[] arr = {1,2,3,4,5};
//       if (binarySearch(arr,3) >= 0) {
//           System.out.println("存在此数 下标为：" + binarySearch(arr,3));
//       }else {
//           System.out.println("次数不存在");
//       }

//冒泡排序
    public static void bubbleSort(int[] arr) {
        boolean flg = false;
        for (int i = 0; i < arr.length-1; i++) {
            flg =false;
            for (int j = 0; j < arr.length-1-i; j++) {
                if (arr[j] > arr[j+1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                    flg = true;
                }
            }
            if (!flg) {
                return;
            }
        }
    }
    public static void main1(String[] args) {
      int[] arr = {3,1,2,7,12,9,6};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
