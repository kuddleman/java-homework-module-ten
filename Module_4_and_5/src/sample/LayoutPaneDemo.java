package sample;

import javafx.application.Application;
import javafx.geometry.*;
import javafx.scene.*;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.paint.*;
import javafx.stage.*;

public class LayoutPaneDemo extends Application {
    public void start(Stage primaryStage) {

        Button button1 = new Button("Button 1");
        Button button2 = new Button("Button 2");
        Button button3 = new Button("Button 3 - A Longer Butter");
        Button button4 = new Button("Button 4");
        Button button5 = new Button("Button 5");
        FlowPane flowPane = new FlowPane(button1, button2, button3, button4, button5);
        flowPane.setStyle("-fx-background-color: beige");
        flowPane.setAlignment(Pos.CENTER);
        flowPane.setHgap(20);
        flowPane.setVgap(20);


        Scene scene = new Scene(flowPane, 300, 300, Color.TRANSPARENT);
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}
