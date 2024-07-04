package io.github.fishlikewater.hello.algo.list;

import java.util.Arrays;

/**
 * {@code ArrayList}
 *
 * @author zhangxiang
 * @version 1.0.0
 * @since 2024/07/01
 */
@SuppressWarnings("all")
public class ArrayList<T> {

    private Object[] arr;

    private int size = 0;

    private int capacity = 10;

    private final int extendRatio = 2;

    public ArrayList() {
        this.arr = new Object[capacity];
    }

    public int size() {
        return this.size;
    }

    public int capacity() {
        return this.capacity;
    }

    public T get(int index) {
        if (index < 0 || index >= this.size) {
            throw new IndexOutOfBoundsException();
        }
        return (T) arr[index];
    }

    public void set(int index, T t) {
        if (index < 0 || index >= this.size) {
            throw new IndexOutOfBoundsException();
        }
        this.arr[index] = t;
    }

    public void add(T t) {
        if (size == capacity) {
           this.extendCapacity();
        }
        this.arr[size] = t;
        size++;
    }

    public void insert(int index, T t) {
        if (index < 0 || index >= this.capacity) {
            throw new IndexOutOfBoundsException();
        }
        if (size == capacity) {
            this.extendCapacity();
        }
        for (int i = size - 1; i >= index; i--) {
            this.arr[i + 1] = this.arr[i];
        }
        this.arr[index] = t;
        size++;
    }

    public T remove(int index) {
        if (index < 0 || index >= this.size) {
            throw new IndexOutOfBoundsException();
        }
        Object object = this.arr[index];
        for (int i = index; i < size - 1; i++) {
            this.arr[i] = this.arr[i + 1];
        }
        size--;
        return (T) object;
    }

    public void clear() {
        this.arr = new Object[capacity];
        this.size = 0;
        this.capacity = 10;
    }

    private void extendCapacity() {
        this.arr = Arrays.copyOf(this.arr, capacity * extendRatio);
        this.capacity = capacity * extendRatio;
    }
}
