package io.github.fishlikewater.hello.algo.hash;

import org.junit.Assert;
import org.junit.Test;

/**
 * {@code ArrayHashMapTest}
 *
 * @author zhangxiang
 * @version 1.0.0
 * @since 2024/07/04
 */
public class ArrayHashMapTest {

    @Test
    public void testArrayHashMap() {
        ArrayHashMap<String> arrayHashMap = new ArrayHashMap<>();
        arrayHashMap.put("1", "1");
        arrayHashMap.put("2", "2");
        arrayHashMap.put("3", "3");
        arrayHashMap.put("4", "4");
        arrayHashMap.put("5", "5");
        arrayHashMap.put("6", "6");

        Assert.assertEquals("1", arrayHashMap.get("1"));
        System.out.println(arrayHashMap.toString());
    }
}
