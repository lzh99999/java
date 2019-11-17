package com.bit;

import com.bit.book.BookList;
import com.bit.user.Admin;
import com.bit.user.NormalUser;
import com.bit.user.User;

import java.util.Scanner;

public class Main {
    public static User login() {
        System.out.println("你的名字");
        Scanner in = new Scanner(System.in);
        String name = in.next();
        System.out.println("管理员输入1，普通人输入0");
        int who = in.nextInt();
        if (who == 1) {
            return new Admin(name);
        }else {
            return new NormalUser(name);
        }
    }
    public static void main(String[] args) {
        BookList bookList = new BookList();//3本书
        User user = login();
        while (true){
            int choice = user.menu();
            user.doOperation(choice,bookList);
        }
    }
}
