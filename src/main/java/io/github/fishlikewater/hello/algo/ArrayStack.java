package io.github.fishlikewater.hello.algo;

/**
 * {@code ArrayStack}
 * 基于数组的栈
 *
 * @author zhangxiang
 * @version 1.0.0
 * @since 2024/07/01
 */
public class ArrayStack<T> {

    private final ArrayList<T> list;

    public ArrayStack() {
        this.list = new ArrayList<>();
    }

    public void push(T t) {
        list.add(t);
    }

    public T pop() {
        return list.remove(list.size() - 1);
    }

    public T peek() {
        return list.get(list.size() - 1);
    }
}
