package deng.easy;

/**
 * Created by deng on 2018/5/28.
 * https://leetcode-cn.com/problems/length-of-last-word/description/
 * 给定一个仅包含大小写字母和空格 ' ' 的字符串，返回其最后一个单词的长度。
 * 如果不存在最后一个单词，请返回 0 。
 */
public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        if (s == null) return 0;

        String[] words = s.trim().split(" ");
        return words[words.length - 1].length();
    }
}
