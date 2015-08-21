package org.hfeng.leet.addbinary;

public class Solution {
    public String addBinary(String a, String b) {

        StringBuilder sb = new StringBuilder();
        int adv = 0;
        for (int i = a.length() - 1, j = b.length() - 1; i >= 0 || j >= 0; i--, j--) {
            int an = (i >= 0) ? Character.digit(a.charAt(i), 10) : 0;
            int bn = (j >= 0) ? Character.digit(b.charAt(j), 10) : 0;
            int sum = an + bn + adv;

            sb.insert(0, sum % 2);
            adv = sum / 2;

        }
        if (adv == 1) {
            sb.insert(0, "1");
        }
        return sb.toString();
    }
}
