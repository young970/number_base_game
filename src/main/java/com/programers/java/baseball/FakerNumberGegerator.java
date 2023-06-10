package com.programers.java.baseball;

import com.github.javafaker.Faker;
import com.programers.java.baseball.engine.Io.NumberGenerator;
import com.programers.java.baseball.engine.model.Numbers;

import java.util.stream.Stream;

public class FakerNumberGegerator implements NumberGenerator {
    private final Faker faker = new Faker();

    @Override
    public Numbers generate(int count) {
        Faker faker = new Faker();
        return new Numbers(
            Stream.generate(() -> faker.number().randomDigitNotZero())
                    .distinct()
                    .limit(count)
                    .toArray(Integer[]::new)
        );
    }
}
