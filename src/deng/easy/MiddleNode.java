package deng.easy;

import deng.common.ListNode;
import deng.common.ListNodeUtil;

/**
 * 给定一个头结点为 head 的非空单链表，返回链表的中间结点。
 * 如果有两个中间结点，则返回第二个中间结点。
 * ======= 如果有两个中间节点，返回第一个中间节点呢？ --> 添加dummy
 * <p>
 * https://leetcode.cn/problems/middle-of-the-linked-list/
 *
 * @author deng
 * @date 2022/06/19
 */
public class MiddleNode {

    // quick slow pointer
    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode quick = head;
        while (quick != null && quick.next != null) {
            slow = slow.next;
            quick = quick.next.next;
        }

        return slow;
    }

    // traverse twice
    public ListNode middleNode2(ListNode head) {
        int length = 0;
        ListNode index = head;
        while (index != null) {
            index = index.next;
            length++;
        }

        index = head;
        for (int i = 0; i < length / 2; i++) {
            index = index.next;
        }

        return index;
    }

}
