package com.ei.helloworld;

import javafx.fxml.FXML;
import javafx.scene.text.Text;

/**
 * @author yitiansong
 */
public class HelloController {

    @FXML protected Text welcomeText;
    @FXML private Text actionTarget;


    @FXML protected void handleSignIn(){
        actionTarget.setText("Sign in button pressed");
    }
}