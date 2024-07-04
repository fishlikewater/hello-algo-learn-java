package io.github.fishlikewater.hello.algo.hash;

import lombok.Data;

/**
 * {@code Pair}
 *
 * @author zhangxiang
 * @version 1.0.0
 * @since 2024/07/04
 */
@Data
public class Pair<T> {

    private String key;

    private T value;

    public Pair(String key, T value) {
        this.key = key;
        this.value = value;
    }
}
