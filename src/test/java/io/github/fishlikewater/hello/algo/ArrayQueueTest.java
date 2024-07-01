package io.github.fishlikewater.hello.algo;

import org.junit.Assert;
import org.junit.Test;

/**
 * {@code ArrayQueueTest}
 *
 * @author zhangxiang
 * @version 1.0.0
 * @since 2024/07/01
 */
public class ArrayQueueTest {

    @Test
    public void testArrayQueue() {
        ArrayQueue<Integer> arrayQueue = new ArrayQueue<>(10);
        arrayQueue.push(1);
        arrayQueue.push(2);
        arrayQueue.push(3);
        Assert.assertEquals(1, (int) arrayQueue.pop());
        Assert.assertEquals(2, (int) arrayQueue.pop());
        Assert.assertEquals(3, (int) arrayQueue.pop());
        Assert.assertEquals(0, (int) arrayQueue.size());
    }
}
