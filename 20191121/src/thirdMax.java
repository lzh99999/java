public class thirdMax {
    public static void main(String[] args) {
        int[] arr = new int[]{ 2,4,13,4,5,7,6};
        int max = 0;
        int max2 = 0;

        int max3 = 0;
        for (int i = 0;i<arr.length;i++) {
            if (arr[i] == max||arr[i] == max2||arr[i] == max3) {
                continue;
            }
            if (arr[i] > max) {
                max3 = max2;
                max2 = max;
                max = arr[i];
            }else if (arr[i]>max2) {
                max3 = max2;
                max2 = arr[i];
            }else if (arr[i] > max3){
                max3 = arr[i];
            }
        }
        System.out.println(max +" "+max2 +" "+ max3);
    }
}
