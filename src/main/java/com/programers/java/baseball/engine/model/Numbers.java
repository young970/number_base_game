package com.programers.java.baseball.engine.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.function.BiConsumer;

@AllArgsConstructor
public class Numbers {
    private Integer[] nums;

    public void indexedForEach(BiConsumer<Integer, Integer> consumer){
        for(int i = 0; i < nums.length; i++) {
            consumer.accept(nums[i], i);
        }
    }
}