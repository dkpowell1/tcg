/**
 * TODO summary
 *
 * @author Daniel Powell
 * @version 3/30/2017
 */

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import javax.swing.*;
import java.awt.*;


public class Game extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Yu-gi-oh! Duel App v1.0");
        BorderPane root = new BorderPane();
        setupGame(root);
        Scene scene = new Scene(root,1080,720,Color.LIGHTGRAY);
        scene.getStylesheets().add("./css/board.css");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void setupGame(BorderPane root) {
        GridPane playerOneHand = new GridPane();
        GridPane playerTwoHand = new GridPane();
        GridPane board = new GridPane();
        board.getStyleClass().add("board");
        root.setTop(playerTwoHand);
        root.setCenter(board);
        root.setBottom(playerOneHand);

    }
}
