package com.bit.operation;

import com.bit.book.BookList;

public class ExitOperation implements IOperation{
    @Override
    public void work(BookList bookLists) {
        System.out.println("结束程序");
        System.exit(0);
    }
}
