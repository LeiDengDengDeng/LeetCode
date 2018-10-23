package deng.medium;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by deng on 2018/10/6.
 * https://leetcode-cn.com/problems/valid-sudoku/description/
 * 判断一个 9x9 的数独是否有效。只需要根据以下规则，验证已经填入的数字是否有效即可。
 */
public class IsValidSudoku {
    // 来源网上，利用set存储，遍历一遍board的所有格子即可
    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < 9; i++) {
            Set<Character> row = new HashSet<>();
            Set<Character> column = new HashSet<>();
            Set<Character> cube = new HashSet<>();
            for (int j = 0; j < 9; j++) {
                // 检查第i行，在横坐标位置
                if (board[i][j] != '.' && !row.add(board[i][j]))
                    return false;
                // 检查第i列，在纵坐标位置
                if (board[j][i] != '.' && !column.add(board[j][i]))
                    return false;
                // 行号+偏移量
                int RowIndex = 3 * (i / 3) + j / 3;
                // 列号+偏移量
                int ColIndex = 3 * (i % 3) + j % 3;
                //每个小九宫格，总共9个
                if (board[RowIndex][ColIndex] != '.' && !cube.add(board[RowIndex][ColIndex]))
                    return false;
            }
        }
        return true;
    }


    // 会有重复遍历
    public boolean isValidSudoku2(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == '.') continue;

                // 检验行
                for (int column = j + 1; column < board[i].length; column++) {
                    if (board[i][j] == board[i][column]) {
                        return false;
                    }
                }
                // 检验列
                for (int line = i + 1; line < board.length; line++) {
                    if (board[i][j] == board[line][j]) {
                        return false;
                    }
                }
                // 检验九宫格
                for (int line = i / 3 * 3; line < (i / 3 + 1) * 3; line++) {
                    for (int column = j / 3 * 3; column < (j / 3 + 1) * 3; column++) {
                        if (board[i][j] == board[line][column] && line != i && column != j) {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }
}
