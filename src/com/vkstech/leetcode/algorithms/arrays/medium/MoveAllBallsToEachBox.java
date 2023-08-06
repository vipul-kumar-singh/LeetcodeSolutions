package com.vkstech.leetcode.algorithms.arrays.medium;

import java.util.Arrays;

public class MoveAllBallsToEachBox {

    public static int[] minOperations(String boxes) {
        int n = boxes.length();

        int[] arr = new int[boxes.length()];

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {
                int diff = Math.abs(i - j);

                if (diff > 0 && boxes.charAt(j) - 48 == 1) {
                    arr[i] += diff;
                }
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        String boxes1 = "110";
        int[] solution1 = minOperations(boxes1);
        System.out.println(Arrays.toString(solution1));

        String boxes2 = "001011";
        int[] solution2 = minOperations(boxes2);
        System.out.println(Arrays.toString(solution2));
    }
}
