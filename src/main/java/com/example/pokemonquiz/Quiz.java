package com.example.pokemonquiz;

import java.util.ArrayList;

public class Quiz {

    private ArrayList<Question> questions;
    private int highScore;
    private int numberOfQuestions;
    private int indexOfQuestion;

    public Quiz(int numberOfQuestions){
        this();
        this.numberOfQuestions = numberOfQuestions;
    }

    public Quiz(){
        this.questions = new ArrayList<>();
        this.highScore = 0;
        this.numberOfQuestions = 0;
        this.indexOfQuestion = 0;
    }

    public void addQuestion(Question question) {
        this.questions.add(question);
    }

    //Checking if the quiz has more questions
    public boolean hasNextQuestion(){
        return numberOfQuestions > indexOfQuestion;
    }

    public Question getNextQuestion(){
        Question nextQuestion = this.questions.get(indexOfQuestion);
        indexOfQuestion++;

        return nextQuestion;
    }

    public Question currentQuestion(){
        return questions.get(indexOfQuestion);
    }
}
