package com.bit.operation;
import com.bit.book.BookList;

public class DelOperation implements IOperation {
    @Override
    public void work(BookList bookLists) {
        System.out.println("输入需要删除书籍的名称");
        String name = scanner.next();
        //不会从bookList-》进行删除-》isBorrowed true
        //1、找这本书 是否存在
        int i= 0;
        for ( ; i < bookLists.getSize(); i++) {
            if (bookLists.books[i].name.equals(name)) {
                break;
            }
        }
        if (i >= bookLists.getSize()) {
            System.out.println("没有此书");
            return;
        }

        for (int j = i; j < bookLists.getSize()-1; j++) {
            bookLists.setBooks(j,bookLists.getBooks(j+1));
        }
        bookLists.setSize(bookLists.getSize()-1);
        System.out.println("删除成功");
    }
}
