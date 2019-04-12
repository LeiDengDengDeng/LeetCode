package deng.easy;

import deng.common.ListNode;

/**
 * https://leetcode-cn.com/problems/reverse-linked-list/submissions/
 * 逆转链表
 *
 * @author deng
 * @date 2019/04/12
 */
public class ReverseLinkedList {
    // 递归
    public ListNode recReverseList(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode next = head.next; // 保存next节点
        head.next = null; // 将head变成孤节点
        ListNode reverseNode = recReverseList(next); // next是原来的头，reverse后的尾
        next.next = head;
        return reverseNode;
    }

    // 非递归
    public ListNode reverseList(ListNode head) {
        if (head == null) return head;

        ListNode dummy = new ListNode(0);
        while (head != null) {
            ListNode next = head.next; // 保存next节点
            head.next = null; // 将head变成孤节点

            ListNode dummyNext = dummy.next;
            dummy.next = head; // 将当前的孤节点拼接到dummy中间
            dummy.next.next = dummyNext;

            head = next;
        }
        return dummy.next;
    }
}
