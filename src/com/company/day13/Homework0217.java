package com.company.day13;

import java.util.Random;

public class Homework0217 {
    public static void main(String[] args) {
//        int[][] matrix = generateMatrix(5);
//        int[][] matrix = generateMatrixWith012(5);
//        printMatrix(matrix);
//        int[][] matrix = generateRandomMatrix(4, 7);
//        printMatrix(matrix, 4, 7);

//        int[][] matrix = {{1, 4, 7, 0}, {3, 4, 7, 0}, {1,1,1,1}, {1,4,6,0}};
        int[][] matrix1 = generateRandomMatrix(5,5);
        int[][] matrix2 = generateRandomMatrix(5,5);
                printMatrix(matrix1, 5, 5);
        System.out.println();

//        System.out.println();
//        int[][] matrix = generateSpiralWith1(7);
                printMatrix(matrix2,5,5);
        System.out.println();

//
        int[][] matrix = addTwoMatrices(matrix1,matrix2,5);

        printMatrix(matrix,5,5);
//        System.out.println();
//        printMatrix(matrix,5,10);
//        printMaxSumOfRows(matrix, 4, 4);
//        checkSymmetrical(matrix);

//        printMaxItemAndIndex(matrix, 4, 4);
    }

    /**
     * print n*n matrix
     * @param matrix
     */
    public static void printMatrix(int[][] matrix, int n, int m){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.printf("%3d", matrix[i][j]);
            }
            System.out.println();
        }
    }

    /**
     * generate random n*n matrix
     * @param n
     * @return
     */
    public static int[][] generateRandomMatrix(int n, int m){
        int[][] matrix = new int[n][m];
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = rand.nextInt(7);
            }
        }
        return matrix;
    }

    /**
     * 1.Create an n × n array and fill it according to the following rule:
     * - the numbers on the diagonal going from the upper right to the lower left
     * corner are equal to 1;
     * - the other elements are 0;
     * @param n
     * @return
     */
    public static int[][] generateMatrix(int n){
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j){
                    matrix[i][j] = 1;
                    break;
                }
            }
        }
        return matrix;
    }

    /**
     * 2.Create an n × n array and fill it according to the following rule:
     * - the numbers on the diagonal going from the upper right to the lower left
     * corner are equal to 1;
     * - numbers above this diagonal are equal to 0;
     * - the numbers below this diagonal are equal to 2
     * @param n
     * @return
     */
    public static int[][] generateMatrixWith012(int n){
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i + j  == n - 1){
                    matrix[i][j] = 1;
                }else if (i + j > n - 1){
                    matrix[i][j] = 2;
                }
            }
        }
        return matrix;
    }

    /**
     *3.Check if the two-dimensional array is symmetrical about the main
     * diagonal.
     * @param matrix
     */
    public static void checkSymmetrical(int[][] matrix){
        boolean find = false;
        for (int i = 0; i < matrix[0].length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (i == j) {
                    continue;
                }
                if (matrix[i][j] != matrix[j][i]){
                    find = true;
                }
            }
            if (find){
                break;
            }
        }
        if (find){
            System.out.println("No");
        }else {
            System.out.println("Yes");
        }
    }

    /**
     * 4.There are n athletes competing in hammer throw. Each of them made
     * m throws. The winner is the athlete who has the maximum result for all
     * throws.
     * @param matrix
     * @param n
     * @param m
     */
    public static void printMaxSumOfRows(int[][] matrix, int n, int m){
        int prevMax = 0;
        int max = 0;
        int index = 0;
        for (int i = 0; i < n; i++) {
            int rowSum = 0;
            for (int j = 0; j < m; j++) {
                rowSum += matrix[i][j];
            }
            prevMax = rowSum;

            if (prevMax > max){
                max = prevMax;
                index = i;
            }
        }
        System.out.println("max is " + max + " in line " + index);
    }

    /**
     * 5.There are n athletes competing in hammer throw. Each of them made
     * m throws. The winner of the competition is the athlete who has the best
     * result in all throws. Thus, the program must find the value of the
     * maximum element in the given array, as well as its indices (that is, the
     * number of the athlete and the number of the attempt).
     * @param matrix
     * @param n
     * @param m
     */
    public static void printMaxItemAndIndex(int[][] matrix, int n, int m){
        int max = 0;
        int indexI = 0;
        int indexJ = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] > max){
                    max = matrix[i][j];
                    indexI = i;
                    indexJ = j;
                }
            }
        }
        System.out.println("max is " + max + " , " + indexI + " , " + indexJ);
    }

    /**
     * 6.There are n athletes competing in hammer throw. Each of them made
     * m throws. The athlete with the highest best throw wins. If there are
     * several of them, then the one with the best sum of results for all attempts
     * wins. If there are several of them, the athlete with the minimum number
     * is considered the winner. Determine the number of the winner of the
     * competition.
     * @param matrix
     * @param n
     * @param m
     */
    public static void printWinner(int[][] matrix, int n, int m){
        int max = 0;
        int indexI = 0;
        int rowSum = 0;
        int maxRow = 0;
        int prevMax = 0;

        for (int i = 0; i < n; i++) {
            boolean find = false;
            for (int j = 0; j < m; j++) {
                rowSum += matrix[i][j];
                if (matrix[i][j] >= max){
                    find = true;
                    max = matrix[i][j];
                    indexI = i;
                }
            }
            if (find){
                prevMax = rowSum;
                if (prevMax > maxRow){
                    maxRow = prevMax;
                    indexI = i;
                }
            }

        }
        System.out.println("max is " + max + " , " + indexI );
    }

    /**
     * 8. add two matrices of the same size.
     * @param matrix1
     * @param matrix2
     * @param n
     * @return
     */
    public static int[][] addTwoMatrices(int[][] matrix1, int[][] matrix2, int n){
        int[][] matrix;
        matrix = new int[n][2*n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = matrix1[i][j];
                matrix[i][j + 5] = matrix2[i][j];
            }
        }
        return matrix;
    }

    public static int[][] generateSpiralWith1(int n){
        int[][] matrix = new int[n][n];
        int j;
        int length = n;

        for (int i = 0; i <= n / 2; i++) {
            for (j = 0; j < length; j++) {
                matrix[i][i + j] = 1;
            }

            for (j = 1; j < length; j++) {
                matrix[i + j][n - 1 - i] = 1;
            }

            length -= 2;
        }

        return matrix;
    }

    /**
     * 10.Given number n. Create an array A [2 * n + 1] [2 * n + 1] and fill it in a
     * spiral, starting with the number 0 in the first cell A [0] [0]. The spiral goes
     * left, then turns down.
     * @param n
     * @return
     */
    public static int[][] generateSpiral(int n){
        int[][] matrix = new int[n][n];
        int j;
        int length = n;
        int num = 0;

        for (int i = 0; i <= n / 2; i++) {
            for (j = 0; j < length; j++) {
                matrix[i][i + j] = num;
                num++;
            }

            for (j = 1; j < length; j++) {
                matrix[i + j][n - 1 - i] = num;
                num++;
            }

            for (j = length - 2; j > -1; j--) {
                matrix[n - 1 - i][i + j] = num;
                num++;
            }

            for (j = length - 2; j > 0; j--) {
                matrix[i + j][i] = num;
                num++;
            }
            length -= 2;
        }

        return matrix;
    }











}
