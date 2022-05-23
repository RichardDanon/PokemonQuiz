package com.example.pokemonquiz;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage primaryStage) throws IOException {

        primaryStage.setMinHeight(800);
        primaryStage.setMinWidth(500);
        primaryStage.setMaxHeight(800);
        primaryStage.setMaxWidth(500);
        primaryStage.setResizable(false);


        Quiz quiz = new Quiz();
        quiz.addQuestion(new Question("Images/Absol.jpg", "Absol"));
        quiz.addQuestion(new Question("Images/Charizard.jpg", "Charizard"));

        primaryStage.setTitle("Hello!");
        Question question = new Question("Images/Charizard.jpg", "Charizard");

        Scene scene = new Scene(question.toGroup());
        primaryStage.setScene(scene);


        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}