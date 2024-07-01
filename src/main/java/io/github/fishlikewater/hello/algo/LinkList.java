package io.github.fishlikewater.hello.algo;

/**
 * {@code LinkList}
 * 实现linklist
 *
 * @author zhangxiang
 * @version 1.0.0
 * @since 2024/07/01
 */
public class LinkList<T> {

    private ListNode<T> head;

    public LinkList() {

    }

    public void insert(ListNode<T> n0, ListNode<T> p) {
        ListNode<T> next = n0.next;
        n0.next = p;
        p.next = next;
    }

    public T get(int index) {
        ListNode<T> next = this.head;
        for (int i = 0; i < index; i++) {
            next = next.next;
        }
        return next.val;
    }

    public void insert(T t) {
        if (this.head == null) {
            this.head = new ListNode<T>(t);
            return;
        }
        ListNode<T> node = this.head;
        while (true) {
            if (node.next == null) {
                node.next = new ListNode<T>(t);
                break;
            }
            node = node.next;
        }
    }

    public void delete(int index) {
        int i = 0;
        ListNode<T> node = this.head;
        while (true) {
            if (node == null) {
                throw new IllegalArgumentException("index out of range");
            }
            if (i == index) {
                node.val = node.next.val;
                node.next = node.next.next;
                break;
            }
            node = node.next;
            i++;
        }
    }
}
