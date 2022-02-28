package com.company.day14;

public class Homework0218 {

    public static void main(String[] args) {

//        System.out.println(countOfVowels("aahgghgaaghgyoeiudhfbhdbfhbv"));
//        System.out.println(reverseString("asdfgh"));
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

    public static void countVowelsDigits(String str){
        int length = str.length();
        String revStr = "";
        for (int i = 0; i < length; i++) {
            revStr += str.charAt(length - i - 1);
        }
    }



}
