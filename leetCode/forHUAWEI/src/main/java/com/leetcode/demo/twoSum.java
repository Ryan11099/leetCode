package com.leetcode.demo;

import java.util.Arrays;

/**
 * @author yanjh
 * @date 2022/5/30 18:06
 */
public class twoSum {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            for (int j = i+1; j < nums.length; j++) {
                int num1 = nums[j];
                if (num + num1 == target) {
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        twoSum twoSum = new twoSum();
        int[] ints = twoSum.twoSum(new int[]{2,5,5,11}, 10);
        System.out.println(Arrays.asList(ints).toString());
    }
}
