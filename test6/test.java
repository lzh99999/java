public class Test { 
 public static void main6(String[] args) {
    Scanner in = new Scanner(System.in);
        System.out.print("请输入两个整数：");
    int num1 = in.nextInt();
    int num2 = in.nextInt();
    int temp1 = Math.max(num1,num2);//求出这两个数的最大值
    int temp2 = Math.min(num1,num2);//求出这两个数的最小值
    if (temp1 % temp2 ==0) {
        System.out.println(num1+"和"+num2+"的最大公约数为"+temp2);//说明最大公约数就是最小值
    }else {
        for (int i = temp2 - 1; i >0 ; i--) {
            if (temp1 % i ==0&&temp2 % i ==0) {
                System.out.println(num1+"和"+num2+"的最大公约数为"+i);
            }
        }
    }
    in.close();
    }
}