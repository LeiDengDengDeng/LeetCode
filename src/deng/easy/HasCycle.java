package deng.easy;

import deng.common.ListNode;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by deng on 2018/7/16.
 * https://leetcode-cn.com/problems/linked-list-cycle/description/
 * 给定一个链表，判断链表中是否有环。
 *
 进阶：
 你能否不使用额外空间解决此题？
 -> 使用双指针 两倍速和一倍速 环形圈跑步的两个人总会相遇
 */
public class HasCycle {
    public boolean hasCycle(ListNode head) {
        Set<ListNode> listNodeSet = new HashSet<>();
        while (head != null) {
            if (listNodeSet.contains(head)) {
                return true;
            } else {
                listNodeSet.add(head);
                head = head.next;
            }
        }
        return false;
    }
}

