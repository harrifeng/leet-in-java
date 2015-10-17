package org.hfeng.leet.copylistwithrandompointer;

import org.hfeng.leet.util.RandomListNode;

public class Solution {
    public RandomListNode copyRandomList(RandomListNode head) {
        RandomListNode tmp = head;
        while (head != null) {
            RandomListNode oldNext = head.next;
            head.next = new RandomListNode(head.label);
            head.next.next = oldNext;
            head = oldNext;
        }
        head = tmp;

        // two points here:
        // 1. head.random is not null, so that you can use head.random.next,
        //    already remember to check null if tow '.' show
        // 2. we should link the random before break the old list
        while (head != null) {
            head.next.random = head.random == null ? null : head.random.next;
            head = head.next.next;
        }

        RandomListNode start = new RandomListNode(-1);
        RandomListNode ret = start;
        while (tmp != null) {
            start.next = tmp.next;
            start = start.next;
            tmp.next = tmp.next.next;
            tmp = tmp.next;
        }
        return ret.next;
    }
}
