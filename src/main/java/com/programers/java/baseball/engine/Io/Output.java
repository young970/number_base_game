package com.programers.java.baseball.engine.Io;

import com.programers.java.baseball.engine.model.BallCount;

public interface Output {
    void ballCount(BallCount bc);

    void inputError();

    void correct();
}
