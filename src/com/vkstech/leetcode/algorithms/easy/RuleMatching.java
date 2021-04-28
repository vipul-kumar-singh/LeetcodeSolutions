package com.vkstech.leetcode.algorithms.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RuleMatching {

    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int index = -1;
        switch (ruleKey) {
            case "type":
                index = 0;
                break;
            case "color":
                index = 1;
                break;
            case "name":
                index = 2;
                break;
        }

        int count = 0;
        for (List<String> item : items) {
            if (item.get(index).equals(ruleValue)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        List<String> item1 = Arrays.asList("phone", "blue", "pixel");
        List<String> item2 = Arrays.asList("computer", "silver", "lenovo");
        List<String> item3 = Arrays.asList("phone", "gold", "iphone");
        List<List<String>> itemsList = new ArrayList<>();
        itemsList.add(item1);
        itemsList.add(item2);
        itemsList.add(item3);

        String ruleKey = "color";
        String ruleValue = "silver";

        System.out.println(countMatches(itemsList, ruleKey, ruleValue));

    }
}
