package com.vkstech.leetcode.algorithms.easy;

public class RichestCustomerWealth {

    public static int maximumWealth(int[][] accounts) {
        int maxWealth = 0;
        for (int[] account : accounts) {
            int currWealth = 0;
            for (int balance : account)
                currWealth += balance;

            if (currWealth > maxWealth)
                maxWealth = currWealth;
        }
        return maxWealth;
    }

    public static void main(String[] args) {
        int[][] input = new int[][]{{1,2,3},{3,2,1}};
        System.out.println(maximumWealth(input));
    }
}
