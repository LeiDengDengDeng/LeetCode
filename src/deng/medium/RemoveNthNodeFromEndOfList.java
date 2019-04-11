package deng.medium;

import deng.common.ListNode;

/**
 * https://leetcode-cn.com/problems/remove-nth-node-from-end-of-list/submissions/
 * 给定一个链表，删除链表的倒数第 n 个节点，并且返回链表的头结点。
 * [双指针]
 *
 * @author deng
 * @date 2019/04/12
 */
public class RemoveNthNodeFromEndOfList {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode firPointer = head;
        for (; n > 0; n--) firPointer = firPointer.next;

        // 代表删除第一个节点
        if (firPointer == null) return head.next;

        ListNode secPointer = head;
        // 判断next而不是自身是否为null，目的是将指针停在要删除节点的前一个节点上，所以前面也要判断firPointer的空
        while (firPointer.next != null) {
            firPointer = firPointer.next;
            secPointer = secPointer.next;
        }

        secPointer.next = secPointer.next.next;
        return head;
    }
}
