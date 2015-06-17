package org.hfeng.leet.binarytreezigzaglevelordertraversal;

import java.util.*;

import org.hfeng.leet.util.*;

public class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ret = new ArrayList<List<Integer>>();
        levelTravel(root, 1, ret, true);
        return ret;
    }

    private void levelTravel(TreeNode root, int level, List<List<Integer>> result, boolean leftToRight) {
        if (root == null) {
            return;
        }

        if (level > result.size()) {
            result.add(new ArrayList<Integer>());
        }

        if (leftToRight) {
            result.get(level - 1).add(root.val);
        } else {
            result.get(level - 1).add(0, root.val);
        }

        levelTravel(root.left, level + 1, result, !leftToRight);
        levelTravel(root.right, level + 1, result, !leftToRight);
    }
}
