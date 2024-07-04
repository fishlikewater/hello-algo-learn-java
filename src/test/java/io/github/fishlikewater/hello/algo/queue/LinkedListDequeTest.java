package io.github.fishlikewater.hello.algo.queue;

import org.junit.Assert;
import org.junit.Test;

/**
 * {@code LinkedListDequeTest}
 * 链表实现双向队列测试
 *
 * @author zhangxiang
 * @version 1.0.0
 * @since 2024/07/02
 */
public class LinkedListDequeTest {

    @Test
    public void testLinkedListDeque() {
        LinkedListDeque<Integer> deque = new LinkedListDeque<>();
        deque.pushFirst(1);
        deque.pushFirst(2);
        deque.pushLast(3);
        deque.pushLast(4);

        Assert.assertEquals(2, (int) deque.popFirst());
        Assert.assertEquals(4, (int) deque.popLast());
        Assert.assertEquals(1, (int) deque.popFirst());
        Assert.assertEquals(3, (int) deque.popLast());
    }
}
