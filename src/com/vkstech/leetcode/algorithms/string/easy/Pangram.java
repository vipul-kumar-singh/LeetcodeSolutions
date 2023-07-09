package com.vkstech.leetcode.algorithms.string.easy;

import java.util.HashSet;
import java.util.Set;

public class Pangram {

    public static boolean checkIfPangram(String sentence) {
        Set<Character> uniqueCharSet = new HashSet<>(sentence.length());
        for (char c : sentence.toCharArray())
            uniqueCharSet.add(c);
        return uniqueCharSet.size() == 26;
    }

    public static void main(String[] args) {
        String input = "thequickbrownfoxjumpsoverthelazydog";
        System.out.println(checkIfPangram(input));
    }
}
