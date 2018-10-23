package deng.medium;

import deng.common.ListNode;

/**
 * Created by deng on 2018/10/3.
 * https://leetcode-cn.com/problems/add-two-numbers/description/
 * 给定两个非空链表来表示两个非负整数。位数按照逆序方式存储，它们的每个节点只存储单个数字。将两数相加返回一个新的链表。
 */
public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode next = head;

        int carryBit = 0;
        while (true) {
            int bitSum = l1.val + l2.val + carryBit;
            next.val = bitSum % 10;
            carryBit = bitSum / 10;
            l1 = l1.next;
            l2 = l2.next;

            if (l1 == null || l2 == null) {
                addOne(next, l1, carryBit);
                addOne(next, l2, carryBit);

                if (l1 == null && l2 == null & carryBit != 0) {
                    next.next = new ListNode(1);
                }
                break;
            }

            next.next = new ListNode(0);
            next = next.next;
        }

        return head;
    }

    private void addOne(ListNode next, ListNode node, int carryBit) {
        if (node == null) return;

        while (carryBit != 0 && node != null) {
            int bitSum = node.val + carryBit;
            carryBit = bitSum / 10;
            next.next = new ListNode(bitSum % 10);
            next = next.next;
            node = node.next;
        }

        if (node != null) {
            next.next = node;
        } else if (carryBit == 1) {
            next.next = new ListNode(1);
        }
    }
}
