package io.github.fishlikewater.hello.algo.queue;

import io.github.fishlikewater.hello.algo.list.LinkedList;

/**
 * {@code LinkedQueue}
 * 基于链表实现的队列
 *
 * @author zhangxiang
 * @version 1.0.0
 * @since 2024/07/01
 */
public class LinkedListQueue<T> {

    private final LinkedList<T> list;

    public LinkedListQueue() {
        list = new LinkedList<>();
    }

    public void push(T value) {
        list.insert(value);
    }

    public T pop() {
        return list.delete(0);
    }
}
