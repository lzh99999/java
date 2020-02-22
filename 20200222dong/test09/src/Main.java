import java.util.Scanner;

/**
 * 描述:第一行两个数n和m，表示学生数和图画数；
 * 　　接下来是一个n*m的01矩阵A：
 * 　　如果aij=0，表示学生i觉得第j幅画是小朋友画的；
 * 　　如果aij=1，表示学生i觉得第j幅画是梵高画的。
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int sum = 0;
        int [][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
          for (int i = 0; i < n-1; i++) {
              for (int j = i + 1; j < n; j++) {
                  boolean flag = true;
                  for (int x = 0; x < m; x++) {
                      if (arr[i][x] == arr[j][x]) {
                          flag = false;
                          break;
                      }
                  }
                  if (flag) {
                      sum++;
                  }
              }
          }
        System.out.println(sum);
    }
}
