package com.vkstech.leetcode.algorithms.linkedlist.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OrderedStream {

    int ptr;
    String[] res;

    public OrderedStream(int n) {
        ptr = 0;
        res = new String[n];
    }

    public List<String> insert(int id, String value) {
        List<String> list = new ArrayList<>(ptr);

        res[id - 1] = value;
        while (ptr < res.length && res[ptr] != null) {
            list.add(res[ptr]);
            ptr++;
        }

        return list;
    }

    public static void main(String[] args) {
        OrderedStream os = new OrderedStream(5);
        os.insert(3, "ccccc"); // Inserts (3, "ccccc"), returns [].
        os.insert(1, "aaaaa"); // Inserts (1, "aaaaa"), returns ["aaaaa"].
        os.insert(2, "bbbbb"); // Inserts (2, "bbbbb"), returns ["bbbbb", "ccccc"].
        os.insert(5, "eeeee"); // Inserts (5, "eeeee"), returns [].
        os.insert(4, "ddddd"); // Inserts (4, "ddddd"), returns ["ddddd", "eeeee"].
        // Concatentating all the chunks returned:
        // [] + ["aaaaa"] + ["bbbbb", "ccccc"] + [] + ["ddddd", "eeeee"] = ["aaaaa", "bbbbb", "ccccc", "ddddd", "eeeee"]
        // The resulting order is the same as the order above.
        System.out.println(Arrays.toString(os.res));
    }
}
