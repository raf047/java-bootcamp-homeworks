package com.company.day19.task2;

public class FinancialAccount extends TaxAccounting {
    @Override
    protected int account() {
        System.out.println("salaryOfEmployers of " + this.departmentName + " is: " + this.countOfEmployers * 3);
        return this.countOfEmployers * 3;
    }
}
