package io.github.fishlikewater.hello.algo;

import org.junit.Assert;
import org.junit.Test;

/**
 * {@code LinkListTest}
 *
 * @author zhangxiang
 * @version 1.0.0
 * @since 2024/07/01
 */
public class LinkListTest {

    @Test
    public void testLinkListInsert() {
        LinkList<Integer> linkList = new LinkList<>();
        linkList.insert(1);
        linkList.insert(2);
        linkList.insert(3);
    }

    @Test
    public void testLinkListDelete() {
        LinkList<Integer> linkList = new LinkList<>();
        linkList.insert(1);
        linkList.insert(2);
        linkList.insert(3);
        linkList.delete(0);
        Assert.assertEquals(2, (int) linkList.get(0));
        Assert.assertEquals(3, (int) linkList.get(1));
        Assert.assertEquals(2, linkList.size());
    }

    @Test
    public void testLinkListGet() {
        LinkList<Integer> linkList = new LinkList<>();
        linkList.insert(1);
        linkList.insert(2);
        linkList.insert(3);
        Assert.assertEquals(3, (int) linkList.get(2));
    }

}
