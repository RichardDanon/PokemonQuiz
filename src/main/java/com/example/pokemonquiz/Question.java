package com.example.pokemonquiz;

import javafx.scene.image.Image;
import java.net.URL;

public class Question extends Quiz {
    Image image;
    String correctResponse;


    public Question(String imagePath, String correctResponse){
        //Image Pikachu = new Image("Images/Pikachu.jpg");

        //Adding my images
//        URL Absol = HelloApplication.class.getResource("Images/Absol.jpg");
        URL imageURL = HelloApplication.class.getResource("Images/Absol.jpg");

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
        this.image = new Image("Images/Absol.jpg");
        this.correctResponse = correctResponse;


    }

    
}
