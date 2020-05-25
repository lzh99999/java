import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            left(array,i);
            right(array,i);
        }
    }

    private static void right(int[] array, int i) {
        for (int j = i+1; j < array.length; j++) {
            if (array[j] < array[i]) {
                System.out.println(j);
                return;
            }
        }
        System.out.println(-1);
    }

    private static void left(int[] array,int i) {
        for (int j = i-1; j >=0 ; j--) {
            if (array[j] < array[i]) {
                System.out.print(j+" ");
                return;
            }
        }
        System.out.print(-1 +" ");
    }
}