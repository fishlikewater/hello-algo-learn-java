package io.github.fishlikewater.hello.algo.stack;

import io.github.fishlikewater.hello.algo.node.Node;

/**
 * {@code LinkedStack}
 * 基于链表的栈
 *
 * @author zhangxiang
 * @version 1.0.0
 * @since 2024/07/01
 */
public class LinkedListStack<T> {

    private Node<T> stackHead = null;

    private int size;

    public LinkedListStack() {

    }

    public int size() {
        return this.size;
    }

    public void push(T t) {
        Node<T> tNode = new Node<>(t);
        tNode.next = this.stackHead;
        this.stackHead = tNode;
        this.size++;
    }

    public T pop() {
        T val = this.stackHead.val;
        this.stackHead = this.stackHead.next;
        this.size--;
        return val;
    }

    public T peek() {
        return this.stackHead.val;
    }
}
