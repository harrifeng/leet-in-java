package org.hfeng.leet.binarytreelevelordertraversaltwo;

import org.hfeng.leet.util.*;

import java.util.*;

public class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> ret = new ArrayList<List<Integer>>();

        if (root == null) {
            return ret;
        }

        List<List<Integer>> left = levelOrderBottom(root.left);
        List<List<Integer>> right = levelOrderBottom(root.right);

        int maxLen = Math.max(left.size(), right.size());

        for (int i = 0; i < maxLen; i++) {
            List<Integer> zero = new ArrayList<>();
            if (left.size() - maxLen + i >= 0) {
                zero.addAll(left.get(left.size() - maxLen + i));
            }
            if (right.size() - maxLen + i >= 0) {
                zero.addAll(right.get(right.size() - maxLen + i));
            }
            ret.add(zero);
        }

        List<Integer> one = new ArrayList<>();
        one.add(root.val);
        ret.add(one);
        return ret;
    }
}
