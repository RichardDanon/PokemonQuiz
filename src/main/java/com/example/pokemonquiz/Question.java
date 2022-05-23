package com.example.pokemonquiz;

import javafx.geometry.VPos;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

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
    public Group toGroup() {
        Group group = new Group();
        VBox root = new VBox();
        TextField textField = new TextField();
        textField.setId("userAnswer");


        ImageView viewImage = new ImageView(image);
        group.getChildren().add(root);

        root.getChildren().add(viewImage);
        root.getChildren().add(textField);

        return group;
    }
}
