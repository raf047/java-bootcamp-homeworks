package com.company.day26;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Homework0325 {
    public static void main(String[] args) {
//        ArrayList<Integer> list = new ArrayList<>();
//        List<Integer> list1 = new ArrayList<>();
//        list1.add(47);
//        list1.add(4747);
//        list1.add(470);
//        list1.add(474747);
//        list1.add(47047);

//        List<Number> nums = new ArrayList<>();
//        List<Integer> src = new ArrayList<>();
//        src.add(47);
//        src.add(4747);
//        src.add(474747);
//        src.add(47047);
//
//        copy(nums, src);
//        print(nums);
//
//        String[] arr = {"47a", "47s", "47d", "47f"};
//        int[] arr = {47, 47, 58, 69};

//        List<String> list = convertArrToList(arr);
//        print(list);
//        System.out.println(maxVal(list1,
//                new Comparator<Integer>() {
//                    @Override
//                    public int compare(Integer o1, Integer o2) {
//                        return 10 * (o1 - o2);
//                    }
//                }));


    }

    /**
     * 1. prints the
     * elements of the list.
     * @param list
     * @param <E>
     */
    public static <E> void print(List<E> list){
        for (E elem: list) {
            System.out.println(elem);
        }
    }

    /**
     * 2. takes an array of T type and converts it to a list
     * of type T.
     * @param arr
     * @param <T>
     * @return
     */
    public static <T> List<T> convertArrToList(T[] arr){
        List<T> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }

        return list;
    }

    /**
     * 3. Return the largest value in the list.
     * @param list
     * @param comparator
     * @param <T>
     * @return
     */
    public static <T> T maxVal(List<T> list, Comparator<T> comparator){
        T max = list.get(0);
        for (int i = 1; i < list.size() ; i++) {
            if (comparator.compare(list.get(i), max) > 0){
                max = list.get(i);
            }
        }

        return max;
    }

    /**
     * 4. copy from src to dest. src and dest are lists.
     * @param dest
     * @param src
     * @param <T>
     */
    public static <T> void copy(List<? super T> dest, List<T> src){
        for (int i = 0; i < src.size(); i++) {
            dest.add(src.get(i));
        }

    }






}
