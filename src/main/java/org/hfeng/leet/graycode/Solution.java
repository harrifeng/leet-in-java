package org.hfeng.leet.graycode;

import java.util.*;

public class Solution {
    public List<Integer> grayCode(int n) {
        List<Integer> ret = new ArrayList<Integer>();

        if (n == 0) {
            ret.add(0);
            return ret;
        } else {
            List<Integer> half = grayCode(n - 1);
            for (int i = 0; i < half.size(); i++) {
                ret.add(half.get(i));
            }

            for (int i = half.size() - 1; i >= 0; i--) {
                int val = (1 << (n - 1)) + half.get(i);
                ret.add(val);
            }
            return ret;
        }
    }
}
