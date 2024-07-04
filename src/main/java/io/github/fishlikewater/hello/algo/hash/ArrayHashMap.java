package io.github.fishlikewater.hello.algo.hash;

import io.github.fishlikewater.hello.algo.list.ArrayList;

/**
 * {@code ArrayHashMap}
 * 数组实现哈希表
 *
 * @author zhangxiang
 * @version 1.0.0
 * @since 2024/07/04
 */
public class ArrayHashMap<T> {

    private ArrayList<ArrayList<Pair<T>>> arrayList;

    private int size;

    private int capacity = 10;

    private double loadFactor = 0.75;

    private int extendRatio = 2;

    public ArrayHashMap() {
        arrayList = new ArrayList<>(capacity);
        for (int i = 0; i < capacity; i++) {
            arrayList.add(new ArrayList<>());
        }
    }

    public ArrayHashMap(int capacity, double loadFactor, int extendRatio) {
        this.capacity = capacity;
        this.loadFactor = loadFactor;
        this.extendRatio = extendRatio;
    }

    public T get(String key) {
        int index = this.hashFunc(key);
        ArrayList<Pair<T>> pairArrayList = this.arrayList.get(index);
        for (Pair<T> pair : pairArrayList) {
            if (pair.getKey().equals(key)) {
                return pair.getValue();
            }
        }
        return null;
    }

    public void put(String key, T t) {
        this.checkLoadFactor();
        int index = this.hashFunc(key);
        ArrayList<Pair<T>> pairArrayList = arrayList.get(index);
        for (Pair<T> pair : pairArrayList) {
            if (!pair.getKey().equals(key)) {
                continue;
            }
            pair.setValue(t);
            return;
        }
        pairArrayList.add(new Pair<>(key, t));
        this.size++;
    }

    public void remove(String key) {
        int index = this.hashFunc(key);
        ArrayList<Pair<T>> pairArrayList = this.arrayList.get(index);
        for (Pair<T> pair : pairArrayList) {
            if (pair.getKey().equals(key)) {
                pairArrayList.remove(pair);
                this.size--;
                return;
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (ArrayList<Pair<T>> list : this.arrayList) {
            for (Pair<T> pair : list) {
                builder.append(pair.getKey())
                        .append("->")
                        .append(pair.getValue())
                        .append("\n");
            }
        }
        return builder.toString();
    }

    private void checkLoadFactor() {
        if ((double) this.size / this.capacity > this.loadFactor) {
            this.extend();
        }
    }

    private void extend() {
        ArrayList<ArrayList<Pair<T>>> oldArr = this.arrayList;
        this.capacity = this.capacity * this.extendRatio;
        this.arrayList = new ArrayList<>(this.capacity);
        for (int i = 0; i < this.capacity; i++) {
            this.arrayList.add(new ArrayList<Pair<T>>());
        }

        for (ArrayList<Pair<T>> pairArrayList : oldArr) {
            for (Pair<T> pair : pairArrayList) {
                put(pair.getKey(), pair.getValue());
            }
        }

    }

    public int hashFunc(String key) {
        int i = key.hashCode();
        i %= this.capacity;
        return i;
    }

}
