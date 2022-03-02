package com.company.day14;

import java.text.DecimalFormat;

public class Homework0218 {

    public static void main(String[] args) {

//        System.out.println(countOfVowels("aahgghgaaghgyoeiudhfbhdbfhbv"));
//        System.out.println(reverseString("asdfgh"));
//        countVowelsDigits("testing12345");
//        caesarCode("Testing");
//        System.out.println((int)'A');
//        System.out.println((int)'Z');
//        checkPalindrome("Radara");
//        checkBinStr("1014701010");
    }

    /**
     * 1. the length of a given String.
     * @param string
     * @return
     */
    public static int lengthOfString(String string){
        return string.length();
    }

    /**
     * 2. returns a character of a given index,from a given String.
     * @param str
     * @param index
     * @return
     */
    public static char charOFGivenIndex(String str, int index){
        return str.charAt(index);
    }

    /**
     * 3. checks if the given String contains a given character.Pass
     * @param str
     * @param ch
     */
    public static void containsChar(String str, char ch){
        int length = str.length();
        boolean find = false;
        for (int i = 0; i < length; i++) {
            if (str.charAt(i) == ch){
                find = true;
                break;
            }
        }
        if (find){
            System.out.println("Contains");
        }else {
            System.out.println("Not Contains");
        }
    }

    /**
     * 4. the count of vowels of a given String
     * @param str
     * @return
     */
    public static int countOfVowels(String str){
        int count = 0;
        for (int i=0 ; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch == 'a'|| ch == 'e'|| ch == 'i' ||ch == 'o' ||ch == 'u'||ch == ' '){
                count ++;
            }
        }
        return count;
    }

    /**
     * 5. reverse of the String by extracting and processing each character.
     * @param str
     * @return
     */
    public static String reverseString(String str){
        int length = str.length();
        String revStr = "";
        for (int i = 0; i < length; i++) {
            revStr += str.charAt(length - i - 1);
        }
        return revStr;
    }

    /**
     * 6. counts the
     * number of vowels (a, e, i, o, u, A, E, I, O, U) and digits (0-9) contained in the string,
     * @param str
     */
    public static void countVowelsDigits(String str){
        int length = str.length();
        str = str.toLowerCase();
        int vowelsCount = 0;
        int digitsCount = 0;
        for (int i = 0; i < length; i++) {
            char ch = str.charAt(i);
            if (ch >= '0' && ch <= '9'){
                digitsCount++;
            }
            if ((ch == 'a'|| ch == 'e'|| ch == 'i' ||ch == 'o' ||ch == 'u'||ch == ' ')){

                vowelsCount++;
            }
        }

        DecimalFormat f = new DecimalFormat("##.00");

        System.out.println("Number of vowels: " + vowelsCount + " ( " + (f.format(vowelsCount * 100.0 / length)) + " )");
        System.out.println("Number of digits: " + digitsCount + " ( " + (f.format(digitsCount * 100.0 / length)) + " )");

    }

    /**
     * 7. Caesar's Code
     * @param str
     * @param n
     */
    public static void caesarCode(String str, int n){
        str = str.toUpperCase();
        String caesarStr = "";              // 65    90
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char ch = str.charAt(i);
            if ((char)(ch + n) > 90){
                caesarStr += (char)(65 - (90 - (ch + n )));
            }else {
                caesarStr += (char)(ch + n);
            }
        }
        System.out.println(caesarStr);

    }

    /**
     * 8. check if the passed String palindrome or not
     * @param str
     */
    public static void checkPalindrome(String str){
        str = str.toUpperCase();
        int length = str.length();
        boolean find = false;
        for (int i = 0; i < length / 2; i++) {
            if (str.charAt(i) != str.charAt(length - i - 1)){
                find = true;
                break;
            }
        }
        if (find){
            System.out.println("No palindrome");
        }else {
            System.out.println("Palindrome");
        }
    }

    /**
     * 9. decide if the input
     * string is a valid binary string.
     * @param str
     */
    public static void checkBinStr(String str){
        boolean find = false;
        for (int i=0 ; i < str.length(); i++){
            char ch = str.charAt(i);
            if(ch != '1' && ch != '0'){
                find = true;
                break;
            }
        }

        if (find){
            System.out.println(str + " is not a binary string");
        }else{
            System.out.println(str + " is a binary string");
        }

    }

    /**
     * 10. decide if the input string is a valid hexadecimal string.
     * @param str
     */
    public static void checkHexadecimal(String str){
        str = str.toUpperCase();
        boolean find = false;
        for (int i=0 ; i < str.length(); i++){
            char ch = str.charAt(i);
            if(!((ch >= '0' && ch <= '9') || (ch >= 'A' && ch <= 'F'))){
                find = true;
                break;
            }
        }

        if (find){
            System.out.println(str + " is not a hexadecimal string");
        }else{
            System.out.println(str + " is a hexadecimal string");
        }
    }




}
