package deng.medium;

/**
 * Created by deng on 2018/8/31.
 * https://leetcode-cn.com/problems/string-to-integer-atoi/description/
 * <p>
 * 实现 atoi，将字符串转为整数。
 * 在找到第一个非空字符之前，需要移除掉字符串中的空格字符。如果第一个非空字符是正号或负号，选取该符号，并将其与后面尽可能多的连续的数字组合起来，这部分字符即为整数的值。如果第一个非空字符是数字，则直接将其与之后连续的数字字符组合起来，形成整数。
 * 字符串可以在形成整数的字符后面包括多余的字符，这些字符可以被忽略，它们对于函数没有影响。
 * 当字符串中的第一个非空字符序列不是个有效的整数；或字符串为空；或字符串仅包含空白字符时，则不进行转换。
 * 若函数不能执行有效的转换，返回 0。
 * <p>
 * 说明：
 * 假设我们的环境只能存储 32 位有符号整数，其数值范围是 [−231,  231 − 1]。如果数值超过可表示的范围，则返回  INT_MAX (231 − 1) 或 INT_MIN (−231) 。
 */
public class MyAtoi {
    public int myAtoi(String str) {
        if (str == null) return 0;

        str = str.trim();

        int sign = 1;
        if (str.length() == 0 || ((str.charAt(0) > '9' || str.charAt(0) < '0') && str.charAt(0) != '-' && str.charAt(0) != '+')) {
            return 0;
        } else if (str.charAt(0) == '-' || str.charAt(0) == '+') {
            str = str.substring(1);
            sign = str.charAt(0) == '+' ? 1 : -1;
        }

        long res = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) > '9' || str.charAt(i) < '0') {
                return (int) (sign * res);
            }

            long newRes = res * 10 + (str.charAt(i) - '0');
            if (sign == 1 && newRes > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            } else if (sign == -1 && -newRes < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }

            res = newRes;
        }
        return (int) (sign * res);
    }
}
