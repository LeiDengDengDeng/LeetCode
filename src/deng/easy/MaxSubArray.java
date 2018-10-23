package deng.easy;

/**
 * Created by deng on 2018/10/3.
 * https://leetcode-cn.com/problems/maximum-subarray/description/
 * 给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
 */
public class MaxSubArray {
    public int maxSubArray(int[] nums) {
        int[] results = new int[nums.length + 1];
        int max = nums[0];

        for (int i = 1; i <= nums.length; i++) {
            results[i] = results[i - 1] >= 0 ? results[i - 1] + nums[i - 1] : nums[i - 1];
            max = Math.max(max, results[i]);
        }

        return max;
    }
}
