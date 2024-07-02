package io.github.fishlikewater.hello.algo;

import org.junit.Assert;
import org.junit.Test;

/**
 * {@code ArrayDeQueTest}
 * 数组实现双向队列测试
 *
 * @author zhangxiang
 * @version 1.0.0
 * @since 2024/07/02
 */
public class ArrayDeQueTest {

    @Test
    public void testArrayDeQue() {
        ArrayDeQue<Object> arrayDeQue = new ArrayDeQue<>(10);
        arrayDeQue.pushFirst("1");
        arrayDeQue.pushFirst("2");
        arrayDeQue.pushFirst("3");
        arrayDeQue.pushLast("4");
        arrayDeQue.pushLast("5");

        Assert.assertEquals(arrayDeQue.popFirst(), "3");
        Assert.assertEquals(arrayDeQue.popFirst(), "2");
        Assert.assertEquals(arrayDeQue.popLast(), "5");
    }
}
