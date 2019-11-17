package com.bit.user;

import com.bit.book.BookList;
import com.bit.operation.IOperation;


abstract public class User {
    protected String name;
    protected IOperation[] iOperations;

    public abstract int menu();
    public abstract void doOperation(int choice, BookList bookLists);
}
