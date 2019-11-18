package com.bit.operation;

import com.bit.book.BookList;

public class ReturnOperation implements IOperation{
    @Override
    public void work(BookList bookList) {
        System.out.print("输入要归还的书籍：");
        String name = scanner.nextLine();
        for (int i = 0; i < bookList.getSize(); i++) {
            if (name.equals(bookList.books[i].name)) {
                bookList.books[i].isBorrow = false;
                System.out.println("成功归还此书！");
                return;
            }
        }
        System.out.println("此书归还失败！");
    }
}
