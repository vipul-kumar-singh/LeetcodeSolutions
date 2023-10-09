package com.vkstech.leetcode.algorithms.arrays;

public class ListNode {
    public int val;
    public ListNode next;

    public ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public static ListNode createListNode(int[] arr, int i){
        if (i == 1){
            return new ListNode(arr[arr.length-i]);
        } else {
            return new ListNode(arr[arr.length-i], createListNode(arr, i-1));
        }
    }

    public static void printListNode(ListNode head){
        while (head.next != null){
            System.out.println(head.val);
            head = head.next;
        }
        System.out.println(head.val);
    }
}
