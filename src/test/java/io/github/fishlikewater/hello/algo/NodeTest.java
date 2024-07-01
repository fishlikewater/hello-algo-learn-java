package io.github.fishlikewater.hello.algo;

import org.junit.Assert;
import org.junit.Test;

/**
 * {@code NodeTest}
 *
 * @author zhangxiang
 * @version 1.0.0
 * @since 2024/07/01
 */
public class NodeTest {

    @Test
    public void testNode() {

        Node<Integer> node1 = new Node<>(1);
        Node<Integer> node2 = new Node<>(3);
        Node<Integer> node3 = new Node<>(4);
        Node<Integer> node4 = new Node<>(2);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        Assert.assertEquals((int) node1.next.val, 3);
    }
}
