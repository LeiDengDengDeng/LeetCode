package deng.medium;

/**
 * @author deng
 * @date 2019/06/23
 */
public class ZigzagConversion {
    public String convert(String s, int numRows) {
        if (numRows == 1) {
            return s;
        }

        StringBuilder[] lines = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) {
            lines[i] = new StringBuilder();
        }

        boolean up = false;
        int pointer = 0;
        for (char c : s.toCharArray()) {
            lines[pointer].append(c);
            if (pointer == 0 || pointer == numRows - 1) up = !up;
            pointer += up ? 1 : -1;
        }

        StringBuilder result = new StringBuilder();
        for (StringBuilder line : lines) {
            result.append(line);
        }

        return result.toString();
    }
}
