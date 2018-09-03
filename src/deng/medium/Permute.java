package deng.medium;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by deng on 2018/9/3.
 */
public class Permute {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        permute(result, nums, 0);
        return result;
    }

    public void permute(List<List<Integer>> results, int[] nums, int s) {
        if (s == nums.length) {
            List<Integer> result = new ArrayList<>();
            for (int num : nums) {
                result.add(num);
            }
            results.add(result);
        }

        for (int i = s; i < nums.length; i++) {
            swap(nums, s, i);
            permute(results, nums, s + 1);
            swap(nums, s, i);
        }
    }

    private void swap(int[] nums, int a, int b) {
        int index = nums[a];
        nums[a] = nums[b];
        nums[b] = index;
    }

}
