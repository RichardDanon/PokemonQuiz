package com.example.pokemonquiz;

import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.control.Label;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import org.kordamp.bootstrapfx.scene.layout.Panel;

public class Score implements Displayable{
    private int numScore;
    private String title;


    public Score(){
        this.numScore = 0;
        this.title = "Score";
    }

    public Score(String title){
        this();
        this.title = title;
    }

    public Score(Score s1) {
        this.numScore = s1.numScore;
        this.title = s1.title;
    }

    public void recordCorrectAnswer(){
        numScore++;
    }

    public boolean isHigher(Score otherScore){
        return this.numScore > otherScore.numScore;
    }

    public void reset() {
        this.numScore = 0;
    }
    public void setTitle(String title){
        this.title = title;
    }

    @Override
    public Pane toPane() {
        Panel score = new Panel(this.title);
        BorderPane contentPane = new BorderPane();
        Label label = new Label(String.valueOf(numScore));

        score.setBody(contentPane);
        contentPane.setCenter(label);

        score.getStyleClass().add("panel-success");


        StackPane pane = new StackPane();
        pane.getChildren().add(score);

        pane.setStyle("-fx-padding: 25");


        return pane;
    }


}
