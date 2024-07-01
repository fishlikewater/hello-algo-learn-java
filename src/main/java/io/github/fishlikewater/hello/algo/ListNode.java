package io.github.fishlikewater.hello.algo;

import lombok.Data;

/**
 * {@code ListNode}
 * 链表节点
 *
 * @author zhangxiang
 * @version 1.0.0
 * @since 2024/07/01
 */
public class ListNode<T> {

    public T val;

    public ListNode<T> next;

    ListNode(T x) {
        this.val = x;
    }
}
