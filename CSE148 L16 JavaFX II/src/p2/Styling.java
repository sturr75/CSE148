package p2;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Styling extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		StackPane pane = new StackPane();
		Button okBtn = new Button("OK");
		okBtn.setRotate(45);
		okBtn.setRotate(90);
		okBtn.setStyle("-fx-border-color: red; -fx-background-color: lightGray;"); 
		pane.getChildren().add(okBtn);
		
		Scene scene = new Scene(pane, 200, 250);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

}
