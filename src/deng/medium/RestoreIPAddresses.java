package deng.medium;

import java.util.LinkedList;
import java.util.List;

/**
 * 给定一个只包含数字的字符串，复原它并返回所有可能的 IP 地址格式。
 * https://leetcode-cn.com/problems/restore-ip-addresses/
 *
 * @author deng
 * @date 2019/04/20
 */
public class RestoreIPAddresses {
    public List<String> restoreIpAddresses(String s) {
        if (s.length() > 12 || s.length() < 4) return new LinkedList<>();

        List<String> result = new LinkedList<>();
        rec(result, new LinkedList<>(), s, 0);
        return result;
    }

    private void rec(List<String> result, List<String> curResult, String s, int start) {
        if (curResult.size() == 3) {
            String curStr = s.substring(start);
            if (Long.parseLong(curStr) > 255) {
                return;
            } else {
                StringBuilder ip = new StringBuilder();
                for (String seg : curResult) {
                    ip.append(Integer.parseInt(seg) + ".");
                }
                ip.append(Integer.parseInt(curStr));
                if (!result.contains(ip.toString()) && ip.length() == s.length() + 3) result.add(ip.toString());
                return;
            }
        }

        for (int i = start + 1; i < s.length(); i++) {
            String curStr = s.substring(start, i);
            if (Long.parseLong(curStr) > 255) {
                break;
            }

            curResult.add(curStr);
            rec(result, curResult, s, i);
            curResult.remove(curResult.size() - 1);
        }
    }
}