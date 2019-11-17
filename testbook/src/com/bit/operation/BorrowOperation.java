package com.bit.operation;

import com.bit.book.Book;
import com.bit.book.BookList;

public class BorrowOperation implements IOperation{
    @Override
    public void work(BookList bookLists) {
        System.out.println("BorrowOperation");
        System.out.println("输入需要借阅书籍的名称");
        String name = scanner.next();
        //不会从bookList-》进行删除-》isBorrowed true
        //1、找这本书 是否存在
        int i;
        for ( i = 0; i < bookLists.getSize(); i++) {
            if (bookLists.books[i].name.equals(name)) {
                break;
            }
        }
        if (i >= bookLists.getSize()) {
            System.out.println("没有此书");
            return;
        }
        //2、他是否被借出   false  可以借
        Book book = bookLists.getBooks(i);
        if (book.isBorrowed) {
            System.out.println("此书已经借出");
        }else {
            book.isBorrowed = true;
            System.out.println("成功借阅此书");
        }
    }
}
