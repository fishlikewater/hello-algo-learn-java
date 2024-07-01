package io.github.fishlikewater.hello.algo;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * {@code ArrayTest}
 * 数组测试
 *
 * @author zhangxiang
 * @version 1.0.0
 * @since 2024/07/01
 */
public class ArrayTest {

    private Array array;

    private int[] arr;

    @Before
    public void init() {
        this.arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        array = new Array(this.arr);
    }

    @Test
    public void testRandomAccess() {
        int randomAccess = this.array.randomAccess();
        Assert.assertTrue(randomAccess >= 0);
    }

    @Test
    public void testInsert() {
        this.array.insert(11, 8);
        Assert.assertEquals(11, this.arr[8]);
    }

    @Test
    public void testDelete() {
        this.array.delete(8);
        Assert.assertEquals(10, this.arr[8]);
    }
}
