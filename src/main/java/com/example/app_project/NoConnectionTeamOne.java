package com.example.app_project;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class NoConnectionTeamOne extends MainAppNBA {

    public StackPane NoConnectionTeamOneContent() {
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
            if (isInternetAvailableTeamOneContent()) {
                app_logger.info("Internet connection is available");

                TeamOne teamOne = new TeamOne();
                stackPane.getChildren().clear();
                stackPane.getChildren().add(teamOne.teamOneContent());
            } else {
                app_logger.info("Error! Internet connection in unavailable");
                NoConnectionTeamOne noConnetion = new NoConnectionTeamOne();
                stackPane.getChildren().clear();
                stackPane.getChildren().add(noConnetion.NoConnectionTeamOneContent());
            }
        });

        // Dodaj VBox do StackPane
        stackPane.getChildren().add(noConnectionBox);

        return stackPane;
    }

    public static boolean isInternetAvailableTeamOneContent() {
        try {
            InetAddress address = InetAddress.getByName("www.google.com");
            return !address.equals("");
        } catch (UnknownHostException e) {
            return false;
        }
    }
}
