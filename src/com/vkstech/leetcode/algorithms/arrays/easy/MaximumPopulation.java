package com.vkstech.leetcode.algorithms.arrays.easy;

public class MaximumPopulation {

    public static int maximumPopulation(int[][] logs) {
        int[] popArr = new int[101];

        for (int[] log : logs) { // line sweep
            popArr[log[0] - 1950] += 1;
            popArr[log[1] - 1950] -= 1;
        }

        int minYear = 0;
        int maxPop = popArr[0];

        for (int i = 1; i < popArr.length; i++) {
            popArr[i] += popArr[i - 1]; // prefix sum
            if (popArr[i] > maxPop) {
                maxPop = popArr[i];
                minYear = i;
            }
        }

        return 1950 + minYear;
    }

    public static void main(String[] args) {
        int[][] logs = {{1993, 1999}, {2000, 2010}};
//        int[][] logs = {{1950, 1961}, {1960, 1971}, {1970, 1981}};
        System.out.println(maximumPopulation(logs));
    }

}
