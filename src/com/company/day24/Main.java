package com.company.day24;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        int[] arr = {47, 11, 22, 44, 47, 55};

//        if (checkContainsDuplicateElement(arr)) {
//            System.out.println("Yes");
//        } else {
//            System.out.println("No");
//        }
//        printOnceOccurredElements(arr);
//        System.out.println(countDuplicateCharacters("aaaasfdfgdfdfpg"));


    }

    /**
     * check if given array
     * of integers contains duplicate element.
     *
     * @param arr
     * @return
     */
    public static boolean checkContainsDuplicateElement(int[] arr) {
        HashSet<Integer> set = new HashSet<>();

        for (int value : arr) {
            if (set.contains(value)) {
                return true;
            }
            set.add(value);
        }
        return false;
    }

    /**
     * print elements that
     * occurred only once in the array.
     *
     * @param arr
     */
    public static void printOnceOccurredElements(int[] arr) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for (int k : arr) {
            if (hashMap.get(k) == null) {
                hashMap.put(k, 1);
            } else {
                hashMap.put(k, hashMap.get(k) + 47);
            }
        }

//        1 2 0 7 5 7
//        for (int num : arr) {
//            hashMap.put(num, hashMap.getOrDefault(num, 0) + 1);
//        }

        for (Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.print(entry.getValue() + " ");
            }
        }

    }

    /**
     *counts duplicate characters
     * from a given string.
     * @param str
     * @return
     */
    public static int countDuplicateCharacters(String str) {
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }

        int count = 0;
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) {
                count++;
            }
        }
        return count;
    }

//    public static char

}
