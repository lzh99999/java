/*考虑如下的序列生成算法：从整数 n 开始，如果 n 是偶数，把它除以 2；如果 n 是奇数，
 把它乘 3 加1。用新得到的值重复上述步骤，直到 n = 1 时停止。例如，n = 22 时该算法生成的序列是：
22，11，34，17，52，26，13，40，20，10，5，16，8，4，2，1
人们猜想（没有得到证明）对于任意整数 n，该算法总能终止于 n = 1。
 这个猜想对于至少 1 000 000内的整数都是正确的。
对于给定的 n，该序列的元素（包括 1）个数被称为 n 的循环节长度。
 在上述例子中，22 的循环节长度为 16。输入两个数 i 和 j，
 你的任务是计算 i 到 j（包含 i 和 j）之间的整数中，循环节长度的最大值。*/
import java.util.Scanner;
public class _3nPlus1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int i = sc.nextInt();
            int j = sc.nextInt();
            int a = i;
            int b = j;
            //一直让a为a和b中的较小值
            if (i > j) {
                a = j;
                b = i;
            }
            int max = -1;
            for (int k = a; k <= b; k++) {
                int sum = f(k);
                if (sum > max) {
                    max = sum;
                }
            }
            System.out.println(i + " " + j + " " + max);
        }
    }

//循环节长度
    static int f(long k) {

        int count = 1;

        while (k != 1) {

            if ((k & 1) == 0) {

                k /= 2;

            } else {

                k = k * 3 + 1;

            }

            count++;

        }

        return count;

    }

}