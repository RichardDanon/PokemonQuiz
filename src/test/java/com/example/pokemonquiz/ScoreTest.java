package com.example.pokemonquiz;

import javafx.application.Platform;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

class ScoreTest {
    Score score;
    Score highScore;

    //Borrowed to make the test work
    //https://stackoverflow.com/questions/11385604/how-do-you-unit-test-a-javafx-controller-with-junit
    @BeforeAll
    public static void setUpJavaFXRuntime() throws InterruptedException {
        CountDownLatch latch = new CountDownLatch(1);
        Platform.startup(() -> {
            latch.countDown();
        });
        latch.await(5, TimeUnit.SECONDS);
    }

    @BeforeEach
    void init_setUpScores(){
        score = new Score();
        highScore = new Score("High Score");
    }

    //Borrowed to make the test work
    //https://stackoverflow.com/questions/11385604/how-do-you-unit-test-a-javafx-controller-with-junit
    @AfterAll
    public static void tearDownJavaFXRuntime() throws InterruptedException {
        Platform.exit();
    }

    @Test
    void isHigher_CheckingIfTheHighScoreIsHigherThenTheScore() {
        highScore.recordCorrectAnswer();
        assertTrue(highScore.isHigher(score));
    }

    @Test
    void reset_MakingSureTheValueHasBeenReset() {
        score.recordCorrectAnswer();
        score.reset();
        assertFalse(score.isHigher(highScore));
    }
}