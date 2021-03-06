package deng.easy;

import java.util.Arrays;

/**
 * @author deng
 * @date 2021/02/16
 */
public class ArrayPairSum {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);

        int res = 0;
        for (int i = 0; i < nums.length; i+=2) {
            res += nums[i];
        }

        return res;
    }
}
