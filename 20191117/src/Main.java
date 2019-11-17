import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[][] arr = new int[n][m];
        int count = 1;
        int i = 0;
        int j = 0;
        int q = 0;
        int r = in.nextInt();
        int c = in.nextInt();
        while (true) {
            if (count == n*m){
                break;
            }
            while (j < m-q&&count!=n*m) {
                arr[i][j] = count;
                count++;
                j++;
            }
            while (i < n-q&&count!=n*m) {
                arr[i+1][j-1] = count;
                count++;
                i++;
            }
            while (j-1 >= q&&count!=n*m) {
                arr[i-1][j-1] = count;
                count++;
                j--;
            }
            while (i-1 < n-q&&count!=n*m) {
                arr[i-1][j-1] = count;
                count++;
                i--;
            }
            q++;
        }
        System.out.println(arr[r][c]);
    }
}
