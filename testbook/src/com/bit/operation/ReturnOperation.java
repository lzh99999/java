package com.bit.operation;

import com.bit.book.Book;
import com.bit.book.BookList;

public class ReturnOperation implements IOperation {
    @Override
    public void work(BookList bookLists) {
        System.out.println("输入需要归还书籍的名称");
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
            book.isBorrowed = false;
            System.out.println("此书成功归还");
        }else {

            System.out.println("此书归还失败");
        }
    }
}
