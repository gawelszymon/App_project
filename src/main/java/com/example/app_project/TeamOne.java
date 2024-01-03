package com.example.app_project;

import javafx.scene.control.Button;
import javafx.scene.layout.VBox;


public class TeamOne {

    public VBox teamOneContent() {
        VBox teamOneBox = new VBox();
        Button button1 = new Button("ABC");
        Button button2 = new Button("KLM");

        teamOneBox.getChildren().addAll(button1, button2);
        return teamOneBox;
    }

}