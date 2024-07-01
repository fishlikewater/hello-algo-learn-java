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

    private final ArrayList<T> arrList;

    public ArrayQueue() {
        arrList = new ArrayList<>();
    }

    public void push(T value) {
        this.arrList.add(value);
    }

    public T pop() {
        return this.arrList.remove(0);
    }

}
