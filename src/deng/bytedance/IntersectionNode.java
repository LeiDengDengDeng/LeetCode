package deng.bytedance;

import deng.common.ListNode;

/**
 * https://leetcode-cn.com/explore/interview/card/bytedance/244/linked-list-and-tree/1024/
 *
 * @author deng
 * @date 2019/09/28
 */
public class IntersectionNode {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }

        if (headA == headB) {
            return headA;
        }

        ListNode a = headA.next;
        ListNode b = headB.next;

        while (a != null && b != null) {
            a = a.next;
            b = b.next;
        }

        if (a == null) {
            while (b != null) {
                headB = headB.next;
                b = b.next;
            }
        }

        if (b == null) {
            while (a != null) {
                headA = headA.next;
                a = a.next;
            }
        }

        while (headA != null && headB != null && headA != headB) {
            headA = headA.next;
            headB = headB.next;
        }

        return headA;
    }
}
