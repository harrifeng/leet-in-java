package org.hfeng.leet.binarytreezigzaglevelordertraversal;

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
        TreeNode t1 = TreeNodeHelper.createListFromArray(new int[]{1, 2, 3, 4, 5, 6, 7});
        List<List<Integer>> e1 = new ArrayList<List<Integer>>();

        e1.add(new ArrayList<Integer>(Arrays.asList(new Integer[]{1,})));
        e1.add(new ArrayList<Integer>(Arrays.asList(new Integer[]{3, 2})));
        e1.add(new ArrayList<Integer>(Arrays.asList(new Integer[]{4, 5, 6, 7})));
        assertEquals(e1, solution.zigzagLevelOrder(t1));
    }
}
