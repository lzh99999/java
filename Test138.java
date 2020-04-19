import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextInt()) {
            int r = sc.nextInt();
            int l = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();
            int[][] array = new int[r][l];
            int tmp = 1;
                int left = 0;
                int right = l-1;
                int up = 0;
                int down = r-1;
                while (left <= right && up <= down) {
                    for (int i = left; i <= right; i++) {
                        array[up][i] = tmp++;
                    }
                    for (int i = up+1; i <= down; i++) {
                        array[i][right] = tmp++;
                    }
                    if(up<down) {
                        for (int i = right - 1; i >= left; i--) {
                            array[down][i] = tmp++;
                        }
                    }
                    if(left < right) {
                        for (int i = down - 1; i > up; i--) {
                            array[i][left] = tmp++;
                        }
                    }
                    left++;
                    right--;
                    up++;
                    down--;
                }
            System.out.println(array[a-1][b-1]);
        }
    }
}