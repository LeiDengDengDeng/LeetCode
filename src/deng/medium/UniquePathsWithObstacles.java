package deng.medium;

/**
 * @author deng
 * @date 2019/02/13
 */
public class UniquePathsWithObstacles {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int[][] results = new int[obstacleGrid.length][obstacleGrid[0].length];
        for (int i = 0; i < obstacleGrid.length; i++) {
            if (obstacleGrid[i][0] == 0) {
                results[i][0] = 1;
            } else {
                break;
            }
        }
        for (int i = 0; i < obstacleGrid[0].length; i++) {
            if (obstacleGrid[0][i] == 0) {
                results[0][i] = 1;
            } else {
                break;
            }
        }

        for (int i = 1; i < obstacleGrid.length; i++) {
            for (int j = 1; j < obstacleGrid[0].length; j++) {
                if (obstacleGrid[i][j] == 0) {
                    results[i][j] = results[i][j - 1] + results[i - 1][j];
                }
            }
        }

        return results[obstacleGrid.length - 1][obstacleGrid[0].length - 1];
    }
}
