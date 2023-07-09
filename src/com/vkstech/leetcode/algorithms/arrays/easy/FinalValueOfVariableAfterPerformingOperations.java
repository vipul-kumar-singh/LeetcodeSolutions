package com.vkstech.leetcode.algorithms.arrays.easy;

public class FinalValueOfVariableAfterPerformingOperations {

    public static int finalValueAfterOperations(String[] operations) {
        int x = 0;
        for (String operation : operations) {
            switch (operation) {
                case "++X":
                case "X++":
                    x++;
                    break;
                case "--X":
                case "X--":
                    x--;
                    break;
            }
        }
        return x;
    }

    public int finalValueAfterOperationsBest(String[] operations) {
        int x = 0;
        for (String op : operations) {
            x += (44 - op.charAt(1));

        }
        return x;
    }

    public static void main(String[] args) {
        String[] operations = {"--X", "X++", "X++"};
        int ans = finalValueAfterOperations(operations);
        System.out.println(ans);
    }
}
