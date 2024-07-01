package io.github.fishlikewater.hello.algo;

import org.junit.Assert;
import org.junit.Test;

/**
 * {@code ListNodeTest}
 *
 * @author zhangxiang
 * @version 1.0.0
 * @since 2024/07/01
 */
public class ListNodeTest {

    @Test
    public void testListNode() {

        ListNode<Integer> node1 = new ListNode<>(1);
        ListNode<Integer> node2 = new ListNode<>(3);
        ListNode<Integer> node3 = new ListNode<>(4);
        ListNode<Integer> node4 = new ListNode<>(2);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        Assert.assertEquals((int) node1.next.val, 3);
    }
}
