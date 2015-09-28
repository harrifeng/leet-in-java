package org.hfeng.leet.flattenbinarytreetolinkedlist;

import org.hfeng.leet.util.TreeNode;

public class Solution {
    public void flatten(TreeNode root) {
        root = getFlatten(root);
    }

    private TreeNode getFlatten(TreeNode root) {
        if (root == null) {
            return null;
        }

        if (root.left == null && root.right == null) {
            return root;
        }

        TreeNode oldTop = root;
        TreeNode oldRight = root.right;
        TreeNode newLeft = getFlatten(root.left);

        root.left = null;
        // null newLeft is also OK
        root.right  = newLeft;


        while (root.right != null) {
            root = root.right;
        }

        root.right = getFlatten(oldRight);
        return oldTop;
    }
}
