package com.leetcode.demo;

/**
 * @author yanjh
 * @date 2022/5/29 16:17
 */

/**
 * 编写一个函数来查找字符串数组中的最长公共前缀。
 * <p>
 * 如果不存在公共前缀，返回空字符串 ""。
 * <p>
 *  
 * <p>
 * 示例 1：
 * <p>
 * 输入：strs = ["flower","flow","flight"]
 * 输出："fl"
 * 示例 2：
 * <p>
 * 输入：strs = ["dog","racecar","car"]
 * 输出：""
 * 解释：输入不存在公共前缀。
 *  
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/longest-common-prefix
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class longestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        int cols = strs[0].length(); // 列数
        int raws = strs.length; // 行数
        for (int i = 0; i < cols; i++) {
            char first = strs[0].charAt(i);
            for (int j = 1; j < raws; j++) {
                if (/*strs[j].length() >= strs.length &&*/strs[j].length() == i || strs[j].charAt(i) != first) {
                    return strs[0].substring(0, i);
                }
            }
        }
        return strs[0];
    }

    public static void main(String[] args) {
        longestCommonPrefix longestCommonPrefix = new longestCommonPrefix();
        String[] strs = {"ab", "a"};
        String s = longestCommonPrefix.longestCommonPrefix(strs);
        System.out.println(s);
    }
}
