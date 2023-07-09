package com.vkstech.leetcode.algorithms.linkedlist.easy;

public class BinaryLinkedListToDecimal {

    public static int getDecimalValue(ListNode head) {
        int decimal = 0;
        while (head != null) {
            decimal = decimal * 2 + head.val;
            head = head.next;
        }
        return decimal;
    }

    public static void main(String[] args) {
        ListNode listNode = new ListNode(1, new ListNode(0, new ListNode(1)));
        System.out.println(getDecimalValue(listNode));
    }

}


class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
