package com.deetree;

/*
You are given two non-empty linked lists representing two non-negative integers.
The digits are stored in reverse order and each of their nodes contain a single digit.
Add the two numbers and return it as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.

Example:

Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
Output: 7 -> 0 -> 8
Explanation: 342 + 465 = 807.
 */
public class AddTwoNumbers {


    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);


        AddTwoNumbers add = new AddTwoNumbers();
        ListNode head = add.addTwoNumbers(l1, l2);
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        int carry = 0;
        ListNode dummy = new ListNode(0);
        ListNode head = dummy;
        int v1 = 0;
        int v2 = 0;

        while (l1 != null || l2 != null) {
            if (l1 != null) {
                v1 = l1.val;
                l1 = l1.next;
            } else {
                v1 = 0;
            }

            if (l2 != null) {
                v2 = l2.val;
                l2 = l2.next;
            } else {
                v2 = 0;
            }

            int sum = v1 + v2 + carry;
            carry = sum / 10;

            dummy.next = new ListNode(sum % 10);

            dummy = dummy.next;
        }
        if (carry > 0) {
            dummy.next = new ListNode(carry);
        }

        return head.next;
    }

}
