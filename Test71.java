import java.util.Scanner;

/**
 * ����:��һ��������n��m����ʾѧ������ͼ������
 * ������������һ��n*m��01����A��
 * �������aij=0����ʾѧ��i���õ�j������С���ѻ��ģ�
 * �������aij=1����ʾѧ��i���õ�j��������߻��ġ�
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
