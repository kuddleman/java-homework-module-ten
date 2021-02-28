package sample;

import javafx.application.*;
import javafx.event.*;
import javafx.geometry.*;
import javafx.scene.*;  //this does NOT import subpackages
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.paint.*;  //paint is a subpackage of scene.  We need to import explicitly
import javafx.scene.text.*;
import javafx.stage.*;

public class IncDecButtons extends Application {

    private Text counterText;
    private Button incButton, decButton;


    public void start(Stage primaryStage) {
        VBox mainVBox = new VBox();
        mainVBox.setStyle("-fx-background-color: cyan");
        mainVBox.setAlignment(Pos.CENTER);

        counterText = new Text("0");
        counterText.setFont(Font.font("Helvetica", 28));
        counterText.setFill(Color.PLUM);
        mainVBox.getChildren().add(counterText);
        mainVBox.setSpacing(10);

        incButton = new Button(" + ");
        decButton = new Button(" - ");
        HBox buttonBox = new HBox(incButton, decButton);
        buttonBox.setAlignment(Pos.CENTER);
        buttonBox.setSpacing(10);
        mainVBox.getChildren().add(buttonBox);

        Scene scene = new Scene(mainVBox, 200, 200);
        primaryStage.setScene(scene);
        primaryStage.setTitle("IncDec Buttons");
        primaryStage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }

}
