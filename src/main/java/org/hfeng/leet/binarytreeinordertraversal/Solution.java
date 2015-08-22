package org.hfeng.leet.binarytreeinordertraversal;

import org.hfeng.leet.util.*;
import java.util.*;
public class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> retV = new ArrayList<>();
        inorder(root, retV);
        return retV;
    }

    private void inorder(TreeNode root, List<Integer> ret) {
        if (root == null) {
            return;
        }

        if (root.left != null) {
            inorder(root.left, ret);
        }
        ret.add(root.val);
        if (root.right != null) {
            inorder(root.right, ret);
        }
    }
}