package com.vkstech.leetcode.algorithms.arrays;

import java.util.Arrays;
import java.util.List;

public class ArrayUtils {

    public static void printMatrix(int[][] matrix) {
        for (int[] arr : matrix) {
            System.out.println(Arrays.toString(arr));
        }
    }

    public static void printMatrix(List<List<Integer>> matrix) {
        matrix.forEach(list -> {
            list.forEach(obj -> System.out.print(obj + " "));
            System.out.println();
        });
    }
}
