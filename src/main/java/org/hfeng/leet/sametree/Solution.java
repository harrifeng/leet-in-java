package org.hfeng.leet.sametree;

import org.hfeng.leet.util.TreeNode;
public class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }
        // After first judegment, not all the node are null here.
        if (p == null || q == null) {
            return false;
        }

        return (p.val == q.val) && isSameTree(p.left, q.left)
            && isSameTree(p.right, q.right);
    }
}
