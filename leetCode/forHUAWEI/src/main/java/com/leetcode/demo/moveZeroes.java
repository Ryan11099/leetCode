package com.leetcode.demo;

/**
 * @author yanjh
 * @date 2022/6/1 20:59
 */

/**
 * 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
 *
 * 请注意 ，必须在不复制数组的情况下原地对数组进行操作。
 *
 *  
 *
 * 示例 1:
 *
 * 输入: nums = [0,1,0,3,12]
 * 输出: [1,3,12,0,0]
 * 示例 2:
 *
 * 输入: nums = [0]
 * 输出: [0]
 *
 * 作者：力扣 (LeetCode)
 * 链接：https://leetcode.cn/leetbook/read/all-about-array/x9rh8e/
 * 来源：力扣（LeetCode）
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 */
public class moveZeroes {
    public int[] moveZeroes(int[] nums) {
        int temp;
        int temp1;
        // 外层循环，控制比较的轮数
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 0; j < nums.length - i - 1; j++) {
                if (nums[j] == 0) {
                    temp = nums[j + 1];
                    nums[j + 1] = nums[j];
                    nums[j] = temp;
                }
            }
        }
//        for (int i1 = 0; i1 < nums.length - 1; i1++) {
//            if (nums[i1 + 1] != 0 && nums[i1 + 1] < nums[i1]) {
//                temp1 = nums[i1 + 1];
//                nums[i1 + 1] = nums[i1];
//                nums[i1] = temp1;
//            }
//        }
        return nums;
    }
    public void moveZeroes1(int[] nums) {
        if (nums == null || nums.length == 0)
            return;
        int index = 0;
        //一次遍历，把非零的都往前挪
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0)
                nums[index++] = nums[i];
        }
        //后面的都是0,
        while (index < nums.length) {
            nums[index++] = 0;
        }
    }

    public static void main(String[] args) {
        moveZeroes moveZeroes = new moveZeroes();
        moveZeroes.moveZeroes1(new int[]{2,1});
    }
}
