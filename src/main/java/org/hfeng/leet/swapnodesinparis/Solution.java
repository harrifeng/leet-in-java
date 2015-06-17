package org.hfeng.leet.swapnodesinparis;

import org.hfeng.leet.util.ListNode;

public class Solution {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode newNext = head.next.next;
        ListNode newFront = head.next;

        head.next.next = head;
        head.next = swapPairs(newNext);
        return newFront;
    }
}
