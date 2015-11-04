package org.hfeng.leet.implementstrstr;

public class Solution {
    public int strStr(String haystack, String needle) {
        if (needle == null || needle.length() == 0) {
            return 0;
        }
        int i = 0;
        int j = 0;
        int[] next = getNext(needle);
        while (i < haystack.length() && j < needle.length()) {
            if (j == -1 || haystack.charAt(i) == needle.charAt(j)) {
                i++;
                j++;
            } else {
                j = next[j];
            }
        }

        if (j == needle.length()) {
            return i - j;
        }
        return -1;
    }

    private int[] getNext(String pattern) {
        int[] next = new int[pattern.length()];
        next[0] = -1;
        int i = -1;
        int j = 0;

        while (j < pattern.length() - 1) {
            if (i == -1 || pattern.charAt(i) == pattern.charAt(j)) {
                ++i;
                ++j;
                next[j] = i;
            } else {
                i = next[i];
            }
        }
        return next;
    }
}
