package io.github.fishlikewater.hello.algo.queue;

import io.github.fishlikewater.hello.algo.list.DoublyLinkedList;

/**
 * {@code LinkedListDequeue}
 * 链表实现双向队列
 *
 * @author zhangxiang
 * @version 1.0.0
 * @since 2024/07/02
 */
public class LinkedListDeque<T> {

    private final DoublyLinkedList<T> list;

    public LinkedListDeque() {
        list = new DoublyLinkedList<>();
    }

    public void pushFirst(T value) {
        list.insertFirst(value);
    }

    public void pushLast(T value) {
        list.insert(value);
    }

    public T popFirst() {
        return list.deleteFirst();
    }

    public T popLast() {
        return list.deleteLast();
    }
}
