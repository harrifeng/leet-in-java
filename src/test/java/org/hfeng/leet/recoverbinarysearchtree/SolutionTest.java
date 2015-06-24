package org.hfeng.leet.recoverbinarysearchtree;

import org.hfeng.leet.util.TreeNode;
import org.hfeng.leet.util.TreeNodeHelper;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

import static org.junit.Assert.*;

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
    public void testInorderTraversal() throws Exception {
        TreeNode t1 = TreeNodeHelper.createListFromArray(new int[]{4, 2, 6, 1, 7, 5, 3});
        TreeNode e1 = TreeNodeHelper.createListFromArray(new int[]{4, 2, 6, 1, 3, 5, 7});
        solution.recoverTree(t1);

        TreeNodeHelper.assertEqualTree(e1, t1);
    }
}
