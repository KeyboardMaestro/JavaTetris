package com.keyboardmaestro.tetris;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.scene.control.Label;

import java.io.IOException;

public class Main extends Application {
    public Main(){
        System.out.println(Thread.currentThread().getName() + ": Main class is called");
    }
    @Override
    public void start(Stage stage) throws IOException {
        VBox root = new VBox();
        root.setPrefWidth(600);
        root.setPrefHeight(1100);
        root.setAlignment(Pos.CENTER);
        root.setSpacing(20);
        Label label = new Label();
        label.setFont(new Font(50));
        label.setText("Hello, Java FX!");

        Button button = new Button();
        button.setText("확인");
        button.setOnAction(event -> Platform.exit());

        root.getChildren().add(label);
        root.getChildren().add(button);

        Scene scene = new Scene(root);
        stage.setTitle("Tetris V 1.0");
        stage.setScene(scene);
        stage.show();
    }

    @Override
    public void stop() throws Exception {
        System.out.println(Thread.currentThread().getName() + ": stop is called");
    }

    @Override
    public void init() throws Exception {
        System.out.println(Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        launch(args);
    }
}