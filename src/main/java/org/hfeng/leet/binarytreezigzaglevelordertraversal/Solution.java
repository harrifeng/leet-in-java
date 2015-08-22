package org.hfeng.leet.binarytreezigzaglevelordertraversal;

import java.util.*;

import org.hfeng.leet.util.*;

public class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> retV = new ArrayList<>();
        retV = zigzag(root);
        for (int i = 0; i < retV.size(); i++) {
            if (i % 2 == 1) {
                Collections.reverse(retV.get(i));
            }
        }
        return retV;
    }

    private List<List<Integer>> zigzag(TreeNode root) {
        List<List<Integer>> ret = new ArrayList<>();
        if (root == null) {
            return ret;
        }
        List<Integer> one = new ArrayList<>();
        one.add(root.val);
        ret.add(one);

        List<List<Integer>> left = zigzag(root.left);
        List<List<Integer>> right = zigzag(root.right);

        int maxLen = Math.max(left.size(), right.size());

        for (int i = 0; i < maxLen; i++) {
            List<Integer> zero = new LinkedList<>();
            if (left.size() > i) {
                zero.addAll(left.get(i));
            }
            if (right.size() > i) {
                zero.addAll(right.get(i));
            }
            ret.add(zero);
        }
        return ret;
    }
}
