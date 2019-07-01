package deng.medium;

import java.util.*;

/**
 * https://leetcode-cn.com/problems/generate-parentheses
 * 给出 n 代表生成括号的对数，请你写出一个函数，使其能够生成所有可能的并且有效的括号组合。
 *
 * @author deng
 * @date 2019/06/23
 */
public class GenerateParentheses {
    public List<String> generateParenthesis(int n) {
        if (n == 0) {
            return new ArrayList<>();
        }

        List<String> result = new ArrayList<>();
        permute(result, "", n, n);
        return result;
    }

    public void permute(List<String> result, String curStr, int left, int right) {
        if (left == 0 && right == 0) {
            result.add(curStr);
        }

        if (left > 0 && left <= right) {
            permute(result, curStr + "(", left - 1, right);
        }
        if (right > 0) {
            permute(result, curStr + ")", left, right - 1);
        }
    }
}
