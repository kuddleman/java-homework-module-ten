package sample;

import javafx.application.*;
import javafx.event.*;
import javafx.scene.*;  //this does NOT import subpackages
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.paint.*;  //paint is a subpackage of scene.  We need to import explicitly
import javafx.scene.text.*;
import javafx.stage.*;

public class HelloWorldFXButton extends Application {
    // declare controls here outside of start method
    private Button button;
    private Text helloText;

    public void start(Stage primaryStage) {
        Pane pane = new FlowPane();

        button = new Button("Click Here!");
        button.setOnAction(this::handleButton);
        pane.getChildren().add(button);

        helloText = new Text("Hello, World!");
        helloText.setFont(Font.font("Helvetica", 28));
        helloText.setFill(Color.rgb(129, 216, 208));
        pane.getChildren().add(helloText);



        Scene scene = new Scene(pane, 200, 200, Color.OLIVEDRAB);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Hello, World!");
        primaryStage.show();
    }

    private void handleButton(ActionEvent event) {
        helloText.setText("You clicked the button!");
        helloText.setFont(Font.font("Helvetica", 48));
        button.setDisable(true);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
