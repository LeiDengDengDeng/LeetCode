package deng.bytedance;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * https://leetcode-cn.com/explore/interview/card/bytedance/243/array-and-sorting/1020/
 *
 * @author deng
 * @date 2019/10/15
 */
public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);

        Set<String> existedRes = new HashSet<>();
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 1; i < nums.length - 1; i++) {
            int left = i - 1;
            int right = i + 1;

            do {
                int sum = nums[left] + nums[i] + nums[right];

                if (sum < 0) {
                    right++;
                } else if (sum > 0) {
                    left--;
                } else {
                    String resStr = "" + nums[left] + nums[i] + nums[right];
                    if (!existedRes.contains(resStr)) {
                        existedRes.add(resStr);
                        res.add(Stream.of(nums[left], nums[i], nums[right]).collect(Collectors.toList()));
                    }
                    left--;
                    right++;
                }

            } while (right < nums.length && left >= 0);
        }

        return res;
    }
}
