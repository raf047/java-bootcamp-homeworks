package com.company.day18;

public class PersonValidator {
    public static boolean isValidName(int first, int last, String str){
        if (str == null){
            return false;
        }
        int length = str.length();
        return length >= first && length <= last;
    }

    public static boolean isValidAge(int age){
        return age >= 18 && age <= 99;
    }

    public static boolean isValidGender(String str){
        return str != null && (str.compareToIgnoreCase("male") == 0 || str.compareToIgnoreCase("female") == 0);
    }

    public static boolean isValidPassportId(String str){
        if (str == null){
            return false;
        }
        if (str.length() != 8){
            return false;
        }

        if (!str.substring(0, 2).equals("AN")){
            return false;
        }

        for (int i = 2; i < 8; i++) {
            char ch = str.charAt(i);
            if (!(ch >= '0' && ch <= '9')){
                return false;
            }
        }
        return true;
    }
}
