package deng.medium;

/**
 * Created by deng on 2018/10/4.
 * https://leetcode-cn.com/problems/decode-ways/description/
 * 一条包含字母 A-Z 的消息通过以下方式进行了编码：
 * 'A' -> 1
 * 'B' -> 2
 * ...
 * 'Z' -> 26
 * 给定一个只包含数字的非空字符串，请计算解码方法的总数。
 */
public class NumDecodings {
    public int numDecodings(String s) {
        if (s.charAt(0) == '0') return 0;

        int[] results = new int[s.length()]; // r[i]代表s的前i位的解码方法总数
        results[0] = 1;
        int[] combineResults = new int[s.length()]; // cR[i]代表r[i]中，有多少种解法是s[i]与s[i-1]组合在一起的
        combineResults[0] = 0;

        char[] nums = s.toCharArray();
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == '0' && (nums[i - 1] == '0' || nums[i - 1] > '2')) {
                // 不存在解法
                return 0;
            } else if (nums[i] == '0') {
                results[i] = results[i - 1] - combineResults[i - 1];
            } else if (nums[i - 1] == '0' || (nums[i - 1] - '0') * 10 + nums[i] - '0' > 26) {
                results[i] = results[i - 1];
            } else {
                // 可与前一数字组合
                results[i] = (results[i - 1] - combineResults[i - 1]) * 2 + combineResults[i - 1];
                // 最后把这个代入上式，发现这种情况下这是个斐波那契数列
                combineResults[i] = results[i] - results[i - 1];
            }
        }

        return results[s.length() - 1];
    }
}