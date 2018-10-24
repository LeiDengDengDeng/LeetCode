package lynn.easy;

/**
 * Created by liying on 2018/10/24.
 */

import java.util.ArrayList;
import java.util.List;

/**
 * 给定一个字符串 S 和一个字符 C。返回一个代表字符串 S 中每个字符到字符串 S 中的字符 C 的最短距离的数组。
 */
public class ShortestToChar {
    public int[] shortestToChar(String S, char C) {
        int[] res = new int[S.length()];
        char[] charList = S.toCharArray();
        int a = -1;
        List<Integer> cList = new ArrayList<>();
        do {
            a = S.indexOf(C, a + 1);
            cList.add(a);
        } while (a != -1);
        cList.set(cList.size()-1,S.length()*2);
        int before = -S.length();
        int after = cList.get(0);
        int j = 0;
        for (int i = 0; i < charList.length; i++) {
            if (!(i > before && i <= after)) {
                if (j == cList.size() - 1) {
                    break;
                }
                before = cList.get(j);
                j++;
                after = cList.get(j);

            }
            res[i] = i - before < after - i ? i - before : after - i;
        }
        return res;
    }

    public static void main(String[] args) {
        ShortestToChar shortestToChar = new ShortestToChar();
        shortestToChar.shortestToChar("abaa", 'b');
    }
}
