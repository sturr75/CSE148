package p3;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class BorderPaneDemo extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
//		Button topBtn = new Button("TOP");
		Button rightBtn = new Button("RIGHT");
		rightBtn.setRotate(90);
//		Button bottomBtn = new Button("BOTTOM");
		Button leftBtn = new Button("LEFT");
		leftBtn.setRotate(-90);
		Button centerBtn = new Button("CENTER");
		
		BorderPane pane = new BorderPane();
//		pane.setTop(topBtn);
		pane.setRight(rightBtn);
//		pane.setBottom(bottomBtn);
		pane.setLeft(leftBtn);
		pane.setCenter(centerBtn);
		
		Scene scene = new Scene(pane, 300, 300);
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}

}
