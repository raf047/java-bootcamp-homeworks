package com.company.day25;

public class Homework0323 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
//        System.out.println(arraySum(arr, arr.length - 1));
//        System.out.println(factorial(2));
//        System.out.println(fib(8));
//        System.out.println(countBlocks(6));
//        System.out.println(sumOfDigits(4747));
//        System.out.println(count7s(747474747, 0));
//        System.out.println(countXs("xsxsacx",0, 6));
//        System.out.println(reverseString("HELLO"));

//        System.out.println(removeX("xsxssjfxjx"));
//        System.out.println("xxre");
//        System.out.println(endMovedX("xxrexsax", 0));
//        System.out.println(cleanedString("yyzzzaayavdss", 12));
//        System.out.println(isPrime(2, 2));
//        System.out.println(largestDigit("12893479"));
//        System.out.println(countOfDigits("ad5sasd5s45sa47", 0));
//        System.out.println(addAsterisk("LO", 0));
        String str = "LItBeoFLcSBOFQxMHoIuDDWcqcVgkcRoAeocXO";
        System.out.println(str.length());
        System.out.println(addParentheses(str, str.length() / 2, str.length() % 2));
//        System.out.println(mirrorString("(abc(def(g",9));
//        System.out.println(cutSymmetricalChars("asdfgfjsa", "", 0));
//        String str = "asdfghjk";
//        System.out.println(str.substring(1,str.length() - 1));
    }

    /**
     * 1. find the sum of a given array.
     *
     * @param arr
     * @param i
     * @return
     * @throws IllegalArgumentException
     */
    public static int arraySum(int[] arr, int i) throws IllegalArgumentException {
        if (i < 0) {
            throw new IllegalArgumentException("no elements");
        }
        if (i == 0) {
            return arr[0];
        } else {
            return arr[i] + arraySum(arr, i - 1);
        }
    }

    /**
     * 1. find the factorial of a given natural N.
     *
     * @param n
     * @return
     */
    public static int factorial(int n) {
        if (n >= 1) {
            return factorial(n - 1) * n;
        }
        return 1;

    }

    /**
     * 2. n-th fibonacci number.
     *
     * @param n
     * @return
     */
    public static int fib(int n) {
//        starts from index = 1
//        if (n <= 1) {
//            return 0;
//        }
//        if (n == 2){
//            return 1;
//        }

        if (n <= 1) {
            return n;
        }

        return fib(n - 1) + fib(n - 2);
    }

    /**
     * 3. Compute the total number of blocks in such a triangle with the given number of rows.
     *
     * @param n
     * @return
     */
    public static int countBlocks(int n) {
        if (n == 0) {
            return 0;
        }

        return countBlocks(n - 1) + n;
    }

    /**
     * 4. sum of number digits
     *
     * @param n
     * @return
     */
    public static int sumOfDigits(int n) {
        if (n == 0) {
            return 0;
        }

        return sumOfDigits(n / 10) + n % 10;

    }

    /**
     * 5. the count of the occurrences of 7
     *
     * @param n
     * @param count
     * @return
     */
    public static int count7s(int n, int count) {
        if (n == 0) {
            return count;
        }

        if (n % 10 == 7) {
            count++;
        }

        return count7s(n / 10, count);
    }

    /**
     * 6. compute the number of lowercase x chars in the string.
     *
     * @param str
     * @param count
     * @param i
     * @return
     */
    public static int countXs(String str, int count, int i) {
        if (i < 0) {
            return count;
        }

        if (str.charAt(i) == 'x') {
            count++;
        }

        return countXs(str.substring(0, (str.length() - 1)), count, i - 1);
    }

    /**
     * 7. compute a new string where all the x chars have been removed.
     *
     * @param str
     * @return
     */
    public static String removeX(String str) {
        if (str.length() == 0) {
            return "";
        }

        if (str.charAt(0) == 'x') {
            return removeX(str.substring(1));
        }

        return str.charAt(0) + removeX(str.substring(1));
    }

    /**
     * 8. reverses String
     *
     * @param str
     * @return
     */
    public static String reverseString(String str) {
        if (str.length() == 1) {
            return String.valueOf(str.charAt(0));
        }

        return str.charAt(str.length() - 1) + reverseString(str.substring(0, (str.length() - 1)));
    }

    /**
     * 9. compute recursively a new string where all the lowercase x chars have been moved to the end of the string.
     *
     * @param str
     * @param i
     * @return
     */
    public static String endMovedX(String str, int i) {
        if (i == str.length() - 1) {
            return str;
        }

        if (str.charAt(0) == 'x') {
            return endMovedX(str.substring(1) + "x", i + 1);
        }

        return str.charAt(0) + endMovedX(str.substring(1), i + 1);
    }

    /**
     * 10. return adjacent chars that are the same have been reduced to a single char.
     *
     * @param str
     * @param i
     * @return
     */
    public static String cleanedString(String str, int i) {
        if (i == 0) {
            return str;
        }

        if (str.substring(1).contains(String.valueOf(str.charAt(0)))) {
            return cleanedString(str.substring(1), i - 1);
        }

        return str.charAt(0) + cleanedString(str.substring(1), i - 1);
    }

    /**
     * 11. is given number prime
     *
     * @param n
     * @param i
     * @return
     */
    public static boolean isPrime(int n, int i) {
        if (n <= 2) {
            return false;
        }
        if (i > Math.sqrt(n)) {
            return true;
        }

        if (n % i == 0) {
            return false;
        }

        return isPrime(n, i + 1);

    }

    /**
     * 12. Find and display the largest digit.
     *
     * @param str
     * @return
     */
    public static int largestDigit(String str) {
        if (str.length() == 1) {
            return Integer.parseInt(String.valueOf(str.charAt(0)));
        }

        if (str.charAt(0) > str.charAt(1)) {
            return largestDigit(str.charAt(0) + str.substring(2));
        }

        return largestDigit(str.substring(1));
    }

    /**
     * 13. Find the number of digits.
     *
     * @param str
     * @param count
     * @return
     */
    public static int countOfDigits(String str, int count) {
        if (str.length() == 0) {
            return count;
        }

        if (str.charAt(0) >= '0' && str.charAt(0) <= '9') {
            return countOfDigits(str.substring(1), count + 1);
        }

        return countOfDigits(str.substring(1), count);
    }

    /**
     * 14. Add the ‘*’ (asterisk) character between letters
     *
     * @param str
     * @param i
     * @return
     */
    public static String addAsterisk(String str, int i) {
        if (i >= str.length()) {
            return str;
        }

        if (i == 0) {
            return addAsterisk(str.charAt(0) + "*" + str.substring(1), 3);
        }

        return addAsterisk(str.substring(0, i) + "*" + str.substring(i), i + 2);
    }

    /**
     * 15. Add opening and closing parentheses
     * @param str
     * @param i
     * @param rem
     * @return
     */
    public static String addParentheses(String str, int i, int rem) {
        if (i == 0) {

            if (rem == 1) {
                return "(" + str + ")";
            }

            return "()";
        }

        return "(" + str.charAt(0) + addParentheses(str.substring(1, str.length() - 1), i - 1, rem) + str.charAt(str.length() - 1) + ")";
    }

    /**
     * 16. Form a new line by adding a
     * mirrored; line with closing brackets to the right.
     *
     * @param str
     * @param i
     * @return
     */
    public static String mirrorString(String str, int i) {
        if (i < 0) {
            return str;
        }

        if (str.charAt(i) == '(') {
            return mirrorString(str + ')', i - 1);
        }

        return mirrorString(str + str.charAt(i), i - 1);

    }

    /**
     * 17. cut Symmetrical Chars
     *
     * @param str
     * @param emptyStr
     * @param i
     * @return
     */
    public static String cutSymmetricalChars(String str, String emptyStr, int i) {
        if (i == str.length()) {
            return emptyStr;
        }

        if (str.charAt(i) == str.charAt(str.length() - i - 1) && i != str.length() - i - 1) {
            return cutSymmetricalChars(str, emptyStr, i + 1);
        }

        return cutSymmetricalChars(str, emptyStr + str.charAt(i), i + 1);
    }


}
