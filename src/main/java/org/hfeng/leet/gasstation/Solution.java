package org.hfeng.leet.gasstation;

public class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int leftGas = 0;
        int sum = 0;
        int startPoint = 0;
        for (int i = 0; i < gas.length; i++) {
            // leftGas is another sum(leftGas never return to zero)
            leftGas += gas[i] - cost[i];
            sum += gas[i] - cost[i];
            // sum should be bigger than Zero at the very first round.
            if (sum < 0) {
                // Failed here, hope startPoint can be next one.
                startPoint = i + 1;
                sum = 0;
            }
        }
        // leftGas is not minus, it means all gases are more than all
        // costs, there at least one solution.
        return leftGas >= 0 ? startPoint : -1;
    }
}
