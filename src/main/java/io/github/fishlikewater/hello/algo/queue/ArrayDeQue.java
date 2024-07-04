package io.github.fishlikewater.hello.algo.queue;

/**
 * {@code ArrayDeQue}
 * 数组实现双向队列
 *
 * @author zhangxiang
 * @version 1.0.0
 * @since 2024/07/02
 */
public class ArrayDeQue<T> {

    private Object[] arr;

    private int front;

    private int rear;

    private int queSize;

    public ArrayDeQue(int size) {
        this.arr = new Object[size];
    }

    /**
     * 添加到队首
     * <pre>
     * e.g.
     *      [10]{}(front=0, rear=0)
     *  pushLast->
     *      [1,2,3,4,5,0,0,0,0,0] (front=0, rear=5)
     *  pushFirst->
     *      [1,2,3,4,5,0,0,0,0,6] (front=9, rear=5)
     *  pushLast->
     *      [1,2,3,4,5,7,0,0,0,8,6] (front=8, rear=6)
     *  pushFirst->
     *      [1,2,3,4,5,7,0,0,9,8,6] (front=7, rear=6)
     *
     * </pre>
     *
     * @param value 添加的值
     */
    public void pushFirst(T value) {
        if (this.queSize == this.capacity()) {
            throw new IndexOutOfBoundsException();
        }
        this.front = ((this.front - 1) + capacity()) % capacity();
        this.arr[this.front] = value;
        this.queSize++;
    }

    public void pushLast(T value) {
        if (this.queSize == this.capacity()) {
            throw new IndexOutOfBoundsException();
        }
        this.arr[rear] = value;
        rear++;
        this.queSize++;
    }

    public T popFirst() {
        if (this.queSize == 0) {
            throw new IndexOutOfBoundsException();
        }
        Object o = this.arr[this.front];
        this.front = (this.front + 1) % arr.length;
        this.queSize--;
        return (T) o;
    }

    public T popLast() {
        if (this.queSize == 0) {
            throw new IndexOutOfBoundsException();
        }
        this.rear--;
        this.queSize--;
        return (T) this.arr[this.rear];
    }

    public int capacity() {
        return arr.length;
    }
}
