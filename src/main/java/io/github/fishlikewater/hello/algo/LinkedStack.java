package io.github.fishlikewater.hello.algo;

/**
 * {@code LinkedStack}
 * 基于链表的栈
 *
 * @author zhangxiang
 * @version 1.0.0
 * @since 2024/07/01
 */
public class LinkedStack<T> {

    private final LinkedList<T> linkList;

    public LinkedStack() {
        linkList = new LinkedList<>();
    }

    public void push(T t) {
        linkList.insert(t);
    }

    public T pop() {
        return linkList.delete(this.linkList.size() - 1);
    }

    public T peek() {
        return linkList.get(this.linkList.size() - 1);
    }
}
