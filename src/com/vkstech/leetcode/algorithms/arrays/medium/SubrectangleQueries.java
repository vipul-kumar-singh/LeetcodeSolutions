package com.vkstech.leetcode.algorithms.arrays.medium;

public class SubrectangleQueries {

    int[][] rectangle;

    public SubrectangleQueries(int[][] rectangle) {
        this.rectangle = rectangle;
    }

    public void updateSubrectangle(int row1, int col1, int row2, int col2, int newValue) {
        for (int i = row1; i <= row2; i++) {
            for (int j = col1; j <= col2; j++) {
                rectangle[i][j] = newValue;
            }
        }
    }

    public int getValue(int row, int col) {
        return rectangle[row][col];
    }

    public static void main(String[] args) {
        int[][] rectangle = {{1, 2, 1}, {4, 3, 4}, {3, 2, 1}, {1, 1, 1}};

        SubrectangleQueries subrectangleQueries = new SubrectangleQueries(rectangle);
        // The initial rectangle (4x3) looks like:
        // 1 2 1
        // 4 3 4
        // 3 2 1
        // 1 1 1

        System.out.println(subrectangleQueries.getValue(0, 2)); // return 1

        subrectangleQueries.updateSubrectangle(0, 0, 3, 2, 5);
        // After this update the rectangle looks like:
        // 5 5 5
        // 5 5 5
        // 5 5 5
        // 5 5 5

        System.out.println(subrectangleQueries.getValue(0, 2)); // return 5
        System.out.println(subrectangleQueries.getValue(3, 1)); // return 5

        subrectangleQueries.updateSubrectangle(3, 0, 3, 2, 10);
        // After this update the rectangle looks like:
        // 5   5   5
        // 5   5   5
        // 5   5   5
        // 10  10  10

        System.out.println(subrectangleQueries.getValue(3, 1)); // return 10
    }
}
