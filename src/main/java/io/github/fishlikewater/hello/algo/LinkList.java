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

    private ListNode<T> lastNode;

    private int size;

    public LinkList() {

    }

    public int size() {
        return this.size;
    }

    public T get(int index) {
        return this.getNode(index).val;
    }

    public void insert(T t) {
        if (this.head == null) {
            this.head = new ListNode<T>(t);
            this.size++;
            return;
        }
        ListNode<T> node = this.head;
        if (this.lastNode == null) {
            this.lastNode = new ListNode<T>(t);
            node.next = this.lastNode;
        } else {
            ListNode<T> oldLast = this.lastNode;
            this.lastNode = new ListNode<T>(t);
            oldLast.next = this.lastNode;
        }
        this.size++;
    }

    public T delete(int index) {
        if (index == 0) {
            T val = this.head.val;
            this.head = this.head.next;
            this.size--;
            return val;
        }
        ListNode<T> preNode = this.getNode(index - 1);
        T val = preNode.next.val;
        preNode.next = preNode.next.next;
        this.size--;
        return val;
    }

    private ListNode<T> getNode(int index) {
        ListNode<T> next = this.head;
        for (int i = 0; i < index; i++) {
            next = next.next;
        }
        return next;
    }
}
