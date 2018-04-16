package p4;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class GridPaneDemo extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Button c1r1 = new Button("TOP");
		c1r1.setPrefWidth(100);
		Button c2r1 = new Button("RIGHT");
		c2r1.setPrefWidth(100);

		
//		rightBtn.setRotate(90);
		Button c1r2 = new Button("BOTTOM");
		c1r2.setPrefWidth(100);

		Button c2r2 = new Button("LEFT");
		c2r2.setPrefWidth(100);

//		leftBtn.setRotate(-90);
		Button c1r3 = new Button("CENTER");
		c1r3.setPrefWidth(230);
		
		
		
		GridPane pane = new GridPane();
		pane.setVgap(20);
		pane.setHgap(30);
		pane.add(c1r1, 0, 0);
		pane.add(c2r1, 1, 0);
		pane.add(c1r2, 0, 1);
		pane.add(c2r2, 1, 1);
		pane.add(c1r3, 0, 2, 2, 1);
		
		
		Scene scene = new Scene(pane, 300, 300);
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}

}
