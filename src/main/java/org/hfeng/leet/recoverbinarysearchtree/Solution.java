package org.hfeng.leet.recoverbinarysearchtree;

import org.hfeng.leet.util.TreeNode;
import java.util.*;

public class Solution {
    public void recoverTree(TreeNode root) {
        List<TreeNode> list = new ArrayList<TreeNode>();
        List<Integer> value = new ArrayList<Integer>();
        inOrderTravel(root, list, value);

        Collections.sort(value);
        for (int i = 0; i < list.size(); i++) {
            list.get(i).val = value.get(i);
        }

    }

    private void inOrderTravel(TreeNode root, List<TreeNode> list, List<Integer> value) {
        if (root == null) {
            return;
        }

        inOrderTravel(root.left, list, value);
        list.add(root);
        value.add(root.val);
        inOrderTravel(root.right, list, value);
    }
}
