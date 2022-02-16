package com.company.day12;

import java.util.Scanner;

public class Homework0216 {
    public static void main(String[] args) {

//        printEvenIndices(5);
        int[] arr = {47, 7, 47, 6, -5,147, -47, -49, -6, 6};
//        printSmallestPositiveItem(arr);
//        printPositiveElements(arr);
//        printLargerThanPrevious(arr);
//        printAdjacentElements(arr);
//        printLargestItemAndIndex(arr);
//        printSmallestPositiveItem(arr);

//        int[] arr = {1, 2, 2, 3, 3, 3, 4, 4, 5, 5};
//        onlyOnceElements(arr);

//        printDifferentElements(arr);

//        printReverseArray(arr);

//        int[] rev = reverseArray(arr);

//        int[] rev = remainAdjacentElements(arr);
//        for (int item: rev) {
//            System.out.println(item);
//        }


//        int[] arr = {1, 2, 3, 4, 5};
//        int[] newArr = cycleElements(arr);

//        int[] arr = {0, 3, 0, 2 , 0,0, 0, 0, 0, 1, 4, 5, 0, 0};
//        int[] newArr = swapMaxAndMin(arr);
//        int[] newArr = moveZeroesToEnd(arr);

//        for (int item : newArr) {
//            System.out.println(item);
//        }


    }


    /**
     * generate N size integer array
     *
     * @param n
     * @return
     */
    public static int[] generateNSizeArray(int n) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter number: ");
            int num = scanner.nextInt();
            arr[i] = num;
        }
        return arr;
    }

    /**
     * 1. Print all elements of the array with even indices
     *
     * @param size
     */
    public static void printEvenIndices(int size) {
        int[] arr = generateNSizeArray(size);
        for (int i = 0; i < size; i += 2) {
            System.out.print(arr[i] + " ");
        }
    }

    /**
     * 2. Print all even numbered items in the list.
     *
     * @param size
     */
    public static void printEvenItems(int size) {
        int[] arr = generateNSizeArray(size);
        for (int i = 0; i < size; i++) {
            if (arr[i] % 2 == 0) {
                System.out.println();
            }
        }

    }

    /**
     * 3. Find the number of positive elements in the given array.
     *
     * @param arr
     */
    public static void printPositiveElements(int[] arr) {
        int length = arr.length;
        for (int i = 0; i < length; i++) {
            if (arr[i] > 0) {
                System.out.println(arr[i]);
            }
        }
    }

    /**
     * 4. Print all the elements of the list that are
     * larger than the previous element.
     *
     * @param arr
     */
    public static void printLargerThanPrevious(int[] arr) {
        int length = arr.length;
        for (int i = 1; i < length; i++) {
            if (arr[i] > arr[i - 1]) {
                System.out.println(arr[i]);
            }
        }
    }

    /**
     * 5. If array has two adjacent
     * elements of the same sign, print these numbers.
     *
     * @param arr
     */
    public static void printAdjacentElements(int[] arr) {
        int length = arr.length - 2;
        for (int i = 2; i < length; i++) {
            if (arr[i - 2] * arr[i + 1] > 0) {
                System.out.println(arr[i - 1] + ", " + arr[i]);
            }
        }
    }

    /**
     * 6. Print the value of the largest element in
     * the array, and then the index of that element in the array.
     *
     * @param arr
     */
    public static void printLargestItemAndIndex(int[] arr) {
        int length = arr.length;
        int max = arr[0];
        int firstIndex = 0;
        for (int i = 1; i < length; i++) {
            if (max < arr[i]) {
                max = arr[i];
                firstIndex = i;
            }
        }
        System.out.println("The largest is: " + max + " , index is " + firstIndex);
    }

    /**
     * 7. find smallest positive number
     * @param arr
     */
    public static void printSmallestPositiveItem(int[] arr){
        int min = arr[0];
        for (int value : arr) {
            if (value > 0 && value < min) {
                min = value;
            }
        }
        System.out.println(min);

    }

    /**
     * 8. Determine how many different elements are in it.
     *
     * @param arr
     */
    public static void printDifferentElements(int[] arr) {
        int length = arr.length;
        int temp = arr[0];
        for (int i = 1; i < length; i++) {
            if (temp == arr[i]) {
                continue;
            }
            System.out.println(temp);
            temp = arr[i];
        }
        System.out.println(arr[length - 1]);
    }

    /**
     * 9.Print the elements of the given list in reverse order without changing
     * the list itself.
     *
     * @param arr
     */
    public static void printReverseArray(int[] arr) {
        int length = arr.length - 1;
        for (int i = length; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }

    /**
     * 10.Rearrange the elements of this array in reverse order
     *
     * @param arr
     * @return
     */
    public static int[] reverseArray(int[] arr) {
        int length = arr.length;
        int temp;
        for (int i = 0; i < length / 2; i++) {
            temp = arr[i];
            arr[i] = arr[length - i - 1];
            arr[length - i - 1] = temp;
        }
        return arr;
    }

    /**
     * 11. Rearrange the adjacent elements of the array
     *
     * @param arr
     * @return
     */
    public static int[] remainAdjacentElements(int[] arr) {
        int length = arr.length;
        int temp;
        for (int i = 1; i < length; i += 2) {
            temp = arr[i - 1];
            arr[i - 1] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }

    /**
     * 12.Cycle the elements of the array to the right
     *
     * @param arr
     * @return
     */
    public static int[] cycleElements(int[] arr) {
        int length = arr.length - 1;
        int last = arr[length];
        for (int i = length; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = last;
        return arr;
    }

    /**
     * 13.In the list, all items are different. Swap the minimum and maximum
     * elements of this list.
     *
     * @param arr
     * @return
     */
    public static int[] swapMaxAndMin(int[] arr) {
        int length = arr.length;
        int minIndex = 0, maxIndex = 0;
        for (int i = 1; i < length; ++i) {
            if (arr[i] < arr[minIndex]) {
                minIndex = i;
            }
            if (arr[i] > arr[maxIndex]) {
                maxIndex = i;
            }
        }
        int temp;
        if (maxIndex != minIndex) {
            temp = arr[minIndex];
            arr[minIndex] = arr[maxIndex];
            arr[maxIndex] = temp;
        }
        return arr;
    }

    /**
     * 15. Print those elements of array that appear in the list
     * only once.
     *
     * @param arr
     */
    public static void onlyOnceElements(int[] arr) {
        int length = arr.length;
        boolean isOnce;
        for (int i = 0; i < length; i++) {
            isOnce = false;
            for (int j = 0; j < arr.length; j++) {
                if (i == j) {
                    continue;
                }
                if (arr[i] == arr[j]) {
                    isOnce = true;
                    break;
                }
            }

            if (!isOnce) {
                System.out.println(arr[i]);
            }
        }

    }

    /**
     * 16. “compress” array by moving
     * all non-zero elements to the left side of the array without changing their
     * order, and all zeros to the right side.
     * @param arr
     * @return
     */
    public static int[] moveZeroesToEnd(int[] arr) { // 0, 3, 0, 2 , 0,0, 0, 0, 0, 1, 4, 5, 0, 0
        int length = arr.length;
        int count = 0;
        for (int i = 0; i < length; i++) {
            if (arr[i] != 0) {
                arr[count] = arr[i];
                count++;
            }
        }

        while (count < length) {
            arr[count++] = 0;
        }

        return arr;
    }

}
