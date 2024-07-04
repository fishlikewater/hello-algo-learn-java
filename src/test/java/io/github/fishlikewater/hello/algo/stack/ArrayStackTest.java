package io.github.fishlikewater.hello.algo.stack;

import org.junit.Assert;
import org.junit.Test;

/**
 * {@code ArrayStackTest}
 *
 * @author zhangxiang
 * @version 1.0.0
 * @since 2024/07/01
 */
public class ArrayStackTest {

    @Test
    public void testArrayStack() {
        ArrayStack<Integer> stack = new ArrayStack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        Assert.assertEquals(3, (int) stack.pop());
        Assert.assertEquals(2, (int) stack.peek());
        Assert.assertEquals(2, (int) stack.pop());
    }
}
