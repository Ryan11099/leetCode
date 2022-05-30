package com.leetcode.demo;

/**
 * @author yanjh
 * @date 2022/5/29 23:16
 */

/**
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串 s ，判断字符串是否有效。
 * <p>
 * 有效字符串需满足：
 * <p>
 * 左括号必须用相同类型的右括号闭合。
 * 左括号必须以正确的顺序闭合。
 *  
 * <p>
 * 示例 1：
 * <p>
 * 输入：s = "()"
 * 输出：true
 * 示例 2：
 * <p>
 * 输入：s = "()[]{}"
 * 输出：true
 * 示例 3：
 * <p>
 * 输入：s = "(]"
 * 输出：false
 * 示例 4：
 * <p>
 * 输入：s = "([)]"
 * 输出：false
 * 示例 5：
 * <p>
 * 输入：s = "{[]}"
 * 输出：true
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/valid-parentheses
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class isValid {
    public boolean isValid(String s) {
        String a = "(";
        String b = ")";
        String c = "[";
        String d = "]";
        String e = "{";
        String f = "}";
        Boolean x = getaBoolean(s, a, b);
        Boolean x1 = getcBoolean(s, c, d);
        Boolean x2 = geteBoolean(s, e, f);
        if (s.contains(a)&&s.contains(b)&&s.contains(c)&&s.contains(d)&&s.contains(e)&&s.contains(f)){return x2&&x1&&x;}
        if (s.contains(a)&&s.contains(b)&&s.contains(c)&&s.contains(d)){return x1&&x;}
        if (s.contains(a)&&s.contains(b)&&s.contains(e)&&s.contains(f)){return x2&&x;}
        if (s.contains(c)&&s.contains(d)&&s.contains(e)&&s.contains(f)){return x2&&x1;}
        if (s.contains(a)&&s.contains(b)){return x;}
        if (s.contains(c)&&s.contains(d)){return x1;}
        if (s.contains(e)&&s.contains(f)){return x2;}

        return false;
    }

    private Boolean geteBoolean(String s, String e, String f) {
        if ((s.contains(e) && s.contains(f))) {
            int a1 = 0;
            int b1 = 0;
            for (int i = 0; i < s.length(); i++) {
                String value = String.valueOf(s.charAt(i));
                if (value.equals(e)) {
                    a1++;
                }
                if (value.equals(f)) {
                    b1++;
                }
            }
            if (a1 != b1) {
                return false;
            }
            return true;
        }
        return false;
    }

    private Boolean getcBoolean(String s, String c, String d) {
        if ((s.contains(c) && s.contains(d))) {
            int a1 = 0;
            int b1 = 0;
            for (int i = 0; i < s.length(); i++) {
                String value = String.valueOf(s.charAt(i));
                if (value.equals(c)) {
                    a1++;
                }
                if (value.equals(d)) {
                    b1++;
                }
            }
            if (a1 != b1) {
                return false;
            }
            return true;
        }
        return false;
    }

    private Boolean getaBoolean(String s, String a, String b) {
        if ((s.contains(a) && s.contains(b))) {
            int a1 = 0;
            int b1 = 0;
            for (int i = 0; i < s.length(); i++) {
                String value = String.valueOf(s.charAt(i));
                if (value.equals(a)) {
                    a1++;
                }
                if (value.equals(b)) {
                    b1++;
                }
            }
            if (a1 != b1) {
                return false;
            }
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        isValid isValid = new isValid();
        boolean valid = isValid.isValid("[()");
        System.out.println(valid);
    }
}
