package io.github.fishlikewater.hello.algo;

import org.junit.Assert;
import org.junit.Test;

/**
 * {@code LinkStackTest}
 * 链表栈
 *
 * @author zhangxiang
 * @version 1.0.0
 * @since 2024/07/01
 */
public class LinkStackTest {

    @Test
    public void testLinkStack() {
        LinkStack<Integer> linkStack = new LinkStack<>();
        linkStack.push(1);
        linkStack.push(2);
        linkStack.push(3);
        Assert.assertEquals(3, (int) linkStack.pop());
        Assert.assertEquals(2, (int) linkStack.pop());
        Assert.assertEquals(1, (int) linkStack.peek());
        Assert.assertEquals(1, (int) linkStack.pop());
    }
}
