package deng.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by deng on 2018/10/5.
 * https://leetcode-cn.com/problems/combination-sum/description/
 * 给定一个无重复元素的数组 candidates 和一个目标数 target ，找出 candidates 中所有可以使数字和为 target 的组合。
 * candidates 中的数字可以无限制重复被选取。
 * 说明：
 * 所有数字（包括 target）都是正整数。
 * 解集不能包含重复的组合。
 */
public class CombinationSum {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        // 对candidates排序
        Arrays.sort(candidates);
        if (target < candidates[0]) {
            return new ArrayList<>();
        }

        List<List<Integer>> results = new ArrayList<>();
        loop(results, candidates, 0, target, new ArrayList<>());
        return results;
    }

    /**
     * 递归回溯
     *
     * @param results
     * @param candidates 升序排列，因此candidates[index]代表该段中的最小值
     * @param index      candidates的指针，只允许使用index-candidates.size这段中的数字，避免重复
     * @param target
     * @param result
     */
    private void loop(List<List<Integer>> results, int[] candidates, int index, int target, List<Integer> result) {
        if (target == 0) {
            // 复制result
            results.add(new ArrayList<>(result));
            return;
        } else if (target < candidates[index]) {
            return;
        }

        for (int i = index; i < candidates.length; i++) {
            result.add(candidates[i]);
            loop(results, candidates, i, target - candidates[i], result);
            result.remove(result.size() - 1);
        }
    }
}
