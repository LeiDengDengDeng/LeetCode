package deng.medium;

/**
 * 给定一个整数数组 nums ，找出一个序列中乘积最大的连续子序列（该序列至少包含一个数）
 * https://leetcode-cn.com/problems/maximum-product-subarray/
 *
 * @author deng
 * @date 2019/02/19
 */
public class MaxProduct {
    // 从评论区学习到的更简洁的做法
    public int maxProduct(int[] nums) {
        int max = nums[0], iMax = nums[0], iMin = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < 0) {
                // 交换iMax和iMin
                int index = iMax;
                iMax = iMin;
                iMin = index;
            }
            iMax = Math.max(nums[i], nums[i] * iMax);
            iMin = Math.min(nums[i], nums[i] * iMin);

            max = Math.max(max, iMax);
        }
        return max;
    }


    // 想复杂了的做法
    public int myMaxProduct(int[] nums) {
        int max = nums[0];
        int[] lastResult = new int[2]; // 0是上一个的负数，1是上一个的正数
        boolean[] lastResultExisted = new boolean[2]; // 0是上一个的负数是否存在，1是上一个的正数是否存在
        if (nums[0] < 0) {
            lastResult[0] = nums[0];
            lastResultExisted[0] = true;
        } else {
            lastResult[1] = nums[0];
            lastResultExisted[1] = true;
        }

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] >= 0) {
                if (lastResultExisted[1]) {
                    // nums[i]可能是0，所以积不一定更大
                    lastResult[1] = Math.max(nums[i], nums[i] * lastResult[1]);
                } else {
                    lastResult[1] = nums[i];
                    lastResultExisted[1] = true;
                }

                if (lastResultExisted[0] && nums[i] != 0) {
                    lastResult[0] *= nums[i];
                } else {
                    lastResultExisted[0] = false;
                }
            } else {
                int[] copyLastResult = new int[]{lastResult[0], lastResult[1]};
                boolean[] copyLastResultExisted = new boolean[]{lastResultExisted[0], lastResultExisted[1]};

                // 计算当前位置最大正数
                if (copyLastResultExisted[0]) {
                    lastResult[1] = nums[i] * copyLastResult[0];
                    lastResultExisted[1] = true;
                } else {
                    lastResultExisted[1] = false;
                }

                // 计算当前位置最大负数
                if (copyLastResultExisted[1]) {
                    lastResult[0] = Math.min(nums[i], nums[i] * copyLastResult[1]);
                } else {
                    lastResult[0] = nums[i];
                }
                lastResultExisted[0] = true;
            }

            max = Math.max(lastResult[1], max);
        }

        return max;
    }
}
