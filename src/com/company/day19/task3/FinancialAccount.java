package com.company.day19.task3;

public class FinancialAccount extends TaxAccounting {

    @Override
    protected int account() {
        System.out.println("Financial account");
        return 47000 * countOfEmployers;
    }
}
