package com.example.pokemonquiz;

import java.util.ArrayList;
import java.util.Collections;

public class Quiz {
//Keeping track of the position of the user and the questions all through the quiz
    private ArrayList<Question> questions;
    private Score highScore;
    private int numberOfQuestions;
    private int indexOfQuestion;

    //Constructors
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

//Getting the next question in the array
    public Question getNextQuestion(){
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
//restarting the quiz and randomizing the next questions
    public void reset() {
        indexOfQuestion = 0;
        Collections.shuffle(questions);
    }
}
