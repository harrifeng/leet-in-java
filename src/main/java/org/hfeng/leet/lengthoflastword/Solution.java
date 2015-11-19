package org.hfeng.leet.lengthoflastword;

import java.util.*;

public class Solution {
    public int lengthOfLastWord(String s) {
        int len  = s.length();
        if (len == 0 || s == null) {
            return 0;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = len - 1; i >= 0; i--) {
            char cur = s.charAt(i);
            if (cur == ' ') {
                if (sb.length() > 0) {
                    return sb.length();
                }
                continue;
            } else {
                sb.insert(0, cur);
            }
        }
        return sb.length();
    }
}
