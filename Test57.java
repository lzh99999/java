

/*����������ֳ�Pascal�����Σ����ĵ�i+1����(a+b)i��չ��ʽ��ϵ����
����

����һ����Ҫ�����ǣ��������е�ÿ�����ֵ����������ϵ�������ӡ�
����

�����������������ε�ǰ4�У�
����

   1
����

  1 1
����

 1 2 1
����

1 3 3 1
����

����n���������ǰn�С�*/

public class Main {
    //��ӡ�������
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == 0 || i == j) {
                    arr[i][j] = 1;
                }
            }
        }
        for (int i = 2; i < n; i++) {
            for (int j = 1; j <= i; j++) {
                arr[i][j] = arr[i - 1][j] + arr[i - 1][j - 1];
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}



