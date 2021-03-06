package test;

import java.util.Random;
import java.util.Scanner;

public class test {
    //1. 根据年龄, 来打印出当前年龄的人是少年(低于18), 青年(19-28), 中年(29-55), 老年(56以上)
    public static void main1(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("请输入年龄: ");
        int age = in.nextInt();
        if (age < 18) {
            System.out.println("少年");
        } else if (age < 28) {
            System.out.println("青年");
        } else if (age < 55) {
            System.out.println("中年");
        } else {
            System.out.println("老年");
        }
        in.close();
    }

    //2. 判定一个数字是否是素数
    public static void main2(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("请输入数字: ");
        int number = in.nextInt();
        int a = 0;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                a = 1;
                break;
            }
        }
        if (a == 1) {
            System.out.println("该数不是素数");
        } else {
            System.out.println("该数是素数");

        }
        in.close();
    }

    //3. 打印 1 - 100 之间所有的素数
    public static int prime(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
               return 1;
            }
        }
        return 0;
    }

    public static void main3(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i == 1) {
                System.out.println(i);
                continue;
            } else {
                int b = prime(i);
                if (b == 0) {
                    System.out.println(i);
                }
            }
        }
    }

    //4. 输出 1000 - 2000 之间所有的闰年
    public static int leap (int year) {

        if (year % 4 == 0&&year % 100 != 0|| year % 400 == 0) {
            return 1;
        }
        return 0;
    }
    public static void main4(String[] args) {
        for (int i = 1000; i <=2000 ; i++) {
            int isleap = leap(i);
            if (isleap ==1) {
                System.out.println(i);
            }
        }
    }
//5. 输出乘法口诀表 9*9
    public static void main5(String[] args) {
        for (int i = 1; i <=9 ; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print(i+"*"+j+"="+(i*j)+"\t");
            }
            System.out.println(" ");
        }
    }
//6. 求两个正整数的最大公约数
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
//7. 计算1/1-1/2+1/3-1/4+1/5 …… + 1/99 - 1/100 的值
    public static void main7(String[] args) {
        double sum = 0;
        for (int i = 1; i <= 100; i++) {
            int flag = 1;
            if (i % 2 == 0) {
                flag = -flag;
            }
            sum += 1.0 / i * flag;
        }
        System.out.println("1/1-1/2+1/3-1/4+1/5 …… + 1/99 - 1/100的和为：" + sum);
    }
//8. 编写程序数一下 1到 100 的所有整数中出现多少个数字9。
    public static void main8(String[] args) {
        int count = 0;
        for (int i = 1; i <= 100 ; i++) {
            if (i % 10 ==0) {
                 count++;
            }
            int tep = i / 10;
            if (tep % 10 ==0) {
                count++;
            }
        }
        System.out.println(count);
    }
//9. 求出0～999之间的所有“水仙花数”并输出。
    public static void main9(String[] args) {
        for (int i = 0; i <1000 ; i++) {
            int tep1 = i % 10;
            int tep2 = (i / 10)% 10;
            int tep3 = (i / 100)% 10;
            if (Math.pow(tep1,3)+Math.pow(tep2,3)+Math.pow(tep3,3)==i) {
                System.out.println(i);
            }
        }
    }
/*10. 编写代码模拟三次密码输入的场景。 最多能输入三次密码，密码正确，提示“登录成功”,密码错误， 可以重新输
    入，最多输入三次。三次均错，则提示退出程序 */
    public static void main10(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("请输入六位数字密码： ");
        String answer = "123456";
        int count = 0;
        while(count<3) {
            String password = in.nextLine();
            if (answer.equals(password)) {
                System.out.println("登录成功！");
                break;
            }else {
                System.out.println("密码错误， 可以重新输入，最多输入三次！");
                count++;
            }
        }
         in.close();
    }
//11. 写一个函数返回参数二进制中 1 的个数
    public static void numberSum(int number) {
        int count =0;
        while(number != 0)
        {
            count += number & 0x01;
            number >>= 1;
        }

        System.out.println(count);
        }
    public static void main11(String[] args) {
        numberSum(8);

    }
//12. 获取一个数二进制序列中所有的偶数位和奇数位， 分别输出二进制序列。
    public static void main12(String[] args) {
        int number = 7;
        int x = number;
        System.out.print("奇数位：");
        while (number!= 0)
        {
            int p = number % 2;
            System.out.print(p+" ");
            number = number / 4;
        }
        System.out.println();
        System.out.print("偶数位：");
        x = x / 2;
        while (x!=0)
        {
            int p = x % 2;
            System.out.print(p + " ");
            x = x / 4;
        }

    }
 //13， 输出一个整数的每一位.
    public static void DigitSum(int num) {
        if(num>9){
            DigitSum( num/10);
        }
        System.out.print(num%10+" ");

    }
    public static void main13(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("请输入数字： ");
        int num = in.nextInt();
        DigitSum(num);
    }
//14. 完成猜数字游戏
    public static void main14(String[] args) {
        Scanner in = new Scanner(System.in);
        Random random = new Random();
        int answer = random.nextInt(100)+1;
        while (true) {
            System.out.print("请输入数字1-100： ");
            int num = in.nextInt();
            if (num > answer) {
                System.out.println("猜大了！");

            }else if (num == answer) {
                System.out.println("猜对了！");
                break;
            }else {
                System.out.println("猜小了！");
            }
        }
    }
}
