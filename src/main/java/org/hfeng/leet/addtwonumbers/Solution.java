package org.hfeng.leet.addtwonumbers;

import org.hfeng.leet.util.ListNode;

public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(-1);
        ListNode tmp = head;
        int carry = 0;
        while (l1 != null || l2 != null) {
            int v1 = (l1 != null) ? l1.val : 0;
            int v2 = (l2 != null) ? l2.val : 0;

            int sum = v1 + v2 + carry;
            head.next = new ListNode(sum % 10);
            head = head.next;

            carry = sum / 10;
            l1 = (l1 != null) ? l1.next : null;
            l2 = (l2 != null) ? l2.next : null;
        }
        if (carry > 0) {
            head.next = new ListNode(1);
        }
        return tmp.next;
    }
}
