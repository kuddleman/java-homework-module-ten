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
    private Text messageText;
    private TextField nameInputField;

    public void start(Stage primaryStage) {
        Pane pane = new FlowPane();

        messageText = new Text("Hello World");
        messageText.setFont(Font.font(18));
        messageText.setFill(Color.PLUM);
        pane.getChildren().add(messageText);

        Scene scene = new Scene(pane, 300, 300, Color.SKYBLUE);

        primaryStage.setTitle("Hello, User!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
