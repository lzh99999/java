package com.bit.operation;

import com.bit.book.BookList;

public class DelOperation implements IOperation{
    @Override
    public void work(BookList bookList) {
        System.out.print("输入要删除的书籍：");
        String name = scanner.nextLine();
        for (int i = 0; i < bookList.getSize()-1; i++) {
            if (name.equals(bookList.books[i].name)) {
                bookList.books[i] = bookList.books[i+1];
            }
        }
        bookList.setSize(bookList.getSize()-1);
        System.out.println("删除书籍成功！");
    }
}
