package com.ei.helloworld;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.util.Objects;

/**
 * @author yitiansong
 */
public class HelloApplication extends Application {
    @Override
    public void start(Stage stage)  {
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));

        Text scenetitle = new Text("Welcome");
        scenetitle.setId("welcome-text");
        grid.add(scenetitle, 0, 0, 2, 1);

        Text username = new Text("username");
        Text password = new Text("password");
        PasswordField passwordInputField = new PasswordField();
        TextField  usernameInputField = new TextField();

        grid.add(username, 0, 1);
        grid.add(usernameInputField, 1, 1);
        grid.add(password, 0, 2);
        grid.add(passwordInputField, 1, 2);

        Button btn = new Button("Sign in");
        btn.getStyleClass().add("button");
        HBox hbBtn = new HBox(10);
        hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
        hbBtn.getChildren().add(btn);

        grid.add(hbBtn, 1, 6);
        Scene scene = new Scene(grid, 300, 275);
        scene.getStylesheets().add(Objects.requireNonNull(HelloApplication.class.getResource("hello.css")).toExternalForm());
        stage.setScene(scene);
        stage.setTitle("Hello World!");
        stage.show();

    }

    public static void main(String[] args) {
        launch();
    }
}