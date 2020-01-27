package usermarager;

import java.util.Scanner;

/**
 * 描述:
 */
public class Test {
    public static void main(String[] args) {
        UserMarager userMarager = new UserMarager();
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的选择：1，注册\t 2，登录\t 3，退出");
        int choice = sc.nextInt();
        if (choice == 1) {//选择注册
            System.out.println("请输入用户名：");
            String name = sc.next();
            System.out.println("请输入密码：");
            String psw = sc.next();
            userMarager.add(name,psw);
            System.out.println("注册成功！");
        }else if (choice == 2) {
            System.out.print("请输入用户名：");
            String name = sc.next();
            System.out.print("请输入密码：");
            String psw = sc.next();
            if (userMarager.isSuccess(name,psw)) {
                System.out.println("登录成功！");
            }else {
                System.out.println("登录失败！");
            }
        }else if (choice == 3) {
            System.out.println("退出成功！");
            System.exit(-1);
        }else {
            System.out.println("输入错误！");
        }
    }
}
