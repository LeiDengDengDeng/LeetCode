package deng.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by deng on 2018/10/6.
 */
public class FourSum {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);

        List<List<Integer>> results = new ArrayList<>();
        for (int i = 0; i < nums.length - 3; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            for (int j = i + 1; j < nums.length - 2; j++) {
                if (j > i + 1 && nums[j] == nums[j - 1]) continue;
                for (int left = j + 1; left < nums.length - 1; left++) {
                    int right = nums.length - 1;
                    while (left < right) {
                        int sum = nums[i] + nums[j] + nums[left] + nums[right];
                        if (sum < target) {
                            left++;
                        } else if (sum > target) {
                            right--;
                        } else {
                            List<Integer> result = new ArrayList<>();
                            result.add(nums[i]);
                            result.add(nums[j]);
                            result.add(nums[left]);
                            result.add(nums[right]);
                            results.add(result);

                            do {
                                left++;
                            } while (left < right && nums[left - 1] == nums[left]);
                        }
                    }
                }
            }
        }
        return results;
    }
}
