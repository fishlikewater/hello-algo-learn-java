package io.github.fishlikewater.hello.algo.list;

import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * {@code ArrayList}
 *
 * @author zhangxiang
 * @version 1.0.0
 * @since 2024/07/01
 */
@SuppressWarnings("all")
public class ArrayList<T> implements Iterable<T> {

    private Object[] arr;

    private int size = 0;

    private int capacity = 10;

    private final int extendRatio = 2;

    public ArrayList() {
        this.arr = new Object[capacity];
    }

    public ArrayList(int capacity) {
        this.capacity = capacity;
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

    public int remove(T t) {
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (this.arr[i].equals(t)) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            return index;
        }
        this.fastRemove(index);
        return index;
    }

    public void clear() {
        this.arr = new Object[capacity];
        this.size = 0;
        this.capacity = 10;
    }

    private void fastRemove(int i) {
        final int newSize;
        if ((newSize = this.size - 1) > i) {
            System.arraycopy(this.arr, i + 1, this.arr, i, newSize - i);
        }
        this.arr[size = newSize] = null;
    }

    private void extendCapacity() {
        this.arr = Arrays.copyOf(this.arr, capacity * extendRatio);
        this.capacity = capacity * extendRatio;
    }

    @Override
    public Iterator<T> iterator() {
        return new ArrayItr<>((T[]) this.arr, this.size);
    }

    private static class ArrayItr<E> implements Iterator<E> {
        private int cursor;
        private final E[] a;
        private final int size;

        ArrayItr(E[] a, int size) {
            this.a = a;
            this.size = size;
        }

        @Override
        public boolean hasNext() {
            return cursor < this.size;
        }

        @Override
        public E next() {
            int i = cursor;
            if (i >= a.length) {
                throw new NoSuchElementException();
            }
            cursor = i + 1;
            return a[i];
        }
    }
}
