package com.company.day11;

import com.company.day10.Homework0214;

import java.util.Scanner;

public class Homework0215 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//    printAllEvenNumberWithRange(2, 5);
//        printAllNumbersWithSameRemainder(2,10, 0,3);
//        printExactSquaresWithRange(2,47);

//        printHowManyTimesDOccurs(74747, 7);

//        printReverseNaturalNumber(407040700);
//        System.out.println(trimLastZeros(470407000));
//        printSmallestNaturalDivisor(470);

//        printAllNaturalDivisors(32);
//        System.out.println(naturalDivisorsCount(47));


//        System.out.println(sumOf10Numbers(scanner));

//        System.out.println(convertBinaryToDecimal(111));
//        printCounts(scanner);

//        GNCHE1(7);

//        printNSizeSquare(4);

//        printCheckerboard(7);

        printMultiplicationTable(10);

//        printPatternA(4);
//        printPatternB(4);
//        printPatternC(4);
//        printPatternD(4);

    }


    /**
     * 1. print all even numbers from a given range,
     * @param first
     * @param last
     */
    public static void printAllEvenNumberWithRange(int first, int last){
        if (first % 2 == 1){
            first++;
        }
        for (int i = first; i <= last; i += 2) {
            System.out.println(i);
        }
    }

    /**
     * 2.Print all numbers on the segment from a to b that give the
     * remainder of c when divided by d.
     * @param a
     * @param b
     * @param c
     * @param d
     */
    public static void printAllNumbersWithSameRemainder(int a, int b, int c, int d){
        int i;
        for ( i = a; i <= b; i++) {
            if (i % d == c){
                System.out.println(i);
                break;
            }
        }
        if ((i + d) <= b){
            for (int j = i + d; j <= b; j += d) {
                System.out.println(j);
            }
        }


    }

    /**
     * 3. Print all numbers on the segment from a to b that are exact
     * squares.
     * @param first
     * @param last
     */
    public static void printExactSquaresWithRange(int first, int last){
        Homework0214.printExactSquares(first, last);
    }

    /**
     * 4. Count and print one number - how many times the digit d occurs in
     * the representation of a natural number x.
     * @param x
     * @param d
     */
    public static void printHowManyTimesDOccurs(int x, int d){
        int count;
        for (count = 0; x != 0; x /= 10){
            if (x % 10 == d){
                count++;
            }
        }
        System.out.println(count);
    }

    /**
     * 5. Print the number consisting of the digits of the given number x in reverse
     * order. You do not need to output leading zeros.
     * @param num
     */
    public static void printReverseNaturalNumber(int num){
        num = trimLastZeros(num);
        for (; num != 0 ; num /= 10) {
            System.out.print(num % 10);
        }
    }

    /**
     * trim last 0 digits and return num
     * @param num
     * @return
     */
    public static int trimLastZeros(int num){
        for (int i = 0; ; num /= 10){
            if (num % 10 == 0){
                i++;
                continue;
            }
            return num;
        }
    }

    /**
     * 6. Print the smallest natural divisor of x other than 1
     * @param x
     */
    public static void printSmallestNaturalDivisor(int x){
        int sqrt = (int)Math.sqrt(x);
        boolean find = false;
        for (int i = 2; i <= sqrt; i++) {
            if (x % i == 0) {
                find = true;
                System.out.println(i);
                break;
            }
        }
        if (!find){
            System.out.println("Prime number");
        }
    }

    /**
     * 7. Print all natural divisors of the number num in ascending order (including 1
     * and the number itself).
     * @param num
     */
    public static void printAllNaturalDivisors(int num){
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                System.out.print(i + " , ");
            }
        }
        System.out.println(num);
    }

    /**
     * 8. Count the number of natural divisors of x including 1 and the number
     * itself
     * @param x
     * @return
     */
    public static int naturalDivisorsCount(int x){
        int count = 2;
        for (int i = 2; i <= x / 2; i++) {
            if (x % i == 0) {
                count++;
            }
        }
        return count;
    }

    /**
     * 9. input 10 number calculate sum
     * @param scanner
     * @return
     */
    public static int sumOf10Numbers(Scanner scanner){
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter natural number: ");
            int num = scanner.nextInt();
            sum += num;
        }
        return sum;
    }

    /**
     * 10. convert binary to decimal
     * @param num
     * @return
     */
    public static int convertBinaryToDecimal(int num){
        int sum = 0;
        int i;
        for (i = 0; num != 0; num /= 10, i++) {
            sum += (num % 10) * Math.pow(2,i);
        }
        return sum;
    }

    /**
     * 11. Count how many zeros, positive numbers, negative numbers
     * among the given N numbers.
     * @param scanner
     */
    public static void printCounts(Scanner scanner){
        System.out.println("Enter N: ");
        int n = scanner.nextInt();
        int count0 = 0;
        int countPositive = 0;
        int countNegative = 0;
        for (int i = 0; i < n; i++) {
            System.out.println("Enter number: ");
            int num = scanner.nextInt();
            if (num > 0){
                countPositive++;
            }else if (num < 0){
                countNegative++;
            }else {
                count0++;
            }
        }
        System.out.println("0 - " + count0 + ", positive - " + countPositive + ", negative - " + countNegative);
    }

    /**
     * 12. GNCHE-1
     * @param n
     */
    public static void GNCHE1(int n){
        int count = 0;
        OUTER_LOOP:for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
                count++;
                if (count == n){
                    break OUTER_LOOP;
                }
            }
        }
    }

    /**
     * 13. Print N size square with "*"s
     * @param n
     */
    public static void printNSizeSquare(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /**
     * 14. Print checkerboard pattern.
     * @param n
     */
    public static void printCheckerboard(int n){
        for (int i = 1; i < 2*n; i++) {
            for (int j = 0; j < 2*n; j++) {
                if (i % 2 == 1){
                    System.out.print("#");
                    System.out.print(" ");
                }else{
                    System.out.print(" ");
                    System.out.print("#");
                }
            }
            System.out.println();
        }
    }

    /**
     * 15. prints the multiplication table as shown:
     * @param n
     */
    public static void printMultiplicationTable(int n){
        for (int i = -1; i <= n; i++) {
            for (int j = -1; j <= n; j++) {
                if (i == -1 && j == -1){
                    System.out.print("   * | ");
                }else if(i == 0 && j == 0){
                    System.out.print("-------------------------------------------------");
                } else if (i == -1){
                    System.out.printf("%4d", j);
                }else if (j == -1 && i != 0){
                    System.out.printf("%4d", i);
                    System.out.print(" | ");
                }else if(j != -1 && i != 0) {
                    System.out.printf("%4d", i * j);
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void printPatternA(int size)
    {
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void printPatternB(int size)
    {
        for (int i = size; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void printPatternC(int size)
    {
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                System.out.print(( j >= i ? "* " : "  "));
            }
            System.out.println();
        }
    }

    public static void printPatternD(int size)
    {
        for (int i = size; i >= 1; i--) {
            for (int j = 1; j <= size; j++) {
                System.out.print(( j >= i ? "* " : "  "));
            }
            System.out.println();
        }
    }
}
