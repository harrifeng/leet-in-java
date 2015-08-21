package org.hfeng.leet.anagrams;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Solution {
    public List<String> anagrams(String[] strs) {
        Map<Integer, String> map = new HashMap<Integer, String>();
        List<String> ret = new LinkedList<>();
        int times = 0;
        for (int i = 0; i < strs.length; i++) {
            if (map.containsKey(stringHash(strs[i]))) {
                if (times == 0) {
                    ret.add(map.get(stringHash(strs[i])));
                    times++;
                }
                ret.add(strs[i]);
            } else {
                map.put(stringHash(strs[i]), strs[i]);
            }
        }
        return ret;
    }

    private int stringHash(String str) {
        int ret = 0;
        for (int i = 0; i < str.length(); i++) {
            ret += (str.charAt(i) - 'a') * 10;
        }
        return ret;
    }
}
