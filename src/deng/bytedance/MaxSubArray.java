package deng.bytedance;

/**
 * https://leetcode-cn.com/explore/interview/card/bytedance/246/dynamic-programming-or-greedy/1029/
 *
 * @author deng
 * @date 2019/10/15
 */
public class MaxSubArray {
    public int maxSubArray(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        // 第i个为包含第i位数字的最大值
        int[] res = new int[nums.length];
        res[0] = nums[0];

        int max = res[0];
        for (int i = 1; i < nums.length; i++) {
            res[i] = Math.max(res[i - 1] + nums[i], nums[i]);
            max = Math.max(max, res[i]);
        }

        return max;
    }
}
