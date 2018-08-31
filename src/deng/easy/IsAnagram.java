package deng.easy;

/**
 * Created by deng on 2018/8/31.
 * 给定两个字符串 s 和 t ，编写一个函数来判断 t 是否是 s 的一个字母异位词。
 */
public class IsAnagram {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        int[] sRes = statistic(s);
        int[] tRes = statistic(t);

        for (int i = 0; i < 26; i++) {
            if (sRes[i] != tRes[i]) return false;
        }
        return true;
    }

    private int[] statistic(String s) {
        int[] res = new int[26];
        for (int i = 0; i < s.length(); i++) {
            res[s.charAt(i) - 'a'] += 1;
        }
        return res;
    }
}
