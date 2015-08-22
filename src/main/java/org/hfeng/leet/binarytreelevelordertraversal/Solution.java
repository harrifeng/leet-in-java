package org.hfeng.leet.binarytreelevelordertraversal;

import java.util.*;

import org.hfeng.leet.util.*;

public class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> ret = new ArrayList<List<Integer>>();
        if (root == null) {
            return ret;
        }

        queue.add(root);
        List<Integer> nowList = new ArrayList<>();
        nowList.add(root.val);
        int nowLen = 1;
        int nextLen = 0;
        if (root.left != null) {
            nextLen++;
        }
        if (root.right != null) {
            nextLen++;
        }

        while (!queue.isEmpty()) {
            TreeNode now = queue.remove();
            if (nowList.size() == nowLen) {
                ret.add(nowList);
                nowList = new ArrayList<>();
                if (nextLen == 0) {
                    return ret;
                }
                nowLen = nextLen;
                nextLen = 0;
            }
            if (now.left != null) {
                queue.add(now.left);
                nowList.add(now.left.val);
                if (now.left.left != null) {
                    nextLen++;
                }
                if (now.left.right != null) {
                    nextLen++;
                }
            }

            if (now.right != null) {
                queue.add(now.right);
                nowList.add(now.right.val);
                if (now.right.left != null) {
                    nextLen++;
                }
                if (now.right.right != null) {
                    nextLen++;
                }
            }

        }
        return ret;
    }
}
