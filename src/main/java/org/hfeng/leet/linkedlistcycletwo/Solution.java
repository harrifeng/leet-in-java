package org.hfeng.leet.linkedlistcycletwo;

import org.hfeng.leet.util.ListNode;

public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        ListNode newSlow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if (fast == slow) {
                while (newSlow != slow) {
                    newSlow = newSlow.next;
                    slow = slow.next;
                }
                return newSlow;
            }
        }
        return null;
    }
}
