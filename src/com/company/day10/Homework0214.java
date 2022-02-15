package com.company.day10;


import java.util.Random;
import java.util.Scanner;
import com.company.day9.Homework0211;



public class Homework0214 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        printEvenNumbers1To20();

//        printExactSquares(47);

//        printSmallestNaturalDivisor(123);

//        printAllIntegerPowersOfTwo(47);

//        printAllIntegersInDescendingOrder(7);

//        printMultiplesOf2EvenNumber(16);

//        printMultiplesOf2(47);

//        inputN(scanner);

//        smallestInt(1);
//        printTableOfChars();

//        printIntNumbersExpectOfMultipleOf3(47);

//        System.out.println(findDayCount(10,20));

//        System.out.println(findDayCount(10f, 20f));

//        printYearsCount(100f, 10f, 200f);

//        System.out.println(computeSumOfDigits(40007897));

//        guessNumber(scanner);

//        printSecondLarge(scanner);
    }

    /**
     * print all integers from 1 to 10
     */
    public static void print1To10() {
        int i = 1;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }
    }

    /**
     * 2Print all even integer numbers from 1 to 20.
     */
    public static void printEvenNumbers1To20() {
        int i = 2;
        while (i <= 20) {
            System.out.println(i);
            i += 2;
        }

    }

    /**
     * Print all exact squares of natural numbers that are not
     * exceeding a given positive integer N.
     *
     * @param end
     * @param start
     */
    public static void printExactSquares(int start, int end) {
        int i = start;
        while (i * i <= end) {
            System.out.println(i * i);
            i++;
        }
    }

    /**
     * Find and print the smallest natural divisor other than 1 for a given number
     *
     * @param num
     */
    public static void printSmallestNaturalDivisor(int num) {
        int i = 2;
        boolean find = false;
        while (i <= Math.sqrt(num)) {
            if (num % i == 0) {
                find = true;
                System.out.println(i);
                break;
            }
            i++;
        }
        if (!find) {
            System.out.println("Prime number");
        }
    }

    /**
     * 5.Print all integer powers of two not exceeding N in ascending order
     *
     * @param n
     */
    public static void printAllIntegerPowersOfTwo(int n) {
        int j = 1;
        while (j <= n) {
            System.out.println(j);
            j <<= 1;
        }
    }

    /**
     * print all integers in descending order.
     *
     * @param n
     */
    public static void printAllIntegersInDescendingOrder(int n) {

        while (n > 0) {
            System.out.println(n);
            n--;
        }
    }

    /**
     * print all integers that are multiple of 2 in descending order.
     *
     * @param n
     */
    public static void printMultiplesOf2(int n) {
        if (n % 2 == 0) {
            printMultiplesOf2EvenNumber(n);
        } else {
            printMultiplesOf2EvenNumber(--n);
        }

    }

    /**
     * print all integers that are multiple of 2 in descending order for even number
     *
     * @param n
     */
    public static void printMultiplesOf2EvenNumber(int n) {
        while (n > 1) {
            System.out.println(n);
            n -= 2;
        }
    }

    /**
     * Input N natural number till N would be the exact power of 2
     *
     * @param scanner
     */
    public static void inputN(Scanner scanner) {
        int count = 0;
        while (true) {
            System.out.println("Enter number: ");
            int n = scanner.nextInt();
            count++;
            if (n != 0 && ((n & (n - 1)) == 0)) {
                System.out.println("Number is: " + n + ", entered " + count + (count == 1 ? " number" : " numbers"));
                break;
            }

        }
    }

    /**
     * 9.For a given natural N print the smallest integer k that` Math.pow(2,k)≥N
     *
     * @param n
     */
    public static void printSmallestInt(int n) {
        int i = 1;
        int count = -1;
        while (i <= n) {
            i *= 2;
            count++;
        }
        System.out.println(count);
    }

    /**
     * print the table of characters that are
     * equivalent to the Ascii codes from 32 to 122.Print 10 characters at each line.
     */
    public static void printTableOfChars() {
        int i = 32;
        int j = i + 10;
        while (i < 122) {
            char c = (char) i;
            System.out.print(c + ", ");
            i++;
            if (i == j ){
                System.out.println();
                j += 10;
            }

        }
    }

    /**
     * Print all integer numbers from 1 to N, except that are multiple of 3
     * @param n
     */
    public static void printIntNumbersExpectOfMultipleOf3(int n){
        int i = 1;
        while (i < n){
            if (i % 3 == 0){
                i++;
                continue;
            }
            System.out.println(i);
            i++;
        }
    }

    public static void printWhichFibonacciNumberIs(int num){

    }

    /**
     * determine the number of the day for which the athlete&#39;s
     * mileage will be at least y kilometers
     * @param x
     * @param y
     * @return
     */
    public static int findDayCount(float x, float y){
        int count = 1;
        while (x < y){
            x = incrementWithPPer(x, 10f);
            count++;
        }
        return count;
    }

    /**
     * Determine how many years the contribution(ներդրում) will be at
     * least y dollars
     * @param x
     * @param p
     * @param y
     */
    public static void printYearsCount(float x, float p, float y){
        int count = 0;
        while (x <= y){
            x = incrementWithPPer(x, p);
            count++;
        }
        System.out.println(count);
    }

    /**
     * increment x with p %
     * @param x
     * @param p
     * @return
     */
    public static float incrementWithPPer(float x, float p){
        return x + x * p / 100;
    }

    public static void printSecondLarge(Scanner scanner){
        int max = Integer.MIN_VALUE;
        int pastMax = 0;
        while (true){
            System.out.println("Enter number");
            int num = scanner.nextInt();
            if (num == 0){
                break;
            }
            max = Homework0211.mathMaxWithTernary(max, num);
            pastMax = num;
        }

        System.out.println(pastMax);

    }

    /**
     * generates a random number and asks the user
     * to guess what the number is.
     * @param scanner
     */
    public static void guessNumber(Scanner scanner){
        Random random = new Random();
        int num = random.nextInt(2);

        while (true){
            System.out.println("Enter integer number: ");
            int inputNum = scanner.nextInt();
            if (num == inputNum){
                System.out.println("Yes, you guessed the number.");
                break;
            }else if (inputNum > num){
                System.out.println("Too high, try again.");
            }else {
                System.out.println("Too low, try again.");
            }
        }

    }

    /**
     * Compute the Sum of Digits in a given Integer
     * @param num
     * @return
     */
    public static int computeSumOfDigits(int num) {
        int count = 0;
        while (num != 0){
            count += (num % 10);
            num /= 10;
        }
        return count;
    }
}
