package deng.easy;

/**
 * Created by deng on 2018/9/9.
 * https://leetcode-cn.com/problems/sqrtx/description/
 * 计算并返回 x 的平方根，其中 x 是非负整数。
 * 由于返回类型是整数，结果只保留整数的部分，小数部分将被舍去。
 */
public class MySqrt {
    public int mySqrt(int x) {
        int up = x;
        int low = 0;
        while (true) {
            if ((long) up * up == x) return up;
            if (low * low == x) return low;
            if ((long) up * up > x && low * low < x && up - low <= 1) return low;

            int mid = (up + low) / 2;
            if ((long) mid * mid > x) {
                up = mid;
            } else {
                low = mid;
            }
        }
    }
}
