package org.hfeng.leet.flattenbinarytreetolinkedlist;

import org.hfeng.leet.util.TreeNode;

public class Solution {
    public void flatten(TreeNode root) {
        root = flat(root);
    }

    private TreeNode flat(TreeNode root) {
        if (root == null) {
            return null;
        }
        TreeNode tmp = root;
        TreeNode tmpRight = root.right;
        root.right = flat(root.left);
        root.left = null;
        while (root.right != null) {
            root = root.right;
        }
        root.right = flat(tmpRight);
        return tmp;
    }
}
