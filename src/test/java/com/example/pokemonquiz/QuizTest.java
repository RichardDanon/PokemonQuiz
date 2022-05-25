package com.example.pokemonquiz;

import javafx.application.Platform;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

class QuizTest {
    Quiz quiz ;
    Question q1;
    Question q2;

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
    void init_setUpQuiz(){
        q1 = new Question("Images/Absol.jpg", "Absol");
        q2 = new Question("Images/Charizard.jpg", "Charizard");

        quiz = new Quiz(2);

        quiz.addQuestion(q1);
        quiz.addQuestion(q2);
    }

    //Borrowed to make the test work
    //https://stackoverflow.com/questions/11385604/how-do-you-unit-test-a-javafx-controller-with-junit
    @AfterAll
    public static void tearDownJavaFXRuntime() throws InterruptedException {
        Platform.exit();
    }

    @Test
    void getNextQuestion_ReturnsQuestionsInCorrectOrder() {

        assertEquals(q2,quiz.getNextQuestion());
    }

    @Test
    void currentTest_ReturnsFirstQuestion(){
        assertEquals(q1,quiz.currentQuestion());
    }

    @Test
    void FinalScore_keepsTheOriginalHighScoreWhenItIsNotHighEnough(){
        Score score = new Score();
        quiz.setFinalScore(score);

        assertNotEquals(score,quiz.getHighScore());
    }

}