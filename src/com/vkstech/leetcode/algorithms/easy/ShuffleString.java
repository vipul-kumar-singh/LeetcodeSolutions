package com.vkstech.leetcode.algorithms.easy;

public class ShuffleString {

    public static String restoreString(String s, int[] indices) {
        char[] newArr = new char[indices.length];
        for (int i = 0; i < s.length(); i++) {
            newArr[indices[i]] = s.charAt(i);
        }
        return String.valueOf(newArr);
    }

    public static void main(String[] args) {
        String input = "codeleet";
        int[] indices = {4,5,6,7,0,2,1,3};
        System.out.println(restoreString(input, indices));
    }
}
