package deng.bytedance;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * https://leetcode-cn.com/explore/interview/card/bytedance/243/array-and-sorting/1034/
 *
 * @author deng
 * @date 2019/09/28
 */
public class MaxAreaOfIsland {
    public int maxAreaOfIsland(int[][] grid) {
        List<Set<String>> allRes = new ArrayList<>();

        for (int m = 0; m < grid.length; m++) {
            for (int n = 0; n < grid[m].length; n++) {
                if (grid[m][n] == 1) {
                    String locId = getLocId(m, n);
                    // 该点已计算过
                    if (allRes.stream().anyMatch(res -> res.contains(locId))) {
                        continue;
                    }

                    Set<String> curRes = new HashSet<>();
                    calArea(curRes, grid, m, n);
                    allRes.add(curRes);
                }
            }
        }

        return allRes.stream().mapToInt(Set::size).max().orElse(0);
    }

    private void calArea(Set<String> curRes, int[][] grid, int m, int n) {
        // 该点不满足条件
        if (m < 0 || m >= grid.length
                || n < 0 || n >= grid[0].length
                || curRes.contains(getLocId(m, n))
                || grid[m][n] == 0) {
            return;
        }

        curRes.add(getLocId(m, n));

        // 上
        calArea(curRes, grid, m - 1, n);
        // 下
        calArea(curRes, grid, m + 1, n);
        // 左
        calArea(curRes, grid, m, n - 1);
        // 右
        calArea(curRes, grid, m, n + 1);
    }


    private String getLocId(int m, int n) {
        return m + "," + n;
    }
}
