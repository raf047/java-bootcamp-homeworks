package com.company.day18;

public class Person {
    private String firstName;
    private String lastName;
    private String passportId;
    private int age;
    private String gender;
    private String nationality;

    public Person() {
    }

    public Person(String firstName, String lastName, String passportId, int age, String gender, String nationality) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.passportId = passportId;
        this.age = age;
        this.gender = gender;
        this.nationality = nationality;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", passportId='" + passportId + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", nationality='" + nationality + '\'' +
                '}';
    }

    public void display(){
        System.out.println(toString());
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPassportId() {
        return passportId;
    }

    public void setPassportId(String passportId) {
        this.passportId = passportId;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }
}
