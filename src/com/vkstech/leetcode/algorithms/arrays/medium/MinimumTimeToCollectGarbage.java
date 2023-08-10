package com.vkstech.leetcode.algorithms.arrays.medium;

/**
 * 2391. Minimum Amount of Time to Collect Garbage
 */
public class MinimumTimeToCollectGarbage {

    private static final String P = "P";
    private static final String G = "G";
    private static final String M = "M";

    public static int garbageCollection(String[] garbage, int[] travel) {
        int totalTime = 0;

        int[] countArr = new int[3];

        for (int i = 0; i < garbage.length; i++) {
            String current = garbage[i];
            if (current.contains(G)) {
                countArr[0] = i;
            }

            if (current.contains(P)) {
                countArr[1] = i;
            }

            if (current.contains(M)) {
                countArr[2] = i;
            }
            totalTime += current.length();
        }

        for (int i = 1; i < travel.length; i++) {
            travel[i] = travel[i] + travel[i - 1];
        }

        for (Integer i : countArr) {
            if (i != 0)
                totalTime += travel[i - 1];
        }

        return totalTime;
    }

    public static void main(String[] args) {
        String[] garbage = {"G", "P", "GP", "GG"};
        int[] travel = {2, 4, 3};

        int time = garbageCollection(garbage, travel);
        System.out.println(time);

        String[] garbage1 = {"MMM", "PGM", "GP"};
        int[] travel1 = {3, 10};

        int time1 = garbageCollection(garbage1, travel1);
        System.out.println(time1);
    }
}
