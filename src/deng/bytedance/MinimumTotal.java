package deng.bytedance;

import java.util.List;

/**
 * https://leetcode-cn.com/explore/interview/card/bytedance/246/dynamic-programming-or-greedy/1030/
 *
 * @author deng
 * @date 2019/10/15
 */
public class MinimumTotal {
    public int minimumTotal(List<List<Integer>> triangle) {
        if (triangle == null || triangle.isEmpty()) {
            return 0;
        }

        int[] res = new int[triangle.size()];
        res[0] = triangle.get(0).get(0);

        for (int i = 1; i < triangle.size(); i++) {
            List<Integer> line = triangle.get(i);
            for (int j = line.size() - 1; j >= 0; j--) {
                if (j == line.size() - 1) {
                    res[j] = res[j - 1] + line.get(j);
                } else if (j == 0) {
                    res[j] += line.get(j);
                } else {
                    res[j] = Math.min(res[j - 1], res[j]) + line.get(j);
                }
            }
        }

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < res.length; i++) {
            min = Math.min(min, res[i]);
        }
        return min;
    }
}
