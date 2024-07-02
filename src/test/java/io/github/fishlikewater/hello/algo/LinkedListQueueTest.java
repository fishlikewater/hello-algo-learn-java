package io.github.fishlikewater.hello.algo;

import org.junit.Assert;
import org.junit.Test;

/**
 * {@code LinkedQueueTest}
 *
 * @author zhangxiang
 * @version 1.0.0
 * @since 2024/07/01
 */
public class LinkedListQueueTest {

    @Test
    public void testLinkedQueue() {
        LinkedListQueue<Integer> queue = new LinkedListQueue<>();
        queue.push(1);
        queue.push(2);
        queue.push(3);
        Assert.assertEquals(1, (int) queue.pop());
        Assert.assertEquals(2, (int) queue.pop());
        Assert.assertEquals(3, (int) queue.pop());
    }
}
