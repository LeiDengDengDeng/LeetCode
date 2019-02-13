package lynn.easy;

import java.util.Arrays;

/**
 * Created by liying on 2018/7/16.
 * <p>
 * 给定一个链表，判断链表中是否有环。
 */
public class circularChain {
    /**
     * Definition for singly-linked list.
     * class ListNode {
     * int val;
     * ListNode next;
     * ListNode(int x) {
     * val = x;
     * next = null;
     * }
     * }
     */
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }
        ListNode point = head.next;
        while (point.next != null&&head.next!=null&&point.next.next!=null) {
            if (head == point) {
                return true;
            }
            point = point.next.next;
            head = head.next;
        }

        return false;
    }


    public static void main(String[] args) {
        circularChain c = new circularChain();
        ListNode n1 = new ListNode(3);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(0);
        ListNode n4 = new ListNode(-4);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
//        n4.next = n2;
        System.out.println(c.hasCycle(n1));
    }

}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}
/**
 * 解决方案1：想象一下，两名运动员以不同的速度在环形赛道上跑步会发生什么？
 * 解决方案2：我们遍历所有结点并在哈希表中存储每个结点的引用（或内存地址）。
 *          如果当前结点为空结点 null（即已检测到链表尾部的下一个结点），那么我们已经遍历完整个链表，并且该链表不是环形链表。
 *          如果当前结点的引用已经存在于哈希表中，那么返回 true（即该链表为环形链表）。
 */
