package io.github.fishlikewater.hello.algo.array;

import java.util.concurrent.ThreadLocalRandom;

/**
 * {@code Array}
 * 数组
 *
 * @author zhangxiang
 * @version 1.0.0
 * @since 2024/07/01
 */
public class Array {

    private final int[] array;

    public Array(int[] array) {
        this.array = array;
    }


    public int randomAccess() {
        int randomIndex = ThreadLocalRandom.current().nextInt(0, this.array.length);
        return this.array[randomIndex];
    }

    public void insert(int count, int index) {
        if (index < 0 || index > this.array.length) {
            throw new IndexOutOfBoundsException();
        }
        for (int i = this.array.length - 1; i > index; i--) {
            this.array[i] = this.array[i - 1];
        }
        this.array[index] = count;
    }

    public void delete(int index) {
        if (index < 0 || index > this.array.length) {
            throw new IndexOutOfBoundsException();
        }
        for (int i = index; i < this.array.length - 1; i++) {
            this.array[i] = this.array[i + 1];
        }
    }

}
