package com.company.day19.task3;

public class ItCompany {
    protected int countOfEmployers;
    protected String companyName;

    protected int account(){
        System.out.println("It company account");
        return this.countOfEmployers * 4;
    }
}
