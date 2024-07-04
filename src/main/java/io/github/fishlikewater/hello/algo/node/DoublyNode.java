package io.github.fishlikewater.hello.algo.node;

/**
 * {@code DoublyNode}
 * 双向节点
 *
 * @author zhangxiang
 * @version 1.0.0
 * @since 2024/07/01
 */
public class DoublyNode<T> {

    public T val;

    public DoublyNode<T> pre;

    public DoublyNode<T> next;

    public DoublyNode(T x) {
        this.val = x;
    }
}
