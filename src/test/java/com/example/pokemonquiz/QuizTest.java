package com.example.pokemonquiz;

import javafx.application.Platform;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

class QuizTest {

    //Borrowed to make the test work
    @BeforeAll
    public static void setUpJavaFXRuntime() throws InterruptedException {
        CountDownLatch latch = new CountDownLatch(1);
        Platform.startup(() -> {
            latch.countDown();
        });
        latch.await(5, TimeUnit.SECONDS);
    }

    @AfterAll
    public static void tearDownJavaFXRuntime() throws InterruptedException {
        Platform.exit();
    }

    @Test
    void getNextQuestion_ReturnsQuestionsInCorrectOrder() {
        Question q1 = new Question("Images/Absol.jpg", "Absol");
        Question q2 = new Question("Images/Charizard.jpg", "Charizard");

        Quiz quiz = new Quiz(2);

        quiz.addQuestion(q1);
        quiz.addQuestion(q2);

        assertEquals(q2,quiz.getNextQuestion());
    }

}