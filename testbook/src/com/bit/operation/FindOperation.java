package com.bit.operation;

import com.bit.book.BookList;

public class FindOperation implements IOperation {
    @Override
    public void work(BookList bookLists) {
        System.out.println("输入查找书籍的名称");
        String name = scanner.next();
        //不会从bookList-》进行删除-》isBorrowed true
        //1、找这本书 是否存在
        int i;
        for ( i = 0; i < bookLists.getSize(); i++) {
            if (bookLists.books[i].name.equals(name)) {
                System.out.println(bookLists.books[i].toString());
                break;
            }
        }
        if (i >= bookLists.getSize()) {
            System.out.println("没有此书");
            return;
        }
        System.out.println("书籍查找成功");
    }
}
