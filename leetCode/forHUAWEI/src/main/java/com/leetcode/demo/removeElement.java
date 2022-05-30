package com.leetcode.demo;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author yanjh
 * @date 2022/5/30 12:35
 */
public class removeElement {
    public int removeElement2(int[] nums, int val) {
        int index = 0;
        for (int num : nums) {
            if (num != val) {
                nums[index++] = num;
            }
        }
        return index;
    }

    public int removeElement(int[] nums, int val) {
        int n = 0;
        ArrayList list = null;
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (num == val) {
                list = intsToList(nums);
                list.remove(i);
                n++;
            }
        }
        return nums.length - n;
    }

    public int removeElement1(int[] nums, int val) {
        if (nums == null || nums.length == 0)
            return 0;
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }

    public ArrayList intsToList(int[] ints) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < ints.length; i++) {
            list.add(ints[i]);
        }
        return list;
    }

    public static void main(String[] args) {
        removeElement removeElement = new removeElement();
        int i = removeElement.removeElement(new int[]{3, 2, 2, 3}, 3);
        int j = removeElement.removeElement1(new int[]{3, 2, 2, 3}, 3);
        System.out.println(i);
        System.out.println(j);
    }
}
