/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author khaled
 */
public class ScreensFramework extends Application{

    public static String hangmanClientID = "main;800;650";
    public static String hangmanClientFile = "/client/HangmanClient.fxml";
    
    public static String insertingServerScreenID = "InsertingServerScreen;500;410";
    public static String insertingServerScreenFile = "/client/InsertingServerScreen.fxml";
    
    @Override
    public void start(Stage primaryStage) throws Exception {
        ScreensController mainContronller = new ScreensController();
        mainContronller.setPrimaryStage(primaryStage);
        mainContronller.loadScreen(ScreensFramework.hangmanClientID, ScreensFramework.hangmanClientFile);
        mainContronller.loadScreen(ScreensFramework.insertingServerScreenID, ScreensFramework.insertingServerScreenFile);
        
        mainContronller.setScreen(hangmanClientID);
        
        Group root = new Group();
        root.getChildren().addAll(mainContronller);
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.centerOnScreen();
        //primaryStage.setResizable(false);
        primaryStage.show();
    }
    
}
