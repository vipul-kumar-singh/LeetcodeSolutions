package com.vkstech.leetcode.algorithms.arrays.medium;

import java.util.Arrays;

public class PartitionAccordingPivot {

    public static int[] pivotArray(int[] nums, int pivot) {
        int[] arr = new int[nums.length];
        int leftIndex = 0;
        int rightIndex = nums.length - 1;
        int endIndex = nums.length - 1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < pivot) {
                arr[leftIndex++] = nums[i];
            }
            if (nums[endIndex - i] > pivot) {
                arr[rightIndex--] = nums[endIndex - i];
            }
        }

        while (leftIndex <= rightIndex) {
            arr[leftIndex++] = pivot;
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] nums = {9, 12, 5, 10, 14, 3, 10};
        int pivot = 10;

        int[] ans = pivotArray(nums, pivot);
        System.out.println(Arrays.toString(ans));
    }
}
