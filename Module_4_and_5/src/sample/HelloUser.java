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
        pane.setStyle("-fx-background-color: null;");

        messageText = new Text("Hello World");
        messageText.setFont(Font.font(18));
        messageText.setFill(Color.DARKRED);
        pane.getChildren().add(messageText);

        nameInputField = new TextField();
        nameInputField.setOnAction(this::processTextField);
        pane.getChildren().add(nameInputField);

        Scene scene = new Scene(pane, 300, 300, Color.SKYBLUE);

        primaryStage.setTitle("Hello, User!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void processTextField(ActionEvent event) {
        String userInputText = nameInputField.getText();
        messageText.setText("Hello, " + userInputText + "!");
        nameInputField.clear();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
