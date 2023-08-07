package com.vkstech.leetcode.algorithms.arrays.medium;

import com.vkstech.leetcode.algorithms.arrays.ArrayUtils;

import java.util.ArrayList;
import java.util.List;

public class ConvertArrayInto2DArray {

    public static List<List<Integer>> findMatrix(int[] nums) {
        List<List<Integer>> lists = new ArrayList<>();
        lists.add(new ArrayList<>());


        for (int num : nums) {
            List<Integer> integerList = lists.stream().filter(list -> !list.contains(num)).findFirst().orElse(null);

            if (integerList == null) {
                integerList = new ArrayList<>();
                integerList.add(num);
                lists.add(integerList);
            } else {
                integerList.add(num);
            }

        }

        return lists;
    }

    public static List<List<Integer>> findMatrixOptimized(int[] A) {
        ArrayList<List<Integer>> res = new ArrayList<>();
        int n = A.length;
        int[] count = new int[n + 1];
        for (int a : A) {
            if (res.size() < ++count[a])
                res.add(new ArrayList<>());
            res.get(count[a] - 1).add(a);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 4, 1, 2, 3, 1};
        List<List<Integer>> matrix = findMatrix(nums);
        ArrayUtils.printMatrix(matrix);
    }
}
