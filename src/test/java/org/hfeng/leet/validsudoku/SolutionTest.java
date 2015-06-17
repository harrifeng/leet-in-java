package org.hfeng.leet.validsudoku;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import static org.junit.Assert.assertEquals;

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
    public void testIsValidSudoku() throws Exception {
        char[][] arr1 = new char[][]{
                "..4...63.".toCharArray(),
                ".........".toCharArray(),
                "5......9.".toCharArray(),
                "...56....".toCharArray(),
                "4.3.....1".toCharArray(),
                "...7.....".toCharArray(),
                "...5.....".toCharArray(),
                ".........".toCharArray(),
                ".........".toCharArray()};
        assertEquals(false, solution.isValidSudoku(arr1));
        char[][] arr2 = new char[][]{
                "..4...83.".toCharArray(),
                ".........".toCharArray(),
                "5......9.".toCharArray(),
                "....6....".toCharArray(),
                "4.1.....2".toCharArray(),
                "...7.....".toCharArray(),
                ".........".toCharArray(),
                ".........".toCharArray(),
                ".........".toCharArray()};
        assertEquals(true, solution.isValidSudoku(arr2));
    }
}
