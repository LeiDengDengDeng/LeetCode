package deng.medium;

/**
 * 给定一个整数数组 nums ，找出一个序列中乘积最大的连续子序列（该序列至少包含一个数）
 * https://leetcode-cn.com/problems/maximum-product-subarray/
 *
 * @author deng
 * @date 2019/02/19
 */
public class MaxProduct {
    // TODO:未完成
    public int maxProduct(int[] nums) {
        int lastResult = nums[0];
        int max = lastResult;

        for (int i = 1; i < nums.length; i++) {
            if ((lastResult <= 0 && nums[i] < 0) || lastResult > 0 && nums[i] > 0) {
                lastResult = lastResult * nums[i];
            } else {
                lastResult = nums[i];
            }

            if (max < lastResult) max = lastResult;
        }

        return max;
    }
}
