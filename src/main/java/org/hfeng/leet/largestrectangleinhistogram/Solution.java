package org.hfeng.leet.largestrectangleinhistogram;

import java.util.Stack;

public class Solution {
    public int largestRectangleArea(int[] height) {
        Stack<Integer> stack = new Stack<Integer>();
        int ret = 0;
        // To be able to get one more element more to take last
        // element into consideration
        int[] anotherHeight = new int[height.length + 1];
        System.arraycopy(height, 0, anotherHeight, 0, height.length);
        anotherHeight[height.length] = 0;
        height = anotherHeight;
        for (int i = 0; i < height.length; ) {
            if (stack.empty() || height[i] > height[stack.peek()]) {
                stack.push(i++);
            } else {
                int tmp = stack.pop();
                if (stack.empty()) {
                    ret = Math.max(ret, height[tmp] * i);
                } else {
                    ret = Math.max(ret, height[tmp] * (i - stack.peek() - 1));
                }
            }
        }
        return ret;
    }
}

///////////////////////////////////////////////////////////////////////
//         +---+                                                     //
//         |   |                                                     //
//     +---+---+                                                     //
//     |   |   |                                                     //
//     +---+---+                                                     //
//     |   |   |                                                     //
//     +---+---+                                                     //
//     |   |   |                                                     //
//     +---+---+                                                     //
//     |   |   |                                                     //
// +---+---++--+                                                     //
// |   |   |   |                                                     //
// +---+---+---+                                                     //
//   1   5   6                                                       //
//                                                                   //
// Find each increasing group and counting the size in reverse order //
// => 6 * 1                                                          //
// => 5 * 2 ==> winner                                               //
// => 1 * 3                                                          //
///////////////////////////////////////////////////////////////////////
