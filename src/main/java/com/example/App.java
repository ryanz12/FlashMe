package com.example;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage primaryStage){
        try{
            primaryStage.setScene(scene);
            primaryStage.setResizable(false);
            primaryStage.setTitle("Chicken Paints");
            primaryStage.show();
        }
        catch (Exception e){
            // In case fxml files can't load
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
