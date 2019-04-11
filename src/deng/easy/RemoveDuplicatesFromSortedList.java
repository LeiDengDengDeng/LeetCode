package deng.easy;

import deng.common.ListNode;

/**
 * https://leetcode-cn.com/problems/remove-duplicates-from-sorted-list/
 * <p>
 * 给定一个排序链表，删除所有重复的元素，使得每个元素只出现一次。
 *
 * @author deng
 * @date 2019/04/03
 */
public class RemoveDuplicatesFromSortedList {
    // 非递归版本
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) return head;

        ListNode cur = head;
        while (cur.next != null) {
            if (cur.val == cur.next.val) {
                cur.next = cur.next.next;
            } else {
                cur = cur.next;
            }
        }

        return head;
    }
}
