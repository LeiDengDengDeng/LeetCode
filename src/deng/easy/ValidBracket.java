package deng.easy;

import java.util.Stack;

/**
 * Created by deng on 2018/5/28.
 * https://leetcode-cn.com/problems/valid-parentheses/description/
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
 */
public class ValidBracket {
    private Stack<Character> brackets = new Stack<>();
    private String leftBrackets = "([{";
    private String rightBrackets = ")]}";

    public boolean isValid(String s) {
        if (s == null || s.length() == 0) return true;

        for (int i = 0; i < s.length(); i++) {
            char bracket = s.charAt(i);
            if (leftBrackets.indexOf(bracket) >= 0) {
                brackets.add(bracket);
            } else {
                char leftBracket = leftBrackets.charAt(rightBrackets.indexOf(bracket));
                if (brackets.empty() || brackets.pop() != leftBracket) {
                    return false;
                }
            }
        }

        return brackets.empty();
    }
}
