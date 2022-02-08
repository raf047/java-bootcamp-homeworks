package com.company.day5;

public class TestBook {
    public static void main(String[] args) {
        Author author = new Author("Hovhannes", "tumanyan1986@gmail.com", "male");
        Book book = new Book("Karyakner", author, 47);
        book.printAllInfo();
        book.printAuthorNameAndEmail();
        Book newBook = new Book("Katsin Akhper", author, 23);
        newBook.printAllInfo();

    }
}
