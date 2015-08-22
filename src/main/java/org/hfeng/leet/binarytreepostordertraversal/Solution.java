package org.hfeng.leet.binarytreepostordertraversal;

import java.util.*;

import org.hfeng.leet.util.*;

public class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> retV = new ArrayList<>();
        post(root, retV);
        return retV;
    }

    private void post(TreeNode root, List<Integer> ret) {
        if (root == null) {
            return;
        }
        if (root.left != null) {
            post(root.left, ret);
        }

        if (root.right != null) {
            post(root.right, ret);
        }

        ret.add(root.val);
    }
}
