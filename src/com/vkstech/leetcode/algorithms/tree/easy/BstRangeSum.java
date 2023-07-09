package com.vkstech.leetcode.algorithms.tree.easy;

public class BstRangeSum {
    public static int rangeSumBST(TreeNode root, int low, int high) {
        if (root == null)
            return 0;
        if (root.val < low) {
            return rangeSumBST(root.right, low, high);
        } else if (root.val > high) {
            return rangeSumBST(root.left, low, high);
        }
        return root.val + rangeSumBST(root.left, low, high) + rangeSumBST(root.right, low, high);

    }

    public static void main(String[] args) {
        TreeNode left = new TreeNode(5, new TreeNode(3), new TreeNode(7));
        TreeNode right = new TreeNode(15, null, new TreeNode(18));
        TreeNode root = new TreeNode(10, left, right);
        System.out.println(rangeSumBST(root, 7, 15));
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}