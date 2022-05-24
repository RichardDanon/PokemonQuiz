package com.example.pokemonquiz;

import javafx.scene.Group;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import org.kordamp.bootstrapfx.scene.layout.Panel;

public class Score implements Displayable{
    private int numScore;


    public Score(){
        this.numScore = 0;
    }

    public void recordCorrectAnswer(){
        numScore++;
    }

    public boolean isHigher(Score otherScore){
        return this.numScore > otherScore.numScore;
    }

    public int scoreToInt(){
        return this.numScore;
    }

    @Override
    public Group toGroup() {
        Panel score = new Panel("Score");
        BorderPane pane = new BorderPane();
        Label label = new Label(String.valueOf(numScore));
        score.setBody(pane);


        score.getStyleClass().add("panel-success");


        Group group = new Group();
        group.getChildren().add(score);


        pane.setCenter(label);




        return group;
    }
}
