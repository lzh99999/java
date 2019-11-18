package com.bit.operation;

import com.bit.book.BookList;

public class FindOperation implements IOperation{
    @Override
    public void work(BookList bookList) {
        System.out.print("输入要查找的书籍：");
        String name = scanner.nextLine();
        for (int i = 0; i < bookList.getSize(); i++) {
            if (name.equals(bookList.books[i].name)) {
                System.out.println(bookList.books[i].toString());
                return;
            }
        }
        System.out.println("此书不存在！");
    }
}
