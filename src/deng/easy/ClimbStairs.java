package deng.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by deng on 2018/5/29.
 * https://leetcode-cn.com/problems/climbing-stairs/description/
 * 假设你正在爬楼梯。需要 n 步你才能到达楼顶。
 * 每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
 * ----------------------------------------------------------------------------------------------------
 * 【动态规划】问题的核心就在于找到大问题与小问题之间的关系。这个题目是什么关系呢？可以想，走到第i级台阶有几种方法呢，2种。
 * 1. 从i - 1级走一步到n级
 * 2. 从i - 2级走两步到n级
 * 那也就是说，走到第i级台阶的走法有f[i] = f[i - 1] + f[i - 2]，也就是用第i - 1级台阶的走法加上第i - 2级台阶的走法。
 */
public class ClimbStairs {
    public int climbStairs(int n) {
        List<Integer> record = new ArrayList<>();
        record.add(1);
        record.add(2);

        for (int i = 2; i < n; i++) {
            record.add(record.get(i - 1) + record.get(i - 2));
        }
        return record.get(n - 1);
    }
}
