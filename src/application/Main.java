package application;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	Stage stage;
	@Override
	public void start(Stage primaryStage) {
		try {
			stage = primaryStage;
			mainWindows();

		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	public void mainWindows(){
		FXMLLoader loader = new FXMLLoader(Main.class.getResource("Ventana.fxml"));
		AnchorPane root;
		try {
			root = loader.load();
			//controller controller = loader.getController();
			//controller.main(stage, this);
			Scene scene = new Scene(root);
			stage.initStyle(StageStyle.UNDECORATED);
			stage.setScene(scene);
			stage.show();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}

	public static void main(String[] args) {
		launch(args);
	}
}
