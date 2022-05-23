package com.example.pokemonquiz;

import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;

import java.net.URL;

public class Question implements Displayable {
    Image image;
    String correctResponse;


    public Question(String imagePath, String correctResponse){
        //Image Pikachu = new Image("Images/Pikachu.jpg");

        //Adding my images
//        URL Absol = HelloApplication.class.getResource("Images/Absol.jpg");
            URL imageURL = HelloApplication.class.getResource(imagePath);

//        URL Charizard = HelloApplication.class.getResource("Images/Charizard.jpg");
//        URL Dialga = HelloApplication.class.getResource("Images/Dialga.jpg");
//        URL Eevee = HelloApplication.class.getResource("Images/Eevee.jpg");
//        URL Flygon = HelloApplication.class.getResource("Images/Flygon.jpg");
//        URL Groudon = HelloApplication.class.getResource("Images/Groudon.jpg");
//        URL Lapras = HelloApplication.class.getResource("Images/Lapras.jpg");
//        URL Lucario = HelloApplication.class.getResource("Images/Lucario.jpg");
//        URL Marill = HelloApplication.class.getResource("Images/Marill.jpg");
//        URL Mew = HelloApplication.class.getResource("Images/Mew.jpg");
//        URL Pikachu = HelloApplication.class.getResource("Images/Pikachu.jpg");
//        URL Snorlax = HelloApplication.class.getResource("Images/Snorlax.jpg");
//        URL Spewpa = HelloApplication.class.getResource("Images/Spewpa.jpg");
//        URL Swinub = HelloApplication.class.getResource("Images/Swinub.jpg");
//        URL Umbreon = HelloApplication.class.getResource("Images/Umbreon.jpg");
        this.image = new Image(imageURL.toString());
        this.correctResponse = correctResponse;
    }

//    Converts the question into a displayable group
    @Override
    public Group toGroup() {
        Group group = new Group();


        ImageView viewImage = new ImageView(image);
        group.getChildren().add(viewImage);


        return group;
    }
}
