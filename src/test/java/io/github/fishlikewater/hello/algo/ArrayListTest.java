package io.github.fishlikewater.hello.algo;

import org.junit.Assert;
import org.junit.Test;

/**
 * {@code ArrayListTest}
 *
 * @author zhangxiang
 * @version 1.0.0
 * @since 2024/07/01
 */
public class ArrayListTest {

    @Test
    public void testArrayList() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        Assert.assertEquals(4, arrayList.size());
        arrayList.remove(1);
        Assert.assertEquals(3, arrayList.size());
        Assert.assertEquals(3, (int)arrayList.get(1));
        arrayList.clear();
        Assert.assertEquals(0, arrayList.size());
        arrayList.add(2);
        arrayList.set(0, 1);
        Assert.assertEquals(1, (int)arrayList.get(0));
        arrayList.insert(1, 2);
        Assert.assertEquals(2, (int) arrayList.get(1));
    }
}
