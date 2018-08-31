package deng.medium;

/**
 * Created by deng on 2018/8/31.
 * https://leetcode-cn.com/problems/integer-to-roman/description/
 * 罗马数字包含以下七种字符： I， V， X， L，C，D 和 M。
 * <p>
 * 字符          数值
 * I             1
 * V             5
 * X             10
 * L             50
 * C             100
 * D             500
 * M             1000
 * <p>
 * 例如， 罗马数字 2 写做 II ，即为两个并列的 1。12 写做 XII ，即为 X + II 。 27 写做  XXVII, 即为 XX + V + II 。
 * <p>
 * 通常情况下，罗马数字中小的数字在大的数字的右边。但也存在特例，例如 4 不写做 IIII，而是 IV。数字 1 在数字 5 的左边，所表示的数等于大数 5 减小数 1 得到的数值 4 。同样地，数字 9 表示为 IX。这个特殊的规则只适用于以下六种情况：
 * <p>
 * I 可以放在 V (5) 和 X (10) 的左边，来表示 4 和 9。
 * X 可以放在 L (50) 和 C (100) 的左边，来表示 40 和 90。
 * C 可以放在 D (500) 和 M (1000) 的左边，来表示 400 和 900。
 * 给定一个整数，将其转为罗马数字。输入确保在 1 到 3999 的范围内。
 */
public class IntToRoman {
    public String intToRoman(int num) {
        char[][] romans = {
                {'I', 'V', 'X'},
                {'X', 'L', 'C'},
                {'C', 'D', 'M'},
                {'M', '-', '-'}     // 两个-代表未知，因为只计数到3999以内
        };

        StringBuilder result = new StringBuilder();
        int counter = 0;
        while (num > 0) {
            int x = num % 10;
            if (x <= 3) {
                for (int i = 0; i < x; i++) {
                    result.insert(0, romans[counter][0]);
                }
            } else if (x >= 5 && x <= 8) {
                for (int i = 0; i < x - 5; i++) {
                    result.insert(0, romans[counter][0]);
                }
                result.insert(0, romans[counter][1]);
            } else {
                // x=4或x=9
                result.insert(0, romans[counter][(x + 1) / 5]);
                result.insert(0, romans[counter][0]);
            }

            counter++;
            num /= 10;
        }
        return result.toString();
    }
}
