package com.example.app_project;

import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class TeamSelection extends MainAppNBA{

    private AnchorPane layout;    //zmienna klasy layout, która jest private, czyli modifikator dostępu,
                            //oznacza to że zmienna ta jest dostępna tylko w obrębie tej klasy


   /* MainAppNBA objectMainAppNBA = new MainAppNBA();
    Scene getMyScene = objectMainAppNBA.getScene();
   */

    public TeamSelection() {


       layout = new AnchorPane();
        //layout.getStyleClass().add("layout");

        Button team1Button = new Button("");
        Button team2Button = new Button("");

        //double sceneWidth = getMyScene.widthProperty().doubleValue();

        //System.out.println(getMyScene);

        AnchorPane.setTopAnchor(team1Button, 0.0);
        AnchorPane.setBottomAnchor(team1Button, 0.0);
        AnchorPane.setLeftAnchor(team1Button, 0.0);
        AnchorPane.setRightAnchor(team1Button, 1600 * 0.5);

        AnchorPane.setTopAnchor(team2Button, 0.0);
        AnchorPane.setBottomAnchor(team2Button, 0.0);
        AnchorPane.setLeftAnchor(team2Button, 1600 * 0.5);
        AnchorPane.setRightAnchor(team2Button, 0.0);

        team1Button.getStyleClass().add("team1-button");
        team2Button.getStyleClass().add("team2-button");


    /* W TAKI SPSÓB OTWORZY SIĘ NOWE OKNO
        team1Button.setOnAction(event -> {
            TeamOne teamOne = new TeamOne();

            Stage newStage = new Stage();
            Scene teamOneScene = new Scene(teamOne.getLayout(), 1600, 800);
            newStage.setScene(teamOneScene);
            newStage.show();
        });
    */
        /*
             team1Button.setOnAction(event -> {
             });

             używa wyrażenia lambda czyli " () -> { } "
             wyrażenie lambda jest to krótki sposób zapisu funkcji anonimowej

             setOnActive jest to funkcja klasy Button w JavaFX, która służy do
             ustawienia obsługi zdarzeń dla danego przycisku
        */

        team1Button.setOnAction(event -> {
            if (isInternetAvailableTeamOne()) {
                app_logger.info("connection succeeded");

                TeamOne teamOne = new TeamOne();
                layout.getChildren().clear();
                layout.getChildren().add(teamOne.teamOneContent());
            } else {
                app_logger.info("connection failed");
                NoConnectionTeamOne noConnetion = new NoConnectionTeamOne();
                layout.getChildren().clear();
                layout.getChildren().add(noConnetion.NoConnectionTeamOneContent());
            }
        });

        team2Button.setOnAction(event -> {
            if (isInternetAvailableTeamTwo()) {
                app_logger.info("connection succeeded");;

                TeamTwo teamTwo = new TeamTwo();
                layout.getChildren().clear();
                layout.getChildren().add(teamTwo.teamTwoContent());
            } else {
                app_logger.info("connection failed");
                NoConnectionTeamTwo noConnetion = new NoConnectionTeamTwo();
                layout.getChildren().clear();
                layout.getChildren().add(noConnetion.NoConnectionTeamTwoContent());
            }
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

    public AnchorPane getLayout() {
        return layout;
    }

    public static boolean isInternetAvailableTeamOne() {
        try {
            InetAddress address = InetAddress.getByName("www.google.com");
            return !address.equals("");
        } catch (UnknownHostException e) {
            return false;
        }
    }

    public static boolean isInternetAvailableTeamTwo() {
        try {
            InetAddress address = InetAddress.getByName("www.youtube.com");
            return !address.equals("");
        } catch (UnknownHostException e) {
            return false;
        }
    }
}

