package com.example.app_project;

import javafx.scene.control.Button;
import javafx.scene.layout.VBox;

public class TeamSelection {

    private VBox layout;

    public TeamSelection() {
        layout = new VBox(10); //linjka ta oznacza że kolejne elementy będą wyświetlone pod sobą z ostępem 10px
                                  //tworzymy po prostu warstę na którą mozemy nakładać nasze elementy
                                  //kontenery takie jak VBox są używane do grupowania i układania elemntów interfejsu

        Button team1Button = new Button("Team 1");
        Button team2Button = new Button("Team 2");

        team1Button.setOnAction(event -> {
            TeamOne teamOne = new TeamOne();
            teamOne.displayMessage();
        });

        /*
             team1Button.setOnAction(event -> {
             });

             używa wyrażenia lambda czyli " () -> { } "
             wyrażenie lambda jest to krótki sposób zapisu funkcji anonimowej

             setOnActive jest to funkcja klasy Button w JavaFX, która służy do
             ustawienia obsługi zdarzeń dla danego przycisku
        */

        team2Button.setOnAction(event -> {
            TeamTwo teamTwo = new TeamTwo();
            teamTwo.displayMessage();
        });

        layout.getChildren().addAll(team1Button, team2Button);
        /*
            tutaj następuje dodanie dwóch przycisków do kontenera VBox o nazwie layout
            getChildren() metoda kontenerów, która zwraca listę dzieci danego kontenera
            addAll() za pomocą tej metody dodajemy elementy do listy dzieci dnaego kontenera
            dzieci to te elementy które zostały dodane do naszego kontenera.
            W wyniku tego fragmentu kodu przyciski staną się częścią układu layout naszego kontera
        */
    }

    public VBox getLayout() {
        return layout;
    }
}

