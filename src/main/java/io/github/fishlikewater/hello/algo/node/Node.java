package io.github.fishlikewater.hello.algo.node;

/**
 * {@code Node}
 * 链表节点
 *
 * @author zhangxiang
 * @version 1.0.0
 * @since 2024/07/01
 */
public class Node<T> {

    public T val;

    public Node<T> next;

    Node(T x) {
        this.val = x;
    }
}
