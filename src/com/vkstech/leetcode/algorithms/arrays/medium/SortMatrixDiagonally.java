package com.vkstech.leetcode.algorithms.arrays.medium;

import com.vkstech.leetcode.algorithms.arrays.ArrayUtils;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * 1329. Sort the Matrix Diagonally
 */
public class SortMatrixDiagonally {

    public static int[][] diagonalSort(int[][] mat) {
        int rows = mat.length;
        int cols = mat[0].length;
        int diagonals = rows + cols - 1;

        for (int diagonal = 0; diagonal < diagonals; diagonal++) {
            int startRow = Math.max(0, diagonal - cols + 1);
            int count = Math.min(diagonal + 1, Math.min(rows, cols));

            Queue<Integer> queue = new PriorityQueue<>();

            for (int i = 0; i < count; i++) {
                int row = startRow + i;
                int col = cols - 1 - (diagonal - row);
                if (row >= 0 && row < rows && col >= 0 && col < cols) {
                    queue.add(mat[row][col]);
                }
            }

            for (int i = 0; i < count; i++) {
                int row = startRow + i;
                int col = cols - 1 - (diagonal - row);
                if (row >= 0 && row < rows && col >= 0 && col < cols) {
                    mat[row][col] = queue.remove();

                }
            }
        }

        return mat;
    }

    public static void main(String[] args) {
        int[][] mat = {{3, 3, 1, 1}, {2, 2, 1, 2}, {1, 1, 1, 2}};
        int[][] result = diagonalSort(mat);
        ArrayUtils.printMatrix(result);
    }
}
