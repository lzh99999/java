//输出一行，包含一个实数，四舍五入保留小数点后7位，表示圆的面积。 
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();
        double area = 0;
        area = n * n * Math.PI;
        System.out.printf("%.7f",area);
    }
}
