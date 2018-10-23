package deng.easy;

/**
 * https://leetcode-cn.com/problems/implement-strstr/description/
 * 给定一个 haystack 字符串和一个 needle 字符串，在 haystack 字符串中找出 needle 字符串出现的第一个位置 (从0开始)。如果不存在，则返回  -1。
 * 当 needle 是空字符串时我们应当返回 0
 */
public class StrStr {
    public int strStr(String haystack, String needle) {
        if (needle.length() == 0) return 0;
        if (haystack.length() < needle.length()) return -1;

        for (int m = 0; m < haystack.length(); m++) {
            if (haystack.charAt(m) == needle.charAt(0)) {
                boolean founded = true;
                for (int n = 0; n < needle.length(); n++) {
                    if (m + n >= haystack.length() || haystack.charAt(m + n) != needle.charAt(n)) {
                        founded = false;
                        break;
                    }
                }

                if (founded) return m;
            }
        }
        return -1;
    }
}
