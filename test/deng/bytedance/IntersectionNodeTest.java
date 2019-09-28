package deng.bytedance;

import deng.common.ListNode;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author deng
 * @date 2019/09/28
 */
public class IntersectionNodeTest {

    @Test
    public void getIntersectionNode1() {
        ListNode a = new ListNode(4);
        a.next = new ListNode(1);

        ListNode b = new ListNode(5);
        b.next = new ListNode(0);
        b.next.next = new ListNode(1);

        ListNode common = new ListNode(8);
        common.next = new ListNode(4);
        common.next.next = new ListNode(5);

        a.next.next = common;
        b.next.next.next = common;

        Assert.assertEquals(common, new IntersectionNode().getIntersectionNode(a, b));
    }

    @Test
    public void getIntersectionNode2() {
        Assert.assertEquals(null, new IntersectionNode().getIntersectionNode(new ListNode(1), null));
    }
}