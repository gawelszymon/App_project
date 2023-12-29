package com.example.app_project;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MainAppNBA extends Application {

    @Override
    public void start(Stage primaryStage) {
        TeamSelection teamSelection = new TeamSelection();

        primaryStage.setTitle("NBA Team Selection");
        primaryStage.setScene(new Scene(teamSelection.getLayout(), 300, 200));
        primaryStage.show();        //linie te opowiadają za ustawienie i wyświetlenie okna mojej aplikacji
                                    //natomiast cała logika przypisana do tego okna znajduje sie w innych klasach
    }

    public static void main(String[] args) {
        launch(args);
    }
}
