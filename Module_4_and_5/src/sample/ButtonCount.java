package sample;
import javafx.application.*;
import javafx.event.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;;
import javafx.scene.paint.*;
import javafx.scene.text.*;
import javafx.stage.*;


public class ButtonCount extends Application {
    private Button button;
    private Text buttonCountText;
    private int clickCount;

    public void start(Stage primaryStage) {
        clickCount = 0;
        Pane pane = new FlowPane();

        button = new Button("Click here!");
        button.setOnAction(this::handleButton);
        pane.getChildren().add(button);

        buttonCountText = new Text("Count: 0");
        buttonCountText.setFont(Font.font(20));

        pane.getChildren().add(buttonCountText);

        Scene scene = new Scene(pane, 300, 300);
        scene.setFill((Color.PINK));

        primaryStage.setTitle("Button Click Count");
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    private void handleButton(ActionEvent event) {
        clickCount ++;
        buttonCountText.setText("Count: " + clickCount);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
