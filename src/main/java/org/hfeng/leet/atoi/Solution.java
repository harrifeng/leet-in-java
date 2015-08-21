package org.hfeng.leet.atoi;

public class Solution {
    public int atoi(String str) {
        if (str.length() == 0) {
            return 0;
        }
        int beg = 0;
        boolean neg = false;

        while (str.charAt(beg) == ' ') {
            beg++;
        }

        if (str.charAt(beg) == '-') {
            neg = true;
            beg++;
        } else if (str.charAt(beg) == '+') {
            neg = false;
            beg++;
        }

        int ret = 0;

        for (int i = beg; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                int cur = Character.digit(str.charAt(i), 10);
                if (ret > Integer.MAX_VALUE / 10 ||
                        (ret == Integer.MAX_VALUE / 10 && cur > Integer.MAX_VALUE % 10)) {
                    return neg ? Integer.MIN_VALUE : Integer.MAX_VALUE;
                } else {
                    ret = ret * 10 + cur;
                }
            } else {
                break;
            }
        }
/*
        for (; beg < str.length(); beg++) {
            if (Character.isDigit(str.charAt(beg))) {
                if (ret > Integer.MAX_VALUE / 10
                        || (ret == Integer.MAX_VALUE / 10 && Character.digit(str.charAt(beg), 10) > Integer.MAX_VALUE % 10)) {
                    return neg ? Integer.MIN_VALUE : Integer.MAX_VALUE;
                } else {
                    ret += ret * 10 + Character.digit(str.charAt(beg), 10);
                }
            } else {
                break;
            }
        }
*/
        return neg ? (-1) * ret : ret;
    }
}
