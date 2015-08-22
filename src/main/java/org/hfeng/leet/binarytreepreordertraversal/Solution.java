package org.hfeng.leet.binarytreepreordertraversal;

import org.hfeng.leet.util.*;

import java.util.*;

public class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> retV = new ArrayList<>();
        preorder(root, retV);

        return retV;
    }

    private void preorder(TreeNode root, List<Integer> ret) {
        if (root == null) {
            return;
        }
        ret.add(root.val);
        if (root.left != null) {
            preorder(root.left, ret);
        }
        if (root.right != null) {
            preorder(root.right, ret);
        }
    }
}
