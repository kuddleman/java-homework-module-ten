package sample;

import javafx.application.Application;
import javafx.geometry.*;
import javafx.scene.*;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.layout.*;

import javafx.scene.paint.*;
import javafx.scene.shape.*;
import javafx.scene.text.*;
import javafx.stage.*;

import javax.swing.text.html.ImageView;

public class LayoutPaneDemo extends Application {
    public void start(Stage primaryStage) {
        /* Flow Pane Layout */
        /*
        Button button1 = new Button("Button 1");
        Button button2 = new Button("Button 2");
        Button button3 = new Button("Button 3 - A Longer Butter");
        Button button4 = new Button("Button 4");
        Button button5 = new Button("Button 5- The Longest Button in the Bunch");
        FlowPane pane = new FlowPane(button1, button2, button3, button4, button5);
        flowPane.setStyle("-fx-background-color: beige");
        flowPane.setAlignment(Pos.CENTER);
        flowPane.setHgap(20);
        flowPane.setVgap(20);
         */

        /* Tile Pane layout */
        /*
        Button button1 = new Button("Button 1");
        Button button2 = new Button("Button 2");
        Button button3 = new Button("Button 3 - A Longer Butter");
        Button button4 = new Button("Button 4");
        Button button5 = new Button("Button 5- The Longest Button in the Bunch");
        TilePane pane = new TilePane(button1, button2, button3, button4, button5);
        tilePane.setStyle("-fx-background-color: beige");
        tilePane.setAlignment((Pos.CENTER));
        tilePane.setHgap(20);
        tilePane.setVgap(20);
         */

        /* StackPane layout */

        //ImageView imageView = new ImageView(new Image("dog.jpg"));
        /*
        Text text = new Text("Tessie!");
        Rectangle border = new Rectangle(120, 150, Color.TRANSPARENT);
        border.setStroke(Color.CYAN);
        border.setStrokeWidth(10);
        StackPane pane = new StackPane(  text, border);  //imageView would go here
        pane.setStyle("-fx-background-color: beige");
        */


        /* HBox and VBox layouts */
        Button button1 = new Button("Button 1");
        Button button2 = new Button("Button 2");
        Button button3 = new Button("Button 3 - A Longer Butter");
        Button button4 = new Button("Button 4");
        Button button5 = new Button("Button 5- The Longest Button in the Bunch");
        //HBox pane = new HBox(button1, button2, button3, button4, button5);
        VBox pane = new VBox(button1, button2, button3, button4, button5);
        pane.setPadding(new Insets( 50, 10, 50, 10));
        pane.setSpacing(10);
        pane.setStyle("-fx-background-color: beige");








        Scene scene = new Scene(pane, 300, 300, Color.TRANSPARENT);
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}
