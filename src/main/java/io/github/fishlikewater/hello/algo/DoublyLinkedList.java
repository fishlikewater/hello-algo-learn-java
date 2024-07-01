package io.github.fishlikewater.hello.algo;

/**
 * {@code DoublyLinkedList}
 * 双向链表
 *
 * @author zhangxiang
 * @version 1.0.0
 * @since 2024/07/01
 */
public class DoublyLinkedList<T> {

    private DoublyNode<T> head;

    private DoublyNode<T> lastNode;


    private int size;

    public DoublyLinkedList() {

    }

    public DoublyLinkedList(T t) {
        this.head = new DoublyNode<>(t);
        this.size = 1;
    }

    public int size() {
        return size;
    }

    public void insert(T t) {
        if (this.head == null) {
            this.head = new DoublyNode<T>(t);
            this.size++;
            return;
        }
        DoublyNode<T> node = this.head;
        if (this.lastNode == null) {
            this.lastNode = new DoublyNode<T>(t);
            node.next = this.lastNode;
            this.lastNode.pre = node;
        } else {
            DoublyNode<T> oldLast = this.lastNode;
            this.lastNode = new DoublyNode<T>(t);
            oldLast.next = this.lastNode;
            this.lastNode.pre = oldLast;
        }
        this.size++;
    }

    public T delete(int index) {
        if (index < 0 || index >= this.size) {
            throw new IndexOutOfBoundsException();
        }
        DoublyNode<T> node = getNode(index);
        node.pre.next = node.next;
        node.next.pre = node.pre;
        this.size--;
        return node.val;
    }

    public T get(int index) {
        if (index < 0 || index >= this.size) {
            throw new IndexOutOfBoundsException();
        }
        return this.getNode(index).val;
    }

    private DoublyNode<T> getNode(int index) {
        DoublyNode<T> next = this.head;
        for (int i = 0; i < index; i++) {
            next = next.next;
        }
        return next;
    }
}
