package io.github.fishlikewater.hello.algo;

import org.junit.Assert;
import org.junit.Test;

/**
 * {@code DoublyLinkedListTest}
 *
 * @author zhangxiang
 * @version 1.0.0
 * @since 2024/07/01
 */
public class DoublyLinkedListTest {

    @Test
    public void testDeepLinkedList() {
        DoublyLinkedList<Object> doublyLinkedList = new DoublyLinkedList<>();
        doublyLinkedList.insert(1);
        doublyLinkedList.insert(2);
        doublyLinkedList.insert(3);
        Assert.assertEquals(1, (int) doublyLinkedList.get(0));
        Assert.assertEquals(2, (int) doublyLinkedList.get(1));
        Assert.assertEquals(3, doublyLinkedList.size());
    }
}
