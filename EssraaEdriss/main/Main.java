package main;


import gui.FahradControl;

import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {
	
	@Override
	public void start(Stage primaryStage) {
		new FahradControl(primaryStage);
	}	
	
	public static void main(String[] args){
		launch(args);
	}
}
