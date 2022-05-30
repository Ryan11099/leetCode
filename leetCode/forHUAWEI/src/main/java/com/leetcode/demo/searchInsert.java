package com.leetcode.demo;

/**
 * @author yanjh
 * @date 2022/5/30 11:36
 */

/**
 * 给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
 * <p>
 * 请必须使用时间复杂度为 O(log n) 的算法。
 * <p>
 *  
 * <p>
 * 示例 1:
 * <p>
 * 输入: nums = [1,3,5,6], target = 5
 * 输出: 2
 * 示例 2:
 * <p>
 * 输入: nums = [1,3,5,6], target = 2
 * 输出: 1
 * 示例 3:
 * <p>
 * 输入: nums = [1,3,5,6], target = 7
 * 输出: 4
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/search-insert-position
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class searchInsert {
    public int searchInsert(int[] nums, int target) {
        int p = 0;
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (num == target) {
                p = 1;
                return i;
            }
        }
        if (p != 1) {
            for (int i = 0; i < nums.length; i++) {
                int num = nums[i];
                if (num >= target) {
                    return i;
                }
                if (i + 1 == nums.length){
                    return i+1;
                }

            }
        }
        return 0;
    }

    public static void main(String[] args) {
        searchInsert searchInsert = new searchInsert();
        int i = searchInsert.searchInsert(new int[]{1}, 0);
        System.out.println(i);
    }
}
