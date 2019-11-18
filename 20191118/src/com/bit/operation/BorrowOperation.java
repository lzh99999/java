package com.bit.operation;

import com.bit.book.BookList;

public class BorrowOperation implements IOperation{
    @Override
    public void work(BookList bookList) {
        System.out.print("输入要借阅的书籍：");
        String name = scanner.nextLine();
        for (int i = 0; i < bookList.getSize(); i++) {
            if (name.equals(bookList.books[i].name)) {
                bookList.books[i].isBorrow = true;
                System.out.println("成功借阅此书！");
                return;
            }
        }
        System.out.println("此书已被借阅，借阅失败！");
    }
}
