package com.company.day9;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Homework0211 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        int num = 0;
//        System.out.println(((num & (num - 1)) == 0 && num != 0) ? true : false);

//        compare2Strings(scanner);

//        compareStringLiteralWithStringObject();

//        printPositiveNegative(scanner);

//        printPositiveNegative0(-47);

//        System.out.println(mathAbsWithTernary(0));

//        System.out.println(checkString("jjnjnjkn "));

//        System.out.println(checkVowelOrConsonant("B"));

//        int num = scanner.nextInt();
//        printPressedNumber0to9(num);

//        printIsEvenOdd(47);

//        System.out.println(determineTheGrade(10, 40, 47));

        calculator(scanner);
        scanner.close();

    }

    /**
     * checking is num power of 2
     *
     * @param num
     * @return
     */
    public static boolean isPower(int num) {
        if (num < 0) {
            return false;
        }
        boolean isPower = true;
        while (num != 1) {
            if (num % 2 == 1) {
                return false;
            } else {
                num /= 2;
            }
        }
        return isPower;
    }

    /**
     * initialize 2 String from console and compare with '==' and equals
     */
    public static void compare2Strings(Scanner scanner) {
        System.out.println("Enter first string: ");
        String str1 = scanner.next();
        System.out.println("Enter second string: ");
        String str2 = scanner.next();

        System.out.println(str1 == str2 ? "true" : "false");
        System.out.println(str1.equals(str2) ? "true" : "false");


    }

    /**
     * initialize 2 String one with literal second with new keyword and compare with '==' and equals
     */
    public static void compareStringLiteralWithStringObject() {
        String str1 = "asdf";
        String str2 = new String("asdf");

        System.out.println(str1 == str2 ? "true" : "false");
        System.out.println(str1.equals(str2) ? "true" : "false");

    }

    /**
     * Input integer value from console, if value greater than 0 print n positive, else print negative.
     *
     * @param num
     */
    public static void printPositiveNegative(int num) {
        System.out.println(num > 0 ? "positive" : "negative");
    }

    /**
     * Input integer value from console, if value greater than 0 print positive, else print negative, else if 0 print 0;
     *
     * @param num
     */
    public static void printPositiveNegative0(int num) {
//        System.out.println(num == 0 ? "positive" : (printPositiveNegative(num)));
        if (num == 0) {
            System.out.println(0);
        } else {
            printPositiveNegative(num);
        }
    }

    /**
     * same as Math.max(a,b) with ternary operator
     *
     * @param num1
     * @param num2
     * @return
     */
    public static int mathMaxWithTernary(int num1, int num2) {
        return num1 > num2 ? num1 : num2;
    }

    /**
     * same as MAth>abs(num) with ternary operator
     *
     * @param num
     * @return
     */
    public static int mathAbsWithTernary(int num) {
        return num < 0 ? (-1 * num) : num;
    }

    /**
     * Using ternary operator check if the given String
     * - - is a null so return -1
     * - - if given String is “ ” return 0
     * - - else return 1
     *
     * @param str
     * @return
     */
    public static int checkString(String str) {
        return str == null ? -1 : (str.equals(" ") ? 0 : 1);
    }

    /**
     * find maximum from a given 3 integer numbers
     *
     * @param num1
     * @param num2
     * @param num3
     * @return
     */
    public static int findMaxOf3Int(int num1, int num2, int num3) {
        int max = mathMaxWithTernary(num1, num2);
        return mathMaxWithTernary(max, num3);
    }

    /**
     * choose correct answer
     *
     * @param c
     */
    public static void chooseCorrectAnswer(char c) {
        switch (c) {
            case 'a':
                System.out.println("Congratulation");
                break;
            case 'b':
            case 'c':
            case 'd':
                System.out.println("invalid choice");
            default:
                System.out.println("input a or b or c or d");
                break;
        }
    }

    /**
     * check vowel or consonant
     *
     * @param c
     * @return
     */
    public static String checkVowelOrConsonant(String c) {
        c = c.toLowerCase();
        switch (c) {
            case "a":
            case "e":
            case "i":
            case "o":
            case "u":
                return "Vowel";
            default:
                return "Consonant";
        }
    }

    /**
     * print num if num is [0; 9] else "Not allowed"
     *
     * @param num
     */
    public static void printPressedNumber0to9(int num) {
        if (num >= 0 && num <= 9) {
            System.out.println(num);
        } else {
            System.out.println("Not allowed");
        }
    }

    /**
     * print number is odd or even
     *
     * @param num
     */
    public static void printIsEvenOdd(int num) {
        switch (num & 1) {
            case 0:
                System.out.println("Is Even");
                break;
            case 1:
                System.out.println("Is Odd");
        }
    }

    /**
     * calculator +, -, *, /
     * @param scanner
     */
    public static void calculator(Scanner scanner) {
        System.out.println("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.println("Enter second number: ");
        double num2 = scanner.nextDouble();
        System.out.println("Enter an operator (+, -, *, /): ");
        String operator = scanner.next();
        switch (operator) {
            case "+":
                System.out.println(num1 + " " + operator + " " + num2 + " : " + (num1 + num2));
                break;
            case "-":
                System.out.println(num1 + " " + operator + " " + num2 + " : " + (num1 - num2));
                break;
            case "*":
                System.out.println(num1 + " " + operator + " " + num2 + " : " + (num1 * num2));
                break;
            case "/":
                System.out.println(num1 + " " + operator + " " + num2 + " : " + (num1 / num2));
                break;
            default:
                System.out.println("Enter valid operator");
                calculator(scanner);


        }
    }

    /**
     * convert weekday to number
     *
     * @param day
     * @return
     */
    public static int returnWeekdaysIntValue(String day) {
        switch (day) {
            case "Sunday":
                return 1;
            case "Monday":
                return 2;
            case "Tuesday":
                return 3;
            case "Wednesday":
                return 4;
            case "Thursday":
                return 5;
            case "Friday":
                return 6;
            case "Saturday":
                return 7;
        }
        return 0;
    }

    /**
     * determine the grade
     *
     * @param quiz
     * @param mid
     * @param finalScore
     * @return
     */
    public static String determineTheGrade(int quiz, int mid, int finalScore) {
        double avg = (quiz + mid + finalScore) / 3.0;
        if (avg >= 80) {
            return "A";
        } else if (avg >= 60) {
            return "B";
        } else if (avg >= 40) {
            return "C";
        }
        return "F";

    }

}
