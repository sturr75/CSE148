package p1;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.CheckMenuItem;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.RadioMenuItem;
import javafx.scene.control.SeparatorMenuItem;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class MenuExample extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("Menu Example");
		BorderPane root = new BorderPane();
		Scene scene = new Scene(root, 300, 250);
		
		// menubar
		MenuBar menuBar = new MenuBar();
		menuBar.prefWidthProperty().bind(primaryStage.widthProperty());
		
		
		Menu fileMenu = new Menu("File");
		MenuItem newMenuItem = new MenuItem("New");
		MenuItem saveMenuItem = new MenuItem("Save");
		MenuItem exitMenuItem = new MenuItem("Exit");
		
		newMenuItem.setOnAction(e -> {
			System.out.println("The New MenuItem was clicked!");
		});
		exitMenuItem.setOnAction(e -> {
			Platform.exit();
		});
		
		fileMenu.getItems().addAll(
				newMenuItem,
				new SeparatorMenuItem(),
				saveMenuItem,
				exitMenuItem
				);
		
		Menu cameraMenu = new Menu("Camera");
		CheckMenuItem cam1MenuItem = new CheckMenuItem("Show Camera 1");
		cam1MenuItem.setSelected(true);
		cameraMenu.getItems().add(cam1MenuItem);
		CheckMenuItem cam2MenuItem = new CheckMenuItem("Show Camera 2");
		cameraMenu.getItems().add(cam2MenuItem);
		
		
		
		// alarm menu
		Menu alarmMenu = new Menu("Alarm");
		ToggleGroup tGroup = new ToggleGroup();
		RadioMenuItem soundAlarmItem = new RadioMenuItem("Sound Alarm");
		soundAlarmItem.setToggleGroup(tGroup);
		
		RadioMenuItem stopAlarmItem = new RadioMenuItem("Alarm Off");
		stopAlarmItem.setToggleGroup(tGroup);
		stopAlarmItem.setSelected(true);
		
		alarmMenu.getItems().addAll(soundAlarmItem, stopAlarmItem);
		
		// contingencyMenu
		Menu contingencyMenu = new Menu("Contigency Plans");
		contingencyMenu.getItems().addAll(
				new CheckMenuItem("Check 1"),
				new CheckMenuItem("Check 2"),
				new CheckMenuItem("Check 3")
				);
		
		alarmMenu.getItems().add(contingencyMenu);
		
		menuBar.getMenus().addAll(fileMenu, cameraMenu, alarmMenu);
		
		root.setTop(new MenuBar());
		primaryStage.setScene(scene);
		primaryStage.show();
	}

}
