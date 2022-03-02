package com.company.day19.task2;

public class TaxAccounting extends Accounting {

    @Override
    protected int account() {
        System.out.println("TaxOfCompany of " + this.departmentName + " is: " + this.countOfEmployers * 7);
        return this.countOfEmployers * 7;
    }
}
