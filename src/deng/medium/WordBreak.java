package deng.medium;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by deng on 2018/10/4.
 * https://leetcode-cn.com/problems/word-break/description/
 * 给定一个非空字符串 s 和一个包含非空单词列表的字典 wordDict，判定 s 是否可以被空格拆分为一个或多个在字典中出现的单词。
 */
public class WordBreak {
    // 这是我的复杂版动态规划 = = 需要占很多额外空间
    public boolean wordBreak(String s, List<String> wordDict) {
        List<Set<String>> allLastWords = new ArrayList<>(); // 保存位置i所剩的lastWord
        Set<String> firstLastWords = new HashSet<>();
        firstLastWords.add(s.substring(0, 1));
        allLastWords.add(firstLastWords);

        char[] letters = s.toCharArray();
        for (int i = 1; i < s.length(); i++) {
            Set<String> previousLastWords = allLastWords.get(i - 1);
            Set<String> lastWords = new HashSet<>();
            for (String lastWord : previousLastWords) {
                if (wordDict.contains(lastWord) && !lastWords.contains(String.valueOf(letters[i]))) {
                    lastWords.add(String.valueOf(letters[i]));
                }

                lastWords.add(lastWord + letters[i]);
            }

            allLastWords.add(lastWords);
        }

        Set<String> lastLastWords = allLastWords.get(s.length() - 1);
        for (String lastWord : lastLastWords) {
            if (wordDict.contains(lastWord)) {
                return true;
            }
        }
        return false;
    }


    // 这是网上的做法，很妙
    public boolean wordBreak2(String s, Set<String> dict) {
        boolean[] t = new boolean[s.length() + 1];
        t[0] = true; //set first to be true, why?        //Because we need initial state
        for (int i = 0; i < s.length(); i++) {            //should continue from match position
            if (!t[i]) continue;
            for (String a : dict) {
                int len = a.length();
                int end = i + len;
                if (end > s.length()) continue;
                if (t[end]) continue;
                if (s.substring(i, end).equals(a)) {
                    t[end] = true;
                }
            }
        }
        return t[s.length()];
    }
}
