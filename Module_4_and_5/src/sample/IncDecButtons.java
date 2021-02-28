package sample;

import javafx.application.*;
import javafx.event.*;
import javafx.scene.*;  //this does NOT import subpackages
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.paint.*;  //paint is a subpackage of scene.  We need to import explicitly
import javafx.scene.text.*;
import javafx.stage.*;

public class IncDecButtons extends Application {


    public void start(Stage primaryStage) {
        VBox mainVBox = new VBox();

        Scene scene = new Scene(mainVBox, 200, 200);
        primaryStage.setScene(scene);
        primaryStage.setTitle("IncDec Buttons");
        primaryStage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }

}
