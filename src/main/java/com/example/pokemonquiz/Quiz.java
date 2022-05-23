package com.example.pokemonquiz;

import java.util.ArrayList;

public class Quiz {

    private ArrayList<Question> questions;
    private int highScore;
    private int numberOfQuestions;

    public Quiz(int numberOfQuestions){
        this();
        this.numberOfQuestions = numberOfQuestions;

    }

    public Quiz(){
        this.questions = new ArrayList<>();
        this.highScore = 0;
        this.numberOfQuestions = 0;
    }

    public void addQuestion(Question question) {
        this.questions.add(question);
    }
}
