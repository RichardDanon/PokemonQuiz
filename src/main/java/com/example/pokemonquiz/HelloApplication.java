package com.example.pokemonquiz;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import java.io.IOException;
import org.kordamp.bootstrapfx.BootstrapFX;
import org.kordamp.bootstrapfx.scene.layout.Panel;

public class HelloApplication extends Application {
    private final String[] pokemon = {"Absol","Charizard","Dialga","Eevee","Flygon"
            ,"Groudon","Lapras","Lucario","Marill","Mew","Pikachu","Snorlax","Spewpa","Swinub","Umbreon"};

    private boolean restart = true;

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

        primaryStage.setTitle("PokeQuiz");

        VBox root = new VBox();
        root.setAlignment(Pos.TOP_CENTER);

        Panel welcomePanel = new Panel("Welcome to the PokeQuiz");
        welcomePanel.getStyleClass().add("panel-primary");
        Pane contentPane = new VBox(welcomePanel);

        Scene scene = new Scene(root);
        scene.getStylesheets().add(BootstrapFX.bootstrapFXStylesheet());
        primaryStage.setScene(scene);

        //Button
        Button b = new Button("Start");
        b.getStyleClass().setAll("btn", "btn-lg", "btn-primary");
        b.setPadding(new Insets(50));
        b.setOnAction(actionEvent -> {
            if (restart){
                quiz.reset();
                score.reset();

                contentPane.getChildren().setAll(quiz.currentQuestion().toPane());
                restart = false;

                b.setText("Next");
                return;
            }
            TextField answer = (TextField) scene.lookup("#userAnswer");
            if (quiz.currentQuestion().isCorrect(answer.getText())){
                //increment score
                score.recordCorrectAnswer();
            }
            if (quiz.hasNextQuestion()) {
                contentPane.getChildren().setAll(quiz.getNextQuestion().toPane());

                if(!quiz.hasNextQuestion()){
                    b.setText("Submit");
                }
            }
            else {
                //show the score
                quiz.setFinalScore(score);
                contentPane.getChildren().setAll(score.toPane(),
                        quiz.getHighScore().toPane());

                b.setText("Restart!");

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