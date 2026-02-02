package com.library.model;

public class BorrowRecord {
    private Book book;        // reference type
    private int days;         // primitive

    private static int totalBorrowed = 0;

    public BorrowRecord(Book book, int days) {
        setBook(book);
        setDays(days);

        book.markBorrowed();
        totalBorrowed++;
    }

    public Book getBook() {
        return book;
    }

    private void setBook(Book book) {
        // TODO: book must not be null
        // TODO: book must be available
        if(book == null || !book.isAvailable()) {
            throw new IllegalArgumentException("Book cannot be null");
        }
        this.book = book;
    }
    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        // TODO: days must be > 0
        if(days <= 0) {
            throw new IllegalArgumentException("Days must be greater than 0");
        }
        this.days = days;
    }

    public static int getTotalBorrowed() {
        return totalBorrowed;
    }

    public void returnBook() {
        // TODO:
        // mark book as returned
        book.markReturned();
        totalBorrowed--;
    }
}
