package deng.easy;

/**
 * Created by deng on 2018/5/27.
 * https://leetcode-cn.com/problems/roman-to-integer/description/
 * 给定一个罗马数字，将其转换成整数。输入确保在 1 到 3999 的范围内。
 * I             1
 * V             5
 * X             10
 * L             50
 * C             100
 * D             500
 * M             1000
 */
public class Roman {
    private String romanChars = "IVXLCDM";
    private int[] romanNums = {1, 5, 10, 50, 100, 500, 1000};

    public int romanToInt(String s) {
        int result = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            int curRomanCharLoc = romanChars.indexOf(s.charAt(i));
            int nextRomanCharLoc = romanChars.indexOf(s.charAt(i + 1));
            int num = romanNums[curRomanCharLoc];
            result = nextRomanCharLoc > curRomanCharLoc ? result - num : result + num;
        }
        result += romanNums[romanChars.indexOf(s.charAt(s.length() - 1))];
        return result;
    }

    public static void main(String[] args){
        System.out.println(new Roman().romanToInt("MCMXCIV")); //1994
    }
}
