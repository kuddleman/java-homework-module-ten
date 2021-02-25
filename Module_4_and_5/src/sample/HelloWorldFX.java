package sample;

import javafx.application.*;
import javafx.scene.*;  //this does NOT import subpackages
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.*;
import javafx.scene.paint.*;  //paint is a subpackage of scene.  We need to import explicitly
import javafx.scene.text.*;
import javafx.stage.*;

public class HelloWorldFX extends Application {

    public void start(Stage primaryStage) {
        Pane pane = new FlowPane();
        Text helloText = new Text("Hello, World!");
        helloText.setFont(Font.font("Helvetica", 28));
        helloText.setFill(Color.rgb(129, 216, 208));
        pane.getChildren().add(helloText);

        Scene scene = new Scene(pane, 200, 200, Color.OLIVEDRAB);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Hello, World!");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
