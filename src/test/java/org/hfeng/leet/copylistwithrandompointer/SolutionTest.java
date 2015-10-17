package org.hfeng.leet.copylistwithrandompointer;

import org.hfeng.leet.util.RandomListNode;
import org.hfeng.leet.util.RandomListNodeHelper;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


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
    public void testCopyRandomList() throws Exception {
        RandomListNode h1 = RandomListNodeHelper.createListFramArray(new int[] {1, 2, 3, 4});
        RandomListNode e1 = h1;
        RandomListNodeHelper.assertEqualList(e1, solution.copyRandomList(h1));
    }
}
