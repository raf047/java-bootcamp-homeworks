package com.company.day18;

public class Store {
    private int countOfWorkers;
    private String name;
    private String phoneNumber;
    private int[] productNumbers;

    public Store(int countOfWorkers, String name, String phoneNumber, int[] productNumbers) {
        this.countOfWorkers = countOfWorkers;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.productNumbers = productNumbers;
    }

    public int getCountOfWorkers() {
        return countOfWorkers;
    }

    public void setCountOfWorkers(int countOfWorkers) {
        this.countOfWorkers = countOfWorkers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int[] getProductNumbers() {
        return productNumbers;
    }

    public void setProductNumbers(int[] productNumbers) {
        this.productNumbers = productNumbers;
    }
}
