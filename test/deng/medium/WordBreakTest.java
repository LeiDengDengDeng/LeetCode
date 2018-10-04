package deng.medium;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by deng on 2018/10/4.
 */
public class WordBreakTest {
    @Test
    public void wordBreak1() throws Exception {
        WordBreak wordBreak = new WordBreak();
        List<String> wordDict = new ArrayList<>();
        wordDict.add("leet");
        wordDict.add("code");
        assertTrue(wordBreak.wordBreak("leetcode",wordDict));
    }

    @Test
    public void wordBreak2() throws Exception {
        WordBreak wordBreak = new WordBreak();
        List<String> wordDict = new ArrayList<>();
        wordDict.add("apple");
        wordDict.add("pen");
        assertTrue(wordBreak.wordBreak("applepenapple",wordDict));
    }

    @Test
    public void wordBreak3() throws Exception {
        WordBreak wordBreak = new WordBreak();
        List<String> wordDict = new ArrayList<>();
        wordDict.add("cats");
        wordDict.add("dog");
        wordDict.add("sand");
        wordDict.add("and");
        wordDict.add("cat");
        assertFalse(wordBreak.wordBreak("catsandog",wordDict));
    }
}