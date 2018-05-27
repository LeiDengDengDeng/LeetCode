package deng.easy;

/**
 * Created by deng on 2018/5/27.
 * https://leetcode-cn.com/problems/reverse-integer/description/
 * 给定一个 32 位有符号整数，将整数中的数字进行反转。
 * 输入: 123
 * 输出: 321
 * 假设我们的环境只能存储 32 位有符号整数，其数值范围是 [−2^31,  2^31 − 1]。根据这个假设，如果反转后的整数溢出，则返回 0。
 */
public class Reverse {
    public int reverse(int x) {
        StringBuilder reverseStr = new StringBuilder();
        if (x < 0) {
            reverseStr.append("-");
            x = -x;
        }

        String str = String.valueOf(x);
        for (int i = str.length() - 1; i >= 0; i--) {
            reverseStr.append(str.charAt(i));
        }

        try {
            return Integer.parseInt(reverseStr.toString());
        } catch (java.lang.NumberFormatException e) {
            return 0;
        }
    }
}
