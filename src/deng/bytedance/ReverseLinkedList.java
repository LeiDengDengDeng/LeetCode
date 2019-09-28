package deng.bytedance;

import deng.common.ListNode;

/**
 * https://leetcode-cn.com/explore/interview/card/bytedance/244/linked-list-and-tree/1038/
 *
 * @author deng
 * @date 2019/09/28
 */
public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return null;
        }

        ListNode dummy = null;
        while (head != null) {
            ListNode nextNode = head.next;
            head.next = dummy;
            dummy = head;
            head = nextNode;
        }

        return dummy;
    }
}
