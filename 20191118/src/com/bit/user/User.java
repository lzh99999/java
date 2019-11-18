package com.bit.user;


import com.bit.book.BookList;
import com.bit.operation.IOperation;

abstract public class User {
    protected String name;
    protected IOperation[] iOperations;

    abstract public int menu();
    abstract public void doOperation(int choice, BookList bookList);
}
