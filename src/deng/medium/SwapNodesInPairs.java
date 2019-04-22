package deng.medium;

import deng.common.ListNode;

/**
 * https://leetcode-cn.com/problems/swap-nodes-in-pairs
 * 给定一个链表，两两交换其中相邻的节点，并返回交换后的链表。
 * 你不能只是单纯的改变节点内部的值，而是需要实际的进行节点交换。
 *
 * @author deng
 * @date 2019/04/16
 */
public class SwapNodesInPairs {
    // 递归
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode next = head.next;
        head.next = swapPairs(next.next);
        next.next = head;

        return next;
    }

    // 非递归
    public ListNode nonRecSwapPairs(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode cur = dummy;
        while (cur.next != null && cur.next.next != null) {
            ListNode firNode = cur.next;
            ListNode secNode = cur.next.next;

            firNode.next = secNode.next;
            secNode.next = firNode;

            cur.next = secNode;
            cur = cur.next.next;
        }

        return dummy.next;
    }
}
