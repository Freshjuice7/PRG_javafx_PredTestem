package com.example.lol;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("knihy.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 640, 480);
        scene.getStylesheets().add(getClass().getResource("stylyyy.css").toExternalForm());
        BorderPane root = new BorderPane();
        stage.setTitle("knihoPRD");
        stage.setScene(scene);
        stage.show();
    }
}
