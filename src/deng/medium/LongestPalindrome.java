package deng.medium;

import java.util.*;

/**
 * 给定一个字符串 s，找到 s 中最长的回文子串。你可以假设 s 的最大长度为 1000。
 * https://leetcode-cn.com/problems/longest-palindromic-substring/
 * 动态规划
 *
 * @author deng
 * @date 2019/02/13
 */
public class LongestPalindrome {

    public String longestPalindrome(String s) {
        if (s == null || s.length() == 0) return "";
        if (isSingleLetterStr(s, String.valueOf(s.charAt(0)))) return s;

        String longestPal = String.valueOf(s.charAt(0));

        // 初始条件，i位置的result代表以i位置的字符结尾的所有回文串的集合
        Set<String> preResult = new HashSet<>();
        preResult.add(String.valueOf(s.charAt(0)));

        for (int i = 1; i < s.length(); i++) {
            // 动态规划，只需依赖前一个位置的解，因此只需要保存preResult，而不是之前所有的result
            Set<String> curResult = new HashSet<>();
            curResult.add(String.valueOf(s.charAt(i)));
            for (String palindrome : preResult) {
                int palLen = palindrome.length();

                String curPal = "";
                if (isSingleLetterStr(palindrome, String.valueOf(s.charAt(i)))) {
                    // 单字母串且字母即为当前字母
                    curPal = palindrome + s.charAt(i);
                } else if (i - palLen - 1 >= 0 && s.charAt(i - palLen - 1) == s.charAt(i)) {
                    // 上个解集中的回文串的前一个字母和当前字母相同，比如"bcb"的前一个字母是"a"，当前字母也是"a"的情况
                    curPal = s.charAt(i - palLen - 1) + palindrome + s.charAt(i);
                }
                curResult.add(curPal);

                // 更新最长回文串
                if (curPal.length() > longestPal.length()) longestPal = curPal;
            }

            preResult = curResult;
        }

        return longestPal;
    }

    /**
     * 是否是单字母串，如输入"aaaaaa"和"a"即为true
     *
     * @param s
     * @param letter
     * @return
     */
    private boolean isSingleLetterStr(String s, String letter) {
        return s.split(letter).length == 0;
    }
}
