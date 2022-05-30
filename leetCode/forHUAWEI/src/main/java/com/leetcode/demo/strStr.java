package com.leetcode.demo;

/**
 * @author yanjh
 * @date 2022/5/30 12:17
 */

/**
 * 实现 strStr() 函数。
 * <p>
 * 给你两个字符串 haystack 和 needle ，请你在 haystack 字符串中找出 needle 字符串出现的第一个位置（下标从 0 开始）。如果不存在，则返回  -1 。
 * <p>
 * 说明：
 * <p>
 * 当 needle 是空字符串时，我们应当返回什么值呢？这是一个在面试中很好的问题。
 * <p>
 * 对于本题而言，当 needle 是空字符串时我们应当返回 0 。这与 C 语言的 strstr() 以及 Java 的 indexOf() 定义相符。
 * <p>
 *  
 * <p>
 * 示例 1：
 * <p>
 * 输入：haystack = "hello", needle = "ll"
 * 输出：2
 * 示例 2：
 * <p>
 * 输入：haystack = "aaaaa", needle = "bba"
 * 输出：-1
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/implement-strstr
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class strStr {
    public int strStr(String haystack, String needle) {
        if (haystack.length() == 0 || needle.length() == 0) {
            return 0;
        }
        String replace = haystack.replace(needle, "*");
        if (haystack.contains(needle)) {
            for (int i = 0; i < replace.length(); i++) {
                if ("*".equals(String.valueOf(replace.charAt(i)))){
                    return i;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        strStr strStr = new strStr();
        int i = strStr.strStr("mississippi", "pi");
        System.out.println(i);
    }
}
