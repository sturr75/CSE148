package p1;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class EventHandlerExample extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Button button = new Button("Click Me");
		button.setPrefSize(150,	30);
		Label label = new Label("Visible");
		TextField nameField = new TextField();
		TextField gpaField = new TextField();
		gpaField.setDisable(true);
		gpaField.setText("GPA");
		gpaField.setAlignment(Pos.CENTER_RIGHT);
		
		TextArea outputArea = new TextArea();
		
		nameField.setPromptText("Name");
		
		

//		SimpleEventHandler myHandler = new SimpleEventHandler(label);
		button.setOnAction(e -> {  // lambda expression
			String name = nameField.getText();
			outputArea.clear();
			outputArea.appendText(name + "\n");
//			Student s = new Student(name);
//			studentBag.insert(s);
			if (label.getText().equalsIgnoreCase("Visible")) {
				label.setText(name);
			
			} else {
				label.setText("Not visible");
			}
		});

		VBox pane = new VBox(20);
		pane.setAlignment(Pos.CENTER);
		pane.setPadding(new Insets(20));
		
		pane.getChildren().addAll(label, nameField, gpaField, button, outputArea);
		VBox.setMargin(nameField, new Insets(30));
		VBox.setMargin(gpaField, new Insets(20, 20, 20, 100));
//		VBox.setMargin(outputArea, new Insets(20, 20, 20, 100));

		primaryStage.setScene(new Scene(pane, 250, 550));
		primaryStage.show();
	}
//
//	// private inner class
//	private class SimpleEventHandler implements EventHandler<ActionEvent> {
//		private Label label;
//
//		public SimpleEventHandler(Label label) {
//			this.label = label;
//		}
//
//		@Override
//		public void handle(ActionEvent event) {
//			if (label.getText().equalsIgnoreCase("Visible")) {
//				label.setText("Invisible");
//			} else {
//				label.setText("Visible");
//			}
//
//		}
//
//	}

}
