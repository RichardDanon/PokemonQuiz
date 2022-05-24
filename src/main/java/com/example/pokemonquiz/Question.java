package com.example.pokemonquiz;

import javafx.scene.Group;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

import java.net.URL;

public class Question implements Displayable {
    Image image;
    String correctResponse;


    public Question(String imagePath, String correctResponse){

        //Adding my images
        URL imageURL = HelloApplication.class.getResource(imagePath);

        this.image = new Image(imageURL.toString());
        this.correctResponse = correctResponse;
    }

    public boolean isCorrect(String response){
        return response.equalsIgnoreCase(correctResponse);
    }

//    Converts the question into a displayable group
    @Override
    public Pane toPane() {
        Pane pane = new Pane();
        VBox root = new VBox();
        TextField textField = new TextField();
        textField.setId("userAnswer");


        ImageView viewImage = new ImageView(image);
        pane.getChildren().add(root);

        root.getChildren().add(viewImage);
        root.getChildren().add(textField);

        return pane;
    }
}
