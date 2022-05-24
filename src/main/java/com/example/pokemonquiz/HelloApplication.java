package com.example.pokemonquiz;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import java.io.IOException;

import org.kordamp.bootstrapfx.BootstrapFX;

public class HelloApplication extends Application {
    private final String[] pokemon = {"Absol","Charizard","Dialga","Eevee","Flygon"
            ,"Groudon","Lapras","Lucario","Marill","Mew","Pikachu","Snorlax","Spewpa","Swinub","Umbreon"};

    private boolean restart = false;

    @Override
    public void start(Stage primaryStage) throws IOException {

        primaryStage.setMinHeight(800);
        primaryStage.setMinWidth(500);
        primaryStage.setMaxHeight(800);
        primaryStage.setMaxWidth(500);
        primaryStage.setResizable(false);


        Quiz quiz = new Quiz(5);
        Score score = new Score();

        //building the quiz based on the pokemon name
        for(String pokemon : this.pokemon){
            quiz.addQuestion(new Question("Images/%s.jpg".formatted(pokemon), pokemon));
        }

        primaryStage.setTitle("Hello!");

        VBox root = new VBox();

        Pane contentPane = new FlowPane(quiz.currentQuestion().toPane());

        Scene scene = new Scene(root);
        scene.getStylesheets().add(BootstrapFX.bootstrapFXStylesheet());
        primaryStage.setScene(scene);

        //Button
        Button b = new Button();
        b.setMinWidth(60);
        b.setMinHeight(40);
        b.setOnAction(actionEvent -> {
            if (restart){
                quiz.reset();
                score.reset();

                contentPane.getChildren().setAll(quiz.currentQuestion().toPane());
                restart = false;

                return;
            }
            TextField answer = (TextField) scene.lookup("#userAnswer");
            if (quiz.currentQuestion().isCorrect(answer.getText())){
                //increment score
                score.recordCorrectAnswer();
            }
            if (quiz.hasNextQuestion()) {
                contentPane.getChildren().setAll(quiz.getNextQuestion().toPane());
            }
            else {
                //show the score
                quiz.setFinalScore(score);
                contentPane.getChildren().setAll(score.toPane(),
                        quiz.getHighScore().toPane());

                restart = true;
            }
        });

        root.getChildren().add(contentPane);
        root.getChildren().add(b);

        primaryStage.show();


    }

    public static void main(String[] args) {
        launch();
    }
}