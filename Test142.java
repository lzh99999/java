import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextInt()) {
            int[] arr1 = new int[10];
            int n = 0;
            for(int i = 0;i< 10;i++) {
                arr1[i] = sc.nextInt();
                n+=arr1[i];
            }
            int a = 0;
            int[] arr = new int[n];
            for(int i =0;i<10;i++) {
                if(arr1[i] != 0) {
                    while(arr1[i]-- > 0) {
                        arr[a++] = i;
                    }
                }
            }
            Arrays.sort(arr);
            int i = 0;
            for(;i<n;i++) {
                if(arr[i] != 0) {
                    break;
                }
            }
            System.out.print(arr[i]);
            arr[i] = -1;
            for(int j = 0;j<n;j++) {
                if(arr[j] != -1) {
                    System.out.print(arr[j]);
                }
            }
        }
    }
}