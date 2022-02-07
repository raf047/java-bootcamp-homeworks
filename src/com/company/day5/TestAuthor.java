package com.company.day5;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class TestAuthor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Author name: ");
        String name = scanner.next();
        System.out.println("Enter Author email: ");
        String email = scanner.next();
        System.out.println("Enter Author gender: ");
        String gender = scanner.next();

        Author author = new Author("Hovhannes", "tumanyan1986@gmail.com", "male");
        Author author1 = new Author(name, email, gender);
        author.printInfo();
        author1.printInfo();




    }



}
