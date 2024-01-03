package com.example.app_project;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MainAppNBA extends Application {

    private Scene scene;


    @Override
    public void start(Stage primaryStage) {
        TeamSelection teamSelection = new TeamSelection();

        primaryStage.setTitle("NBA Team Selection");
        scene = new Scene(teamSelection.getLayout(), 1600, 800);
        primaryStage.setScene(scene);
        primaryStage.show();        //linie te opowiadają za ustawienie i wyświetlenie okna mojej aplikacji
                                    //natomiast cała logika przypisana do tego okna znajduje sie w innych klasach
        primaryStage.setResizable(false);

        scene.getStylesheets().add(getClass().getResource("/styles.css").toExternalForm());


    }

    public Scene getScene() {
        return scene;
    }

    public static void main(String[] args) {
        launch(args);
    }
}

