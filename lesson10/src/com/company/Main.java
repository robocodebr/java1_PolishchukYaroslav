package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        //int[][] arr2 = new int[3][3];
        /*int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
        int[][] arr = {{1, 2, 3}, {4, 1, 6}, {7, 1, 1}};
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                 arr[i][i] = random.nextInt(40);
            }
            System.out.println(Arrays.toString(arr[i]));
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println((arr[arr.length - 1 - i][i]));

        }
        for (int d = 0; d < arr.length; d++) {
            System.out.println(arr[d][d]);*/
method1();
    }

    public static void method1() {
        int sum = 0;
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] arr2 = {{1, 2, 3}, {4, 59, 6}, {7, 8, 9}};
        int[][] arr3 =Arrays.copyOf(arr2, arr2.length);
        //System.out.println(Arrays.deepToString(arr));
        System.out.println(Arrays.deepToString(arr3));
        //System.out.println(Arrays.deepEquals(arr,arr2));
    }
}

