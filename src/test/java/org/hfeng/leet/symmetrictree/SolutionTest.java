package org.hfeng.leet.symmetrictree;

import org.hfeng.leet.util.TreeNode;
import org.hfeng.leet.util.TreeNodeHelper;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;

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
    public void testIsSymmetricTree() throws Exception {
        TreeNode l1 = TreeNodeHelper.createListFromArray(new int[]{1, 2, 2, -1, 4, 4});
        assertTrue(solution.isSymmetric(l1));

        TreeNode l2 = TreeNodeHelper.createListFromArray(new int[]{1, 2, 3, 4, 7, 6, 11});
        assertFalse(solution.isSymmetric(l2));

        TreeNode l3 = TreeNodeHelper.createListFromArray(new int[]{2, 3, 3, 4, 5, 5, 4, -1, -1, 8, 9, 9, 8});
        assertTrue(solution.isSymmetric(l3));

    }
}
