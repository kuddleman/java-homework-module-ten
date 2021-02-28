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
    private int counter;
    private TextField intervalField;
    private Text intervalFieldLabel;


    public void start(Stage primaryStage) {
        counter = 0;


        VBox mainVBox = new VBox();
        mainVBox.setStyle("-fx-background-color: cyan");
        mainVBox.setAlignment(Pos.CENTER);

        counterText = new Text("0");
        counterText.setFont(Font.font("Helvetica", 28));
        counterText.setFill(Color.PLUM);
        mainVBox.getChildren().add(counterText);
        mainVBox.setSpacing(10);

        incButton = new Button(" + ");
        incButton.setOnAction(this::handleButtons);

        decButton = new Button(" - ");
        decButton.setOnAction(this::handleButtons);

        HBox buttonBox = new HBox(incButton, decButton);
        buttonBox.setAlignment(Pos.CENTER);
        buttonBox.setSpacing(10);
        mainVBox.getChildren().add(buttonBox);

        intervalFieldLabel = new Text("Interval: ");
        intervalField = new TextField("1");

        HBox intervalBox = new HBox(intervalFieldLabel, intervalField);
        intervalBox.setAlignment(Pos.CENTER);
        intervalBox.setSpacing(10);
        mainVBox.getChildren().add(intervalBox);




        Scene scene = new Scene(mainVBox, 200, 200);
        primaryStage.setScene(scene);
        primaryStage.setTitle("IncDec Buttons");
        primaryStage.show();

    }

    private void handleButtons(ActionEvent event) {
       if(event.getSource() == incButton) {
           counter ++;
       } else if(event.getSource() == decButton) {
           counter --;
       }
        counterText.setText(Integer.toString(counter));
    }

    public static void main(String[] args) {
        launch(args);
    }

}
