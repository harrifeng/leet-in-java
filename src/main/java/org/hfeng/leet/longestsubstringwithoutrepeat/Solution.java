package org.hfeng.leet.longestsubstringwithoutrepeat;

import java.util.*;
public class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0 || s == null) {
            return 0;
        }

        int[] index = new int[256];
        Arrays.fill(index, -1);
        int maxValue = 0;
        int size = 0;

        for (int i = 0; i < s.length(); i++) {
            // Take careful when using local variable,
            // as the i is changed later
            char cur = s.charAt(i);
            if (index[cur] != -1) {
                maxValue = Math.max(maxValue, size);
                size = 0;
                i = index[cur] + 1;
                Arrays.fill(index, -1);
            }
            ++size;
            index[s.charAt(i)] = i;
        }
        return Math.max(maxValue, size);
    }
}
