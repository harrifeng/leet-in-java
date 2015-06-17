package org.hfeng.leet.removeduplicatefromsortedlist;

import org.hfeng.leet.util.ListNode;

public class Solution {
    public ListNode deleteDuplicate(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode before = head;
        ListNode after = head.next;
        while (after != null){
            if (before.val != after.val) {
                before.next = after;
                before = before.next;
            }
            after = after.next;
        }
        before.next = null;
        return head;
    }
}