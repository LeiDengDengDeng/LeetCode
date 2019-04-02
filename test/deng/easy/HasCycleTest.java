package deng.easy;

import deng.common.ListNode;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by deng on 2018/7/16.
 */
public class HasCycleTest {
    @Test
    public void hasCycle() throws Exception {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        node1.next = node2;
        node2.next = node3;

        assertFalse(new HasCycle().hasCycle(node1));

        node3.next = node1;
        assertTrue(new HasCycle().hasCycle(node1));
    }

}