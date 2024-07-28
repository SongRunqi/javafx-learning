package com.ei.helloworld;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * @author yitiansong
 */
public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        // 创建button
        Button btn = new Button();
        btn.setText("Say 'Hello World'");
        btn.setOnAction(e -> System.out.println("Hello World!"));
        // 创建StackPane布局
        StackPane root = new StackPane();
        root.getChildren().add(btn);
        // 创建Scene并展示
        Scene scene = new Scene(root, 640, 480);
        stage.setTitle("Hello World!");
        stage.setScene(scene);
        stage.show();

    }

    public static void main(String[] args) {
        launch();
    }
}