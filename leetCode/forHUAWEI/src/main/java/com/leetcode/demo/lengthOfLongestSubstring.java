package com.leetcode.demo;

/**
 * @author yanjh
 * @date 2022/5/30 18:22
 */

import java.util.ArrayList;

/**
 * 给定一个字符串 s ，请你找出其中不含有重复字符的 最长子串 的长度。
 * <p>
 *  
 * <p>
 * 示例 1:
 * <p>
 * 输入: s = "abcabcbb"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
 * 示例 2:
 * <p>
 * 输入: s = "bbbbb"
 * 输出: 1
 * 解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
 * 示例 3:
 * <p>
 * 输入: s = "pwwkew"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
 *      请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/longest-substring-without-repeating-characters
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class lengthOfLongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        ArrayList<Integer> list = new ArrayList<>();
        int n = 0;
        while (n <= s.length()) {
            String s1 = String.valueOf(s.charAt(n));
            for (int j = n + 1; j < s.length() - 1; j++) {
                String s2 = String.valueOf(s.charAt(j));
                if (s1.equals(s2)) {
                    list.add(j - n);
                    n = j;
                    break;
                }
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        lengthOfLongestSubstring lengthOfLongestSubstring = new lengthOfLongestSubstring();
        int abcabcbb = lengthOfLongestSubstring.lengthOfLongestSubstring("abcabcbb");
        System.out.println(abcabcbb);
    }
}
