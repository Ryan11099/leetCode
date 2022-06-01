package com.leetcode.demo;

import java.util.ArrayList;

/**
 * @author yanjh
 * @date 2022/6/1 16:30
 */
public class maximumWealth {

    public int maximumWealth(int[][] accounts) {
        ArrayList<Integer> integers = new ArrayList<>();
        for (int i = 0; i < accounts.length; i++) {
            int total = 0;
            int[] account = accounts[i];
            for (int j = 0; j < account.length; j++) {
                int num = account[j];
                total += num;
                integers.add(total);
            }
        }
        return integers.stream().max(Integer::compare).get();
    }

    public static void main(String[] args) {
        maximumWealth maximumWealth = new maximumWealth();
        int i = maximumWealth.maximumWealth(new int[][]{{1, 5}, {7, 3}, {3, 5}});
        System.out.println(i);
    }
}
