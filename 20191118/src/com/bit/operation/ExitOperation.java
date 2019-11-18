package com.bit.operation;

import com.bit.book.BookList;

public class ExitOperation implements IOperation{
    @Override
    public void work(BookList bookList) {
        System.out.println("程序结束！");
        System.exit(0);
    }
}
