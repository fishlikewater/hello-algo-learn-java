package io.github.fishlikewater.hello.algo;

/**
 * {@code ArrayQueue}
 * 基于数组实现的队列
 *
 * @author zhangxiang
 * @version 1.0.0
 * @since 2024/07/01
 */
public class ArrayQueue<T> {

    private Object[] arr;

    private int front;

    private int rear;

    private int queSize;

    public ArrayQueue(int size) {
        this.arr = new Object[size];
        this.front = 0;
        this.rear = 0;
    }

    public int capacity() {
        return this.arr.length;
    }

    public void push(T value) {
        if (this.queSize == this.capacity()) {
            throw new IndexOutOfBoundsException();
        }
        this.arr[this.rear] = value;
        this.rear = (this.rear + 1) % this.capacity();
        queSize++;
    }

    public T pop() {
        T peek = this.peek();
        if (peek != null) {
            this.front = (this.front + 1) % this.capacity();
            this.queSize--;
        }
        return peek;
    }

    public T peek() {
        if (this.queSize == 0) {
            return null;
        }
        Object o = this.arr[this.front];

        return (T) o;
    }

    public int size() {
        return this.queSize;
    }

/*    private final ArrayList<T> arrList;

    public ArrayQueue() {
        arrList = new ArrayList<>();
    }

    public void push(T value) {
        this.arrList.add(value);
    }

    public T pop() {
        return this.arrList.remove(0);
    }*/

}
