package com.company.day5;

public class Author {
    String name;
    String email;
    String gender;

    public Author(String  name, String email, String gender){
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    /**
     * print Author information
     */
    public void printInfo() {
        System.out.println("Name: " + this.name + ", Email: "+ this.email + ", Gender: " + this.gender);
    }
}
