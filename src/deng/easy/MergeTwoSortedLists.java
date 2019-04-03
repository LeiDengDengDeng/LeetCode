package deng.easy;

import deng.common.ListNode;

/**
 * https://leetcode-cn.com/problems/merge-two-sorted-lists/
 *
 * 将两个有序链表合并为一个新的有序链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。
 *
 * @author deng
 * @date 2019/04/03
 */
public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode fakeHead = new ListNode(0);
        ListNode cur = fakeHead;
        while (l1 != null && l2 != null) {
            if (l1.val > l2.val) {
                cur.next = l2;
                l2 = l2.next;
            } else {
                cur.next = l1;
                l1 = l1.next;
            }
            cur = cur.next;
        }
        if (l1 != null) cur.next = l1;
        if (l2 != null) cur.next = l2;
        return fakeHead.next;
    }
}
