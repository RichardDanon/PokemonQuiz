package com.example.pokemonquiz;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage primaryStage) throws IOException {



        primaryStage.setTitle("Hello!");

        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}