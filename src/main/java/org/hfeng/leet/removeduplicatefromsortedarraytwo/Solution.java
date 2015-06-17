package org.hfeng.leet.removeduplicatefromsortedarraytwo;
public class Solution {
    public int removeDuplicates(int[] A) {
        if (A.length <= 2) {
            return A.length;
        }

        int start = 1;
        for (int i = 2; i < A.length; i++) {
            if (A[start - 1] != A[i]) {
                A[++start] = A[i];
            }
        }
        return start + 1;
    }
}
