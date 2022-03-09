package com.company.day22;

import java.util.Scanner;

public class Homework0309 {

    public static void main(String[] args) {
        while (true) {
            try {
                System.out.println(parseInt());
                break;
            } catch (ParseIntegerException e) {
                System.out.println("Input correct string");
            }
        }
    }

    public static int parseInt(){
        try {
            Scanner scanner = new Scanner(System.in);
            String str = scanner.nextLine();
            return Integer.parseInt(str);
        }catch (Exception e){
            throw new ParseIntegerException("invalid string");
        }

    }
}
