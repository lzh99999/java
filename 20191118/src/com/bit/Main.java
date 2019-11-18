package com.bit;

import com.bit.book.BookList;
import com.bit.user.Admin;
import com.bit.user.NormalUser;
import com.bit.user.User;

import java.util.Scanner;

public class Main {
    private static User creat(int a,String name) {
        if (a == 0) {
            return new Admin(name);
        }else {
            return new NormalUser(name);
        }
    }
    public static void main(String[] args) {
        BookList bookList = new BookList();
        Scanner in = new Scanner(System.in);
        System.out.print("请输入你的名字：");
        String name = in.nextLine();
        System.out.print("管理员输入数字0，普通输入数字1：");
        int a = in.nextInt();
        while (true) {
            User user = creat(a,name);
            int choice = user.menu();
            user.doOperation(choice,bookList);
        }
    }
}
