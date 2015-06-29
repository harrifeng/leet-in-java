package org.hfeng.leet.sametree;

import org.hfeng.leet.util.TreeNode;
import org.hfeng.leet.util.TreeNodeHelper;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import java.util.*;

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
    public void testZigzagLevelOrder() throws Exception {
        TreeNode l1 = TreeNodeHelper.createListFromArray(new int[]{1, 2, 3, 4, 5, 6, 7});
        TreeNode r1 = TreeNodeHelper.createListFromArray(new int[]{1, 2, 3, 4, 5, 6, 7});
        boolean e1 = true;
        assertEquals(e1, solution.isSameTree(l1, r1));


        TreeNode l2 = TreeNodeHelper.createListFromArray(new int[]{1, 2, 3, 4, 7, 6, 11});
        TreeNode r2 = TreeNodeHelper.createListFromArray(new int[]{1, 2, 3, 4, 5, 6, 7});
        boolean e2 = false;
        assertEquals(e2, solution.isSameTree(l2, r2));

    }
}
