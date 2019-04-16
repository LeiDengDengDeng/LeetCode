package deng.medium;

import java.util.LinkedList;
import java.util.List;

/**
 * https://leetcode-cn.com/problems/letter-combinations-of-a-phone-number/
 * 给定一个仅包含数字 2-9 的字符串，返回所有它能表示的字母组合。
 *
 * @author deng
 * @date 2019/04/15
 */
public class LetterCombinationsOfAPhoneNumber {
    public List<String> letterCombinations(String digits) {
        if (digits == null || digits.length() == 0) return new LinkedList<>();

        List<String> result = new LinkedList<>();
        for (char numChar : digits.toCharArray()) {
            int num = numChar - '0';
            result = add(result, num);
        }
        return result;
    }

    private List<String> add(List<String> result, int num) {
        char start = getStart(num);
        int count = getCharCount(num);

        if (result.isEmpty()) {
            for (int i = 0; i < count; i++) {
                result.add(String.valueOf((char) (start + i)));
            }
            return result;
        } else {
            List<String> curResult = new LinkedList<>();
            for (String str : result) {
                for (int i = 0; i < count; i++) {
                    curResult.add(str + String.valueOf((char) (start + i)));
                }
            }
            return curResult;
        }
    }

    private int getCharCount(int num) {
        if (num == 7 || num == 9) return 4;
        return 3;
    }

    private char getStart(int num) {
        String dic = "adgjmptw";
        return dic.charAt(num - 2);
    }
}
