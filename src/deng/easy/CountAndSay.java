package deng.easy;

/**
 * Created by deng on 2018/5/29.
 * https://leetcode-cn.com/problems/count-and-say/description/
 * 报数序列是指一个整数序列，按照其中的整数的顺序进行报数，得到下一个数。其前五项如下：
 * 1.     1
 * 2.     11
 * 3.     21
 * 4.     1211
 * 5.     111221
 * 给定一个正整数 n ，输出报数序列的第 n 项。
 */
public class CountAndSay {
    public String countAndSay(int n) {
        String result = "1";
        for (int i = 1; i < n; i++) {
            String lastResult = result;
            result = "";

            int count = 0;
            char lastChar = lastResult.charAt(0);
            for (int m = 0; m < lastResult.length(); m++) {
                // 当下一个数字与上一个数字不一致时，开始报(统计)上一个数
                if (lastResult.charAt(m) != lastChar) {
                    result += String.valueOf(count) + String.valueOf(lastChar);

                    count = 0;
                    lastChar = lastResult.charAt(m);
                }
                count++;
            }
            result += String.valueOf(count) + String.valueOf(lastChar);
        }
        return result;
    }
}
