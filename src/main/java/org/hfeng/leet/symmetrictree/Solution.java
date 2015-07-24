package org.hfeng.leet.symmetrictree;

import org.hfeng.leet.util.TreeNode;

import java.util.*;

public class Solution {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        List<Integer> ret = new ArrayList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode head = queue.poll();
            if (head == null) {
                ret.add(-1);
                continue;
            } else {
                ret.add(head.val);
            }
            queue.add(head.left);
            queue.add(head.right);

        }
        int len = Integer.highestOneBit(ret.size());
        List<Integer> tt = ret.subList(0, len - 1);
        return isOK(tt);
    }

    private boolean isOK(List<Integer> list) {
        if (list.size() == 1) {
            return true;
        }
        int mid = list.size() / 2;
        return isOK(list.subList(0, mid)) && isSym(list.subList(mid, list.size()));
    }

    private boolean isSym(List<Integer> list) {
        if (list.size() % 2 == 1) {
            return false;
        }
        int beg = 0;
        int end = list.size() - 1;
        while (beg < end) {
            if (list.get(beg) != list.get(end)) {
                return false;
            }
            beg++;
            end--;
        }
        return true;
    }

}