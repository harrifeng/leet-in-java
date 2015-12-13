package org.hfeng.leet.longestpalindromicsubstr;

public class Solution {
    private String addHelper(String s) {
        StringBuilder sb = new StringBuilder("^");
        // Extra #!!
        sb.append("#");
        for (int i = 0; i < s.length() ; i++) {
            sb.append(s.charAt(i));
            sb.append("#");
        }
        sb.append("$");
        return sb.toString();
    }

    public String longestPalindrome(String s) {
        if (s.length() == 0 || s == null) {
            return "";
        }
//        s has at least one number
        String ns = addHelper(s);
        int[] sizes = new int[ns.length()];
        sizes[0] = 0;
        sizes[ns.length() - 1] = 0;
        int maxCenter = 0;
        int maxRight = 0;

        for (int i = 1; i < ns.length() - 1; i++) {
            int len = 0;
            if (i < maxRight) {
                len = Integer.min(maxRight - i, sizes[2 * maxCenter - i]);
            }
            while (ns.charAt(i - len - 1) == ns.charAt(i + len + 1)) {
                ++len;
            }
            sizes[i] = len;
            if (i + sizes[i] > maxRight) {
                maxRight = i + sizes[i];
                maxCenter = i;
            }
        }

        int maxSizeIndex = 0;
        for (int i = 1; i < sizes.length; i++) {
            if (sizes[i] > sizes[maxSizeIndex]) {
                maxSizeIndex = i;
            }
        }
        StringBuilder ret = new StringBuilder();
        for (int i = maxSizeIndex - sizes[maxSizeIndex]; i <= maxSizeIndex + sizes[maxSizeIndex]; i++) {
            if (ns.charAt(i) != '^' && ns.charAt(i) != '$' && ns.charAt(i) != '#') {
                ret.append(ns.charAt(i));
            }
        }
        return ret.toString();
    }
}
