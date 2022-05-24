package com.example.pokemonquiz;

import java.util.ArrayList;
import java.util.Collections;

public class Quiz {

    private ArrayList<Question> questions;
    private Score highScore;
    private int numberOfQuestions;
    private int indexOfQuestion;

    public Quiz(int numberOfQuestions){
        this();
        this.numberOfQuestions = numberOfQuestions;
    }

    public Quiz(){
        this.questions = new ArrayList<>();
        this.highScore = new Score("High Score");
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
        //write test later
        indexOfQuestion++;
        Question nextQuestion = this.questions.get(indexOfQuestion);

        return nextQuestion;
    }

    public Question currentQuestion(){
        return questions.get(indexOfQuestion);
    }

    public void setFinalScore(Score high){

        if (high.isHigher(highScore)){
            this.highScore = new Score(high);
            this.highScore.setTitle("High Score");
        }
    }

    public Score getHighScore() {
        return this.highScore;
    }

    public void reset() {
        indexOfQuestion = 0;
        Collections.shuffle(questions);
    }
}
