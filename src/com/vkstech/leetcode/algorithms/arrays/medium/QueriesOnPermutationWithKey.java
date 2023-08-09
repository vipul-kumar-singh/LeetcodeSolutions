package com.vkstech.leetcode.algorithms.arrays.medium;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * 1409. Queries on a Permutation With Key
 */
public class QueriesOnPermutationWithKey {

    public static int[] processQueries(int[] queries, int m) {
        int[] P = IntStream.rangeClosed(1, m).toArray();

        int[] result = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {

            int j = 0;
            while (j < m) {
                if (queries[i] == P[j]) {
                    result[i] = j;
                    break;
                }
                j++;
            }

            int temp = P[j];
            for (; j > 0; j--) {
                P[j] = P[j - 1];
            }

            P[0] = temp;
        }

        return result;
    }

    public static void main(String[] args) {
        int[] queries = {3, 1, 2, 1};
        int m = 5;
        int[] result = processQueries(queries, m);
        System.out.println(Arrays.toString(result));
    }
}
