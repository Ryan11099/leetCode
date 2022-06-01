package com.leetcode.demo;

import static java.lang.Integer.sum;

/**
 * @author yanjh
 * @date 2022/6/1 14:56
 */
public class runningSum {
    public int[] runningSum(int[] nums) {
        int[] ints = new int[nums.length];
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            //计算动态和
            result +=  nums[i];
            // 赋值
            ints[i] = result;
        }
        return ints;
    }

    public static void main(String[] args) {
        runningSum runningSum = new runningSum();
        int[] ints = runningSum.runningSum(new int[]{1, 2, 3, 4});
        System.out.println(ints);
    }
}
