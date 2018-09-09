package deng.easy;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by deng on 2018/9/9.
 * https://leetcode-cn.com/problems/happy-number/description/
 * 编写一个算法来判断一个数是不是“快乐数”。
 * 一个“快乐数”定义为：对于一个正整数，每一次将该数替换为它每个位置上的数字的平方和，然后重复这个过程直到这个数变为 1，也可能是无限循环但始终变不到 1。如果可以变为 1，那么这个数就是快乐数。
 */
public class IsHappy {
    public boolean isHappy(int n) {
        Set<Integer> nums = new HashSet<>();
        while (n != 1) {
            n = calculate(n);
            if (nums.contains(n)) {
                return false;
            }
            nums.add(n);
        }
        return true;
    }

    private int calculate(int n) {
        int result = 0;
        while (n != 0) {
            int digit = n % 10;
            result += digit * digit;
            n /= 10;
        }
        return result;
    }
}
