package org.hfeng.leet.evaluatereversepolishnotation;

import java.util.*;

public class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<Integer>();
        for (int i = 0; i < tokens.length; i++) {
            char now = tokens[i].charAt(0);
            if (Character.isDigit(now)) {
                //stack.push(Character.digit(now, 10));
                stack.push(Integer.parseInt(tokens[i]));
            } else {
                int two = stack.pop();
                int one = stack.pop();
                switch (now) {
                case '+':
                    stack.push(one + two);
                    break;
                case '-':
                    stack.push(one - two);
                    break;
                case '*':
                    stack.push(one * two);
                    break;
                case '/':
                    stack.push(one / two);
                    break;
                default:
                    break;
                }
            }
        }
        return stack.pop();
    }
}
