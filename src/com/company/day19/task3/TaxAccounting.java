package com.company.day19.task3;

public class TaxAccounting extends Accounting {

    @Override
    protected int account() {
        System.out.println("TaxAccounting account");
        return this.countOfEmployers * 2;
    }
}
