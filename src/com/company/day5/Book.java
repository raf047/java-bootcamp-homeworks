package com.company.day5;

public class Book {
    String name;
    Author author;
    double price;

    public Book(String name, Author author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    /**
     * print Book all information
     */
    public void printAllInfo(){
        System.out.println("Name: " + this.name + ", Author name: " + this.author.name + ", Author Email: "+ this.author.email + ", Author Gender: " + this.author.gender + ", price: " + this.price + "$");
    }

    /**
     * print author name and email
     */
    public void printAuthorNameAndEmail(){
        System.out.println("Author name: " + this.author.name + ", Author Email: "+ this.author.email);
    }
}
