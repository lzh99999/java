package com.bit.book;

import java.util.Arrays;

public class BookList {
    public Book[] books = new Book[10];
    public int size;
    public BookList() {
        books[0] = new Book("三国演义","罗贯中",13,"小说");
        books[1] = new Book("西游记","吴承恩",6,"小说");
        books[2] = new Book("水浒传","施耐庵",23,"小说");
        this.size = 3;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setBooks(int pos,Book book) {
        this.books[pos] = book;
    }

    public Book getBooks(int pos,Book book) {
        return books[pos];
    }
    @Override
    public String toString() {
        return "BookList{" +
                "books=" + Arrays.toString(books) +
                ", size=" + size +
                '}';
    }
}
