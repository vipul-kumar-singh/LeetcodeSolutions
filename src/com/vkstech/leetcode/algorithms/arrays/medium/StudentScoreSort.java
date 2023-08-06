package com.vkstech.leetcode.algorithms.arrays.medium;

import com.vkstech.leetcode.algorithms.arrays.ArrayUtils;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class StudentScoreSort {

    public static int[][] sortTheStudents(int[][] score, int k) {
        Map<Integer, int[]> map = new TreeMap<>(Collections.reverseOrder());

        for (int[] row : score) {
            map.put(row[k], row);
        }

        int i = 0;
        for (int[] value : map.values()) {
            score[i] = value;
            i++;
        }
        return score;
    }

    public static void main(String[] args) {
        int[][] score = {{10, 6, 9, 1}, {7, 5, 11, 2}, {4, 8, 3, 15}};
        int k = 2;

        int[][] sortedArr = sortTheStudents(score, k);

        ArrayUtils.printMatrix(sortedArr);
    }
}
