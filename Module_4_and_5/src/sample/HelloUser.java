package sample;

import javafx.application.*;
import javafx.event.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.paint.*;
import javafx.scene.text.*;
import javafx.stage.*;

public class HelloUser extends Application {
    public void start(Stage primaryStage) {
        Pane pane = new FlowPane();

        Scene scene = new Scene(pane, 300, 300, Color.SKYBLUE);

        primaryStage.setTitle("Hello, User!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
