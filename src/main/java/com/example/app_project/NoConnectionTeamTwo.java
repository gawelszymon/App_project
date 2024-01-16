package com.example.app_project;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class NoConnectionTeamTwo extends MainAppNBA {

    public StackPane NoConnectionTeamTwoContent() {
        StackPane stackPane = new StackPane();

        HBox noConnectionBox = new HBox();

        Label noConnectionInfo = new Label("Brak połączenia z internetem");
        noConnectionInfo.getStyleClass().add("noConInfo-label");

        Label tryAgainInfo = new Label("Spróbuj ponownie");
        tryAgainInfo.getStyleClass().add("tryAgainInfo-label");

        Button reloadButton = new Button("");
        reloadButton.getStyleClass().add("reloadButton-style");

        // margines: top, right, bottom, left
        HBox.setMargin(noConnectionInfo, new Insets(250, 0, 0, 550));
        HBox.setMargin(tryAgainInfo, new Insets(325, 0, 0, -390));
        HBox.setMargin(reloadButton, new Insets(400, 0, 0, -170));

        // Dodaj przyciski i tabelę do kontenera VBox
        noConnectionBox.getChildren().addAll(noConnectionInfo, tryAgainInfo, reloadButton);

        reloadButton.setOnAction(event -> {
            if (isInternetAvailableTeamTwoContent()) {
                app_logger.info("Internet connection is available");

                TeamTwo teamTwo = new TeamTwo();
                stackPane.getChildren().clear();
                stackPane.getChildren().add(teamTwo.teamTwoContent());
            } else {
                app_logger.info("Error! Internet connection in unavailable");
                NoConnectionTeamTwo noConnetion = new NoConnectionTeamTwo();
                stackPane.getChildren().clear();
                stackPane.getChildren().add(noConnetion.NoConnectionTeamTwoContent());
            }
        });

        // Dodaj VBox do StackPane
        stackPane.getChildren().add(noConnectionBox);

        return stackPane;
    }

    public static boolean isInternetAvailableTeamTwoContent() {
        try {
            InetAddress address = InetAddress.getByName("www.youtube.com");
            return !address.equals("");
        } catch (UnknownHostException e) {
            return false;
        }
    }
}




