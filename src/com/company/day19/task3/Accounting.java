package com.company.day19.task3;

public class Accounting extends ItCompany {
    protected String departmentName;

    @Override
    protected int account() {
        System.out.println("Accounting account");
        return this.countOfEmployers * 7;
    }
}
