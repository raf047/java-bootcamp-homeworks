package com.company.day18;

public class StoreValidator {
    public static boolean isValidCountOfWorkers(int countOfWorkers){
        return countOfWorkers >= 2 && countOfWorkers < 50;
    }

    public static boolean isValidName(int first, String str){
        if (str == null){
            return false;
        }
        return str.length() >= first ;
    }

    public static boolean isValidPhoneNumber(String phoneNumber){
        if (phoneNumber == null){
            return false;
        }
        if (phoneNumber.length() != 8){
            return false;
        }
        for (int i = 0; i < 8; i++) {
            char ch = phoneNumber.charAt(i);
            if (!(ch >= '0' && ch <= '9')){
                return false;
            }
        }
        return true;
    }
}
