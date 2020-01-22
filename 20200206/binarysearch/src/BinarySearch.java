/**
 * 描述:二分查找
 * 1，每次查找中间的元素，与key进行比较
 * 2，大于key，就从右边的区间找，再找中间元素，同理小于key。
 */
public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = new int[]{11, 22, 33, 44, 55, 66, 77, 88, 99};
        int ret = binarySearch(arr, 99);
        System.out.println(ret);
    }

    private static int binarySearch(int[] arr, int key) {
        int from = 0;
        int to = arr.length - 1;
        while (from <= to) {
            int mid = (from + to) / 2;
            if (arr[mid] > key) {
                to = mid - 1;
            } else if (arr[mid] < key) {
                from = mid + 1;
            } else {
                return mid;
            }
        }

        return -1;
    }
}
