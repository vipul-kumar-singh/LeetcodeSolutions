package com.vkstech.leetcode.algorithms.easy;

public class SubArraySumOdd {

    public static int sumOddLengthSubarrays(int[] arr) {
        int sum = 0, n = arr.length;
        for (int i = 0; i < n; i ++ ) {
            sum += Math.ceil(((n - i) * (i+ 1))/2.0) * arr[i]; // use Math.floor for even
        }
        return sum;
    }

    public static int sumAllLengthSubarrays(int[] arr) {
        int sum = 0, n = arr.length;
        for (int i = 0; i < n; i+=2) {
            sum += (n - i) * (i+ 1) * arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 2, 5, 3};
        System.out.println(sumOddLengthSubarrays(arr));
    }
}
