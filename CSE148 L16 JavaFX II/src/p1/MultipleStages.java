package p1;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MultipleStages extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		Button btn1 = new Button("Hi");
		
		btn1.setPrefSize(50, 30);
		Button btn2 = new Button("ByeByeBye");
		btn2.setPrefSize(50, 30);
		
		VBox pane = new VBox(20);
		pane.setAlignment(Pos.CENTER);
		
		pane.getChildren().add(btn1);
		pane.getChildren().add(btn2);
		
		pane.setPadding(new Insets(20));
		
		VBox.setMargin(btn1, new Insets(10, 5, 10, 5));
		
//		pane.getChildren().remove(btn1);
//		pane.getChildren().remove(btn2);
		
		Scene aScene = new Scene(pane);
		
		
//		Scene anotherScene = new Scene(, 250, 100);
		primaryStage.setScene(aScene);
		primaryStage.setTitle("JAVAFX");
		primaryStage.show();
//		Stage newStage = new Stage();
		
//		newStage.setScene(anotherScene);
//		newStage.showAndWait();
//		System.out.println("Done");
	}

}
