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

//////////////////////////////////////////////////////////////////////////
//         +---+                                                        //
//         |   |                                                        //
//     +---+---+                                                        //
//     |   |   |                                                        //
//     +---+---+                                                        //
//     |   |   |                                                        //
//     +---+---+---+                                                    //
//     |   |   |   |                                                    //
//     +---+---+---+                                                    //
//     |   |   |   |                                                    //
// +---+---++--++--+                                                    //
// |   |   |   |   |                                                    //
// +---+---+---+---+                                                    //
//   1   5   6   3                                                      //
//                                                                      //
// [1, 5, 6] are raising sequence, 3 is the one that stop this tread.   //
// 1 will likely be used by 3, but [5, 6] they will never use 3 if we   //
// left something like this. because we ONLY care about the max, after  //
// calculate the max for [1, 5, 6, 3], we can drop extra value: to make //
// it [1, 3, 3, 3, ...], and this is another raising tread              //
//     +---+---+---+                                                    //
//     |   |   |   |                                                    //
//     +---+---+---+                                                    //
//     |   |   |   |                                                    //
// +---+---++--++--+                                                    //
// |   |   |   |   |                                                    //
// +---+---+---+---+                                                    //
//   1   5   6   3                                                      //
//////////////////////////////////////////////////////////////////////////
