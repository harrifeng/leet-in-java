package org.hfeng.leet.countandsay;
public class Solution {
    public String countAndSay(int n) {

        StringBuilder ret = new StringBuilder("1");
        if (n == 1) {
            return ret.toString();
        }

        for (int i = 2; i <= n; i++) {
            StringBuilder tmp = new StringBuilder();
            int cnt = 0;
            for (int j = 0; j < ret.length(); j++) {
                if (j == 0 || ret.charAt(j) == ret.charAt(j-1)) {
                    cnt++;
                } else {
                    tmp.append(cnt).append(ret.charAt(j-1));
                    cnt= 1;
                }
            }
            tmp.append(cnt).append(ret.charAt(ret.length() - 1));
            ret = tmp;
        }

        return ret.toString();
    }
}
