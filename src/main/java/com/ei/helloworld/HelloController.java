package com.ei.helloworld;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

/**
 * @author yitiansong
 */
public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}