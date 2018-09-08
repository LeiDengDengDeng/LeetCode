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

    /**
     * @param results
     * @param nums    输入的无重复数组序列
     * @param s       数组起始位置指针，起始位置之前的数字在本次函数使用中无意义
     */
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
            // s取s+1,代表递归的nums指针位置前移一位
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
