package com.vkstech.leetcode.algorithms.arrays.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupThePeople {

    public static List<List<Integer>> groupThePeople(int[] groupSizes) {
        Map<Integer, List<Integer>> mapOfList = new HashMap<>();
        List<List<Integer>> lists = new ArrayList<>();

        for (int i = 0; i < groupSizes.length; i++) {
            int groupSize = groupSizes[i];

            if (!mapOfList.containsKey(groupSize)) {
                updateMap(mapOfList, i, groupSize);
            } else {

                if (mapOfList.get(groupSize).size() == groupSize) {
                    lists.add(mapOfList.get(groupSize));
                    updateMap(mapOfList, i, groupSize);
                } else  {
                    mapOfList.get(groupSize).add(i);
                }
            }

        }

        lists.addAll(mapOfList.values());
        return lists;
    }

    private static void updateMap(Map<Integer, List<Integer>> mapOfList, int i, int groupSize) {
        List<Integer> list = new ArrayList<>();
        list.add(i);
        mapOfList.put(groupSize, list);
    }

    public static void main(String[] args) {
        int[] groupSizes = {3, 3, 3, 3, 3, 1, 3};
        List<List<Integer>> lists = groupThePeople(groupSizes);

        for (List<Integer> list : lists) {
            System.out.println(list.toString());
        }
    }
}
