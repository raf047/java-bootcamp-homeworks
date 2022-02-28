package com.company.day18;

public class Homework0228 {
    public static void main(String[] args) {

//        System.out.println(PersonValidator.isValidName(6, 20, "dfasdfsd"));
//        System.out.println(PersonValidator.isValidAge(3));
//        System.out.println(PersonValidator.isValidGender("femaale"));
//        System.out.println(PersonValidator.isValidPassportId("A4474747"));

        String firstName = "Jack";
        String lastName = "Hamilton";
        String passportId = "AN474747";
        int age = 47;
        String gender = "Male";
        String nationality = "USA";

        Person person = new Person();
        if (PersonValidator.isValidName(3, 15, firstName)){
            person.setFirstName(firstName);
        }
        if (PersonValidator.isValidName(6, 20, lastName)){
            person.setLastName(lastName);
        }
        if (PersonValidator.isValidPassportId(passportId)){
            person.setPassportId(passportId);
        }
        if (PersonValidator.isValidAge(age)){
            person.setAge(age);
        }
        if (PersonValidator.isValidGender(gender)){
            person.setGender(gender);
        }
        person.setNationality(nationality);


    }
}
