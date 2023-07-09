package com.vkstech.leetcode.algorithms.numbers.easy;

public class SubtractProductAndSumOfDigits {

    public static int subtractProductAndSum(int n) {
        int[] productSumArr = new int[]{1, 0};
        while (n > 0) {
            productSumArr[0] *= (n % 10);
            productSumArr[1] += (n % 10);
            n /= 10;
        }
        return productSumArr[0] - productSumArr[1];
    }

    public static void main(String[] args) {
        int input = 705;
        System.out.println(subtractProductAndSum(input));
    }
}
