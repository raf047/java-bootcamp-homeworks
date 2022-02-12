package com.company.day8;

import java.util.Random;
import java.util.Scanner;

public class Homework0210 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        /* test ex1
        System.out.println("Enter Your age: ");
        int age = scanner.nextInt();
        isEligibleToVote(age);
         */

        /* test ex2
        System.out.println("Enter number: ");
        int num = scanner.nextInt();
        isEven(num);
         */

//         test ex3
//        System.out.println(generateRandomNumberBetween2To7());

//        isMultipleOf5(5);

//        System.out.println(greatestNumber(47,40,63));

        /* test ex 6
        float num = scanner.nextFloat();
        describeFloatNumber(num);
         */

        /* test ex
        System.out.println("Enter number");
        int num = scanner.nextInt();
        System.out.println(generateWeekday(num));
         */

//        printCanBuyKBalls(40);

//        printIsYearLeap(1000);

//        int num = random.nextInt();

//        printEqualsCount(1, 0, 47);

//        printAllDecisions(1, -6, 9);

    }

    /**
     * check is eligible to vote
     *
     * @param age
     * @return
     */
    public static void isEligibleToVote(int age) {
        if (age < 18) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }
    }

    /**
     * check the given number is even
     *
     * @param num
     * @return
     */
    public static void isEven(int num) {
        if (num % 2 == 0) {
            System.out.println("The number is even");
        } else {
            System.out.println("The number is odd");
        }
    }

    /**
     * generate random number between 2 to 7
     *
     */
    public static int generateRandomNumberBetween2To7() {
        double num = Math. random();
        return (int)(2 + num * 6);

    }

    public static void isMultipleOf5(int num) {
        if (num % 5 == 0) {
            System.out.println("The number is multiple of 5");
        } else {
            System.out.println("The number is not multiple of 5");
        }
    }

    /**
     * find greatest number
     *
     * @param num1
     * @param num2
     * @param num3
     * @return
     */
    public static int greatestNumber(int num1, int num2, int num3) {
        int max = num1;
        if (num2 > max) {
            max = num2;
        } else if (num3 > max) {
            max = num3;
        }
        return max;
    }

    /**
     * describing float number
     * @param num
     */
    public static void describeFloatNumber(float num) {
        if (num > 0) {
            if (num < 1) {
                System.out.println("Positive small number");
            } else if (num > 1000000) {
                System.out.println("Positive large number");
            } else {
                System.out.println("Positive number");
            }
        } else if (num < 0) {
            if (Math.abs(num) < 1) {
                System.out.println("Negative small number");
            } else if (Math.abs(num) > 1000000) {
                System.out.println("Negative large number");
            } else {
                System.out.println("Negative number");
            }
        } else {
            System.out.println("Zero");
        }

    }

    /**
     * generating number from 1 to 7 from given number
     * @param num
     * @return
     */
    public static String generateWeekday(int num){
        int newNum = 1 + num % 7;
        if (newNum == 1){
            return "Sunday";
        }else if (newNum == 2){
            return "Monday";
        }else if (newNum == 3){
            return "Tuesday";
        }else if (newNum == 4){
            return "Wednesday";
        }else if (newNum == 5){
            return "Thursday";
        }else if (newNum == 6){
            return "Friday";
        }else {
            return "Saturday";
        }
    }

    /**
     * checking can buy exactly K balls
     * @param k
     */
    public static void printCanBuyKBalls(int k){
        if (k == 1 || k == 2 || k == 4 || k == 7){
            System.out.println("Can not buy " + k + " balls");
        }else {
            System.out.println("Can buy " + k + " balls");
        }
    }

    /**
     * check and print is year leap
     * @param year
     */
    public static void printIsYearLeap(int year){
        if ((year % 4 == 0) && (year % 100 == 0) && (year % 400 == 0)){
            System.out.println(year + " is leap year");
        }else {
            System.out.println(year + " is not leap year");
        }
    }

    /**
     * check is num corresponds conditions
     * @param num
     * @return
     */
    public static boolean isCorrespondsConditions(int num){
        if ((num > -1000 && num < 1000) && (num % 3 == 0 || num % 5 == 0)){
            return true;
        }else {
            return false;
        }
    }

    /**
     * print odd or even values between input values
     * @param a
     * @param b
     */
    public static void printOddOrEvenValuesBetweenInputValues(int a, int b){
        if ((a % 7 == 0 || b % 7 == 0) && b > 0 && a > b){
            if (b % 2 == 0) b++;

            for (int i = b; i < a; i += 2) {
                System.out.println(i);
            }
        }else {
            int start = a;
            int end = b;
            if (a > b){
                start = b;
                end = a;
            }
            if (start % 2 == 1) start++;
            for (int i = start; i < end; i += 2) {
                System.out.println(i);
            }
        }
    }

    /**
     * print is 2 points on same quarter
     * @param x1
     * @param y1
     * @param x2
     * @param y2
     */
    public static void printIsOnSameQuarter(int x1, int y1, int x2, int y2){
        if (x1 * x2 > 0 && y1 * y2 > 0){
            System.out.println("Is on same quarter");
        }else {
            System.out.println("IS not on same quarter");

        }
    }

    /**
     * print is non-degenerate triangle with such sides.
     * @param a
     * @param b
     * @param c
     */
    public static void printIsTriangle(int a, int b, int c){
        if ((a + b > c) && (a + c > b) && (b + c > a)){
            System.out.println("Is triangle");
        }else{
            System.out.println("Is not triangle");
        }
    }

    /**
     * print count of numbers that equals to each other
     * @param num1
     * @param num2
     * @param num3
     */
    public static void printEqualsCount(int num1, int num2, int num3){
        int count = 0;
        if (num1 == num2){
            count++;
        }
        if (num2 == num3){
            count++;
        }
        if (num1 == num3){
            count++;
        }
        System.out.println(count);
    }

    /**
     * Print all decisions for ax2 + bx + c = 0.Print
     * @param a
     * @param b
     * @param c
     */
    public static void printAllDecisions(int a, int b, int c){
        double d = b * b - 4 * a * c;
        if (d < 0){
            System.out.println("Can't be");
        }else{
            double x1 = (-b + Math.sqrt(d)) / 2 / a;
            double x2 = (-b - Math.sqrt(d)) / 2 / a;
            if (x1 == x2){
                System.out.println(x1);
            }else{
                System.out.println(x1 + " : " + x2);
            }
        }

    }
}
