package org.hfeng.leet.flattenbinarytreetolinkedlist;

import org.hfeng.leet.util.TreeNode;
import org.hfeng.leet.util.TreeNodeHelper;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;

public class SolutionTest {
    Solution solution;

    @Before
    public void before() throws Exception {
        solution = new Solution();
    }

    @After
    public void after() throws Exception {
    }

    @Test
    public void testIsBalanced() throws Exception {
        TreeNode l1 = TreeNodeHelper.createListFromArray(new int[]{1, 2, 5, 3, 4, -1, 6});

          TreeNode e1 = TreeNodeHelper.createListFromArray(new int[]{1, -1, 2, -1, 3, -1, 4, -1, 5, -1, 6});
        solution.flatten(l1);
        TreeNodeHelper.assertEqualTree(e1, l1);
    }
}
