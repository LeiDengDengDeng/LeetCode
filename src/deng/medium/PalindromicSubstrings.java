package deng.medium;

import java.util.ArrayList;
import java.util.List;

/**
 * @author deng
 * @date 2019/04/20
 */
public class PalindromicSubstrings {
    public int countSubstrings(String s) {
        if (s == null) return 0;
        if (s.length() <= 1) return s.length();

        List<String> lastResList = new ArrayList<>();
        lastResList.add(String.valueOf(s.charAt(0)));
        int total = 1;

        for (int i = 1; i < s.length(); i++) {
            List<String> curResList = new ArrayList<>();
            curResList.add(String.valueOf(s.charAt(i)));

            for (String lastRes : lastResList) {
                if (isAllSingleCh(lastRes, s.charAt(i))) {
                    // dp[i-1]+c[i]
                    curResList.add(lastRes + s.charAt(i));
                } else {
                    // dp[i-1] + dp[i-1]第一个字符的前一个字符 + c[i]
                    int start = s.substring(0, i).lastIndexOf(lastRes);
                    if (start - 1 >= 0 && s.charAt(start - 1) == s.charAt(i)) {
                        curResList.add(s.charAt(start - 1) + lastRes + s.charAt(i));
                    }
                }
            }

            lastResList = curResList;
            total += lastResList.size();
        }
        return total;
    }

    public boolean isAllSingleCh(String s, char ch) {
        for (char c : s.toCharArray()) {
            if (c != ch) return false;
        }
        return true;
    }
}
