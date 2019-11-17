package com.bit.operation;

import com.bit.book.BookList;

public class DisplayOperation implements IOperation {
    @Override
    public void work(BookList bookLists) {
        for (int i = 0; i < bookLists.getSize(); i++) {
            System.out.println(bookLists.books[i].toString());
        }
    }
}
