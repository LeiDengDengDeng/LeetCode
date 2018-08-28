package deng.easy;

/**
 * Created by deng on 2018/5/28.
 * https://leetcode-cn.com/problems/longest-common-prefix/description/
 * 编写一个函数来查找字符串数组中的最长公共前缀。
 * 如果不存在公共前缀，返回空字符串 ""。
 */
public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";

        String firstWord = strs[0];
        for (int i = 0; i < firstWord.length(); i++) {
            for (String str : strs) {
                if (str.length() > i && str.charAt(i) == firstWord.charAt(i)) {
                    continue;
                } else {
                    return firstWord.substring(0, i);
                }
            }
        }
        return firstWord;
    }
}
