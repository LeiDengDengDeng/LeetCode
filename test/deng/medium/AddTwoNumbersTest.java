package deng.medium;

import deng.common.ListNode;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by deng on 2018/10/3.
 */
public class AddTwoNumbersTest {
    @Test
    public void addTwoNumbers1() throws Exception {
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(5);

        ListNode l2 = new ListNode(3);
        l2.next = new ListNode(5);

        ListNode result = new AddTwoNumbers().addTwoNumbers(l1, l2);
        assertEquals(result.val, 5);
        assertEquals(result.next.val, 9);
        assertEquals(result.next.next.val, 5);
    }

    @Test
    public void addTwoNumbers2() throws Exception {
        ListNode l1 = new ListNode(1);

        ListNode l2 = new ListNode(9);
        l2.next = new ListNode(9);

        ListNode result = new AddTwoNumbers().addTwoNumbers(l1, l2);
        assertEquals(result.val, 0);
        assertEquals(result.next.val, 0);
        assertEquals(result.next.next.val, 1);
    }

    @Test
    public void addTwoNumbers3() throws Exception {
        ListNode l1 = new ListNode(5);

        ListNode l2 = new ListNode(5);

        ListNode result = new AddTwoNumbers().addTwoNumbers(l1, l2);
        assertEquals(result.val, 0);
        assertEquals(result.next.val, 1);
    }

    @Test
    public void addTwoNumbers4() throws Exception {
        ListNode l1 = new ListNode(9);
        l1.next = new ListNode(8);

        ListNode l2 = new ListNode(1);

        ListNode result = new AddTwoNumbers().addTwoNumbers(l1, l2);
        assertEquals(result.val, 0);
        assertEquals(result.next.val, 9);
    }
}