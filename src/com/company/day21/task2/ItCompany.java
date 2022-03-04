package com.company.day21.task2;

import java.util.Arrays;

public class ItCompany extends Company {

    public ItCompany(String companyName, int workerCount) {
        super(companyName, workerCount);
    }

    @Override
    public int countAvgSalary(int[] salary) {
        int salaryAmount = 0;
        for (int value : salary) {
            salaryAmount += value;
        }
        return salaryAmount / this.getWorkerCount();
    }

    public void designApplication(String department){
        System.out.println(department + " do his work");
    }

    public void designApplication(int workerCount, String[] departments){
        System.out.println(workerCount + " workers of " + Arrays.toString(departments) + " design application ");
    }



}
