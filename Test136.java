import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        while (count-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] arr = new int[2*n];
            for (int i = 0; i < 2*n; i++) {
                arr[i] = sc.nextInt();
            }
            while (k-- >0) {
                fun(arr,n);
            }
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i]);
                if(i!=arr.length-1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    private static void fun(int[] array,int n) {
       int[] tmp = new int[n*2];
       System.arraycopy(array,0,tmp,0,2*n);
       int count = 0;
       int i = 0;
       int j = n;
       while (n-- > 0) {
           array[count++] = tmp[i++];
           array[count++] = tmp[j++];
       }
    }
}