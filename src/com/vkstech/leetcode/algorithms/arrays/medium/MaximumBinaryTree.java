package com.vkstech.leetcode.algorithms.arrays.medium;

import com.vkstech.leetcode.algorithms.arrays.TreeNode;

import java.util.Arrays;

public class MaximumBinaryTree {

    public static TreeNode constructMaximumBinaryTree(int[] nums) {
        int maxValue = nums[0];
        int maxIndex = 0;

        for (int i = 1; i < nums.length; i++) {
            if (maxValue < nums[i]) {
                maxValue = nums[i];
                maxIndex = i;
            }
        }
        TreeNode left = null;
        if (maxIndex != 0) {
            left = constructMaximumBinaryTree(Arrays.copyOfRange(nums, 0, maxIndex));
        }

        TreeNode right = null;
        if (maxIndex + 1 != nums.length) {
            right = constructMaximumBinaryTree(Arrays.copyOfRange(nums, maxIndex + 1, nums.length));
        }
        return new TreeNode(maxValue, left, right);
    }

    public static void main(String[] args) {
        int[] nums = {3, 2, 1, 6, 0, 5};
        TreeNode treeNode = constructMaximumBinaryTree(nums);
        System.out.println(treeNode.toString());

    }
}
