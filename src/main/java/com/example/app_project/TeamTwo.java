package com.example.app_project;

import javafx.scene.control.Button;
import javafx.scene.layout.VBox;

public class TeamTwo {

    public VBox teamTwoContent() {
        VBox teamTwoBox = new VBox();
        Button button1 = new Button("HIJ");
        Button button2 = new Button("PRS");

        teamTwoBox.getChildren().addAll(button1, button2);
        return teamTwoBox;
    }

}