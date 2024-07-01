package io.github.fishlikewater.hello.algo;

/**
 * {@code LinkedList}
 * 实现LinkedList
 *
 * @author zhangxiang
 * @version 1.0.0
 * @since 2024/07/01
 */
public class LinkedList<T> {

    private Node<T> head;

    private Node<T> lastNode;

    private int size;

    public LinkedList() {

    }

    public int size() {
        return this.size;
    }

    public T get(int index) {
        return this.getNode(index).val;
    }

    public void insert(T t) {
        if (this.head == null) {
            this.head = new Node<T>(t);
            this.size++;
            return;
        }
        Node<T> node = this.head;
        if (this.lastNode == null) {
            this.lastNode = new Node<T>(t);
            node.next = this.lastNode;
        } else {
            Node<T> oldLast = this.lastNode;
            this.lastNode = new Node<T>(t);
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
        Node<T> preNode = this.getNode(index - 1);
        T val = preNode.next.val;
        preNode.next = preNode.next.next;
        this.size--;
        return val;
    }

    private Node<T> getNode(int index) {
        Node<T> next = this.head;
        for (int i = 0; i < index; i++) {
            next = next.next;
        }
        return next;
    }
}
