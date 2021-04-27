package com.vkstech.leetcode.algorithms.easy;

public class NumberOfSteps {

    public static int numberOfSteps(int num) {
        int count = 0;

        while (num != 0) {
            num = num % 2 == 0 ? num / 2 : num - 1;
            count++;
        }

        return count;
    }

    public static void main(String[] args) {
        int input = 14;
        System.out.println(numberOfSteps(input));
    }
}
