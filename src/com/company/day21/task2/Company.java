package com.company.day21.task2;

public abstract class Company {
    private String companyName;
    private int workerCount;

    public Company(String companyName, int workerCount) {
        this.companyName = companyName;
        this.workerCount = workerCount;
    }

    public abstract int countAvgSalary(int[] salary);

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public int getWorkerCount() {
        return workerCount;
    }

    public void setWorkerCount(int workerCount) {
        this.workerCount = workerCount;
    }
}
