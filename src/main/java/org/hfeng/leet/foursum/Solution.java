package org.hfeng.leet.foursum;

import java.util.*;
public class Solution {
    public List<List<Integer>> fourSum(int[] num, int target) {
        if (num.length < 4) {
            return null;
        }
        Arrays.sort(num);
        List<List<Integer>> ret = new ArrayList<List<Integer>>();

        for (int i = 0; i < num.length - 3; i++) {
            if (i > 0 && num[i-1] == num[i]) {
                continue;
            }
            for (int j = i + 1; j < num.length - 2; j++) {
                if (j > i + 1&& num[j-1] == num[j]) {
                    continue;
                }

                int beg = j + 1;
                int end = num.length - 1;

                while (beg < end) {
                    int sum = num[i] + num[j] + num[beg] + num[end];

                    if (sum == target) {
                        List<Integer> oneRet = new ArrayList<Integer>();
                        oneRet.add(num[i]);
                        oneRet.add(num[j]);
                        oneRet.add(num[beg]);
                        oneRet.add(num[end]);
                        while (beg < end && num[beg+1] == num[beg]
                               && num[end] == num[end-1]) {
                            beg++;
                            end--;
                        }
                        ret.add(oneRet);
                        beg++;
                        end--;
                    } else if (sum < target) {
                        beg++;
                    } else {
                        end--;
                    }
                }
            }
        }
        return ret;
    }
}
