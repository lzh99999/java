

/*杨辉三角形又称Pascal三角形，它的第i+1行是(a+b)i的展开式的系数。
　　

它的一个重要性质是：三角形中的每个数字等于它两肩上的数字相加。
　　

下面给出了杨辉三角形的前4行：
　　

   1
　　

  1 1
　　

 1 2 1
　　

1 3 3 1
　　

给出n，输出它的前n行。*/

public class Main {
    //打印杨辉三角
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



