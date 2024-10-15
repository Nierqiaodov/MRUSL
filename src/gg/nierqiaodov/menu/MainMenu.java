package gg.nierqiaodov.menu;

//main menu class of launcher

import gg.nierqiaodov.main.MRUSLMain;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TabPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.Region;
import javafx.stage.Stage;

public class MainMenu extends Application{
//extend class Application

    public static void main(String[] args) { //main method
        Application.launch(args);
    }

    @Override
    //rewrite startTab
    public void start(Stage primaryStage) {

        //the top of frame
        HBox menu = new HBox(); //create a top menu
        Region spacer = new Region();
        HBox.setHgrow(spacer, Priority.ALWAYS); //make button be placed at left and right of frame
        menu.setStyle("-fx-background-color: #6691e3; -fx-padding: 10px;"); //hbox style
        Button homeButton = new Button("主页"); //define button home
        homeButton.setStyle("-fx-background-color: #61bed3; -fx-text-fill: #ffffff; -fx-font-size: 16px;"); //button style
        homeButton.setOnAction(event -> {}); //click event
        Button minimizeButton = new Button("最小化窗口"); //define button minimize
        minimizeButton.setStyle("-fx-background-color: #61bed3; -fx-text-fill: #ffffff; -fx-font-size: 16px;"); //button style
        minimizeButton.setOnAction(event -> primaryStage.setIconified(true)); //click event to make frame minimize
        Button leaveButton = new Button("退出"); //define button leave
        leaveButton.setStyle("-fx-background-color: #61bed3; -fx-text-fill: #ffffff; -fx-font-size: 16px;"); //button style
        leaveButton.setOnAction(event -> primaryStage.close()); //click event to leave
        menu.getChildren().addAll(homeButton, spacer, minimizeButton, leaveButton); //add button

        //the center of frame
        TabPane main = new TabPane(); //main contest
        main.setStyle("-fx-background-color: #9ceae1;"); //style

        //the bottom of frame
        HBox startTab = new HBox(); //create a top menu
        startTab.setStyle("-fx-background-color: #2860cc; -fx-padding: 10px;"); //hbox style
        Button start = new Button("启动游戏"); // start button
        start.setStyle("-fx-background-color: #001f74; -fx-text-fill: #ffffff; -fx-font-size: 16px;");
        startTab.getChildren().addAll(start); //add button

        //add pane to stage
        BorderPane pane = new BorderPane(); //create a pane
        pane.setTop(menu);
        pane.setCenter(main);
        pane.setBottom(startTab);
        Scene scene = new Scene(pane,950,600); //frame
        primaryStage.setResizable(false);
        primaryStage.setScene(scene); //FX is a piece of shit!
        primaryStage.setTitle(MRUSLMain.getApplicationName() + MRUSLMain.getVersion()); //set title to the corresponding strings
        //primaryStage.initStyle(StageStyle.UNDECORATED); //this is cool
        primaryStage.show(); // I even forget to make frame visible :(

    }

}
