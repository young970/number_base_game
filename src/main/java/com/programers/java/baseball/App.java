package com.programers.java.baseball;

import com.programers.java.baseball.engine.BaseBall;
import com.programers.java.baseball.engine.Io.Input;
import com.programers.java.baseball.engine.Io.NumberGenerator;
import com.programers.java.baseball.engine.Io.Output;

public class App {
    public static void main(String[] args) {
        NumberGenerator generator = new FakerNumberGegerator();
        Console console = new Console();

        new BaseBall(generator, console, console).run();
    }
}
