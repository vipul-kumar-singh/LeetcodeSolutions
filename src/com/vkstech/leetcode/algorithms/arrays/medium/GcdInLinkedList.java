package com.vkstech.leetcode.algorithms.arrays.medium;

import com.vkstech.leetcode.algorithms.arrays.ListNode;

/**
 * 2807. Insert Greatest Common Divisors in Linked List
 */
public class GcdInLinkedList {

    public static ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode initPointer = head;

        while (head.next != null) {
            int gcd = calculateGcd(head.val, head.next.val);
            ListNode gcdNode = new ListNode(gcd, head.next);
            head.next = gcdNode;
            head = gcdNode.next;
        }

        return initPointer;
    }

    public static int calculateGcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        int[] heads = {18, 6, 10, 3};

        ListNode head = ListNode.createListNode(heads, heads.length);
        ListNode listNode = insertGreatestCommonDivisors(head);
        ListNode.printListNode(listNode);

    }
}
