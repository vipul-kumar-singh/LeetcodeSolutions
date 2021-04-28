package com.vkstech.leetcode.algorithms.easy;

import java.util.ArrayList;
import java.util.Arrays;

public class TargetArrayOrder {

    public static int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> a = new ArrayList<Integer>();
        for (int i = 0; i < nums.length; i++) {
            a.add(index[i], nums[i]);
        }
        int target[] = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            target[i] = a.get(i);
        }
        return target;
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 3, 4};
        int[] index = {0, 1, 2, 2, 1};
        System.out.println(Arrays.toString(createTargetArray(nums, index)));
    }
}
