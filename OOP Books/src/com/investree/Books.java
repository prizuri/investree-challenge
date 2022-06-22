package com.investree;

public class Books {
    public static void main(String[] args) {
        ReadingBooks readingBooks=new ReadingBooks("Adventure","JK.Rowling",487);
        readingBooks.open();
        readingBooks.annotate();
        readingBooks.read();
        readingBooks.close();
        readingBooks.hold();
    }
}
