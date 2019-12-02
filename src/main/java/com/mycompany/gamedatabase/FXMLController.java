package com.mycompany.gamedatabase;

/**
 * Sample Skeleton for 'Scene.fxml' Controller Class
 */

import com.mycompany.gamedatabase.enteties.Game;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class FXMLController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField MScore;

    @FXML
    private TextField game;

    @FXML
    private ListView<?> listView;

    @FXML
    private TextField Platform;

    @FXML
    private TextField Dev;

    @FXML
    private TextField Year;

    @FXML
    private TextField CScore;

    @FXML
    private TextField Pub;

    @FXML
    private Button AddGameButton;
    
    @FXML
    private Button Showgames;
    
    @FXML
    void AddGame(ActionEvent event) {
        System.out.println("Add game button pressed");
        //Logic for adding to the database
        
    }
    @FXML
    void ShowGames(ActionEvent event) {
        System.out.println("Games");
        //Logic for reading database
        DataBaseHandler DBH = new DataBaseHandler();
        List <Game> Spel;
        Spel = DBH.getGames();
        for (Game game : Spel) {
            System.out.println(Spel);
        }
    }
    

    @FXML
    void initialize() {
        assert MScore != null : "fx:id=\"MScore\" was not injected: check your FXML file 'Scene.fxml'.";
        assert game != null : "fx:id=\"game\" was not injected: check your FXML file 'Scene.fxml'.";
        assert listView != null : "fx:id=\"ListView\" was not injected: check your FXML file 'Scene.fxml'.";
        assert Platform != null : "fx:id=\"Platform\" was not injected: check your FXML file 'Scene.fxml'.";
        assert Dev != null : "fx:id=\"Dev\" was not injected: check your FXML file 'Scene.fxml'.";
        assert Year != null : "fx:id=\"Year\" was not injected: check your FXML file 'Scene.fxml'.";
        assert CScore != null : "fx:id=\"CScore\" was not injected: check your FXML file 'Scene.fxml'.";
        assert Pub != null : "fx:id=\"Pub\" was not injected: check your FXML file 'Scene.fxml'.";
        assert AddGameButton != null : "fx:id=\"AddGameButton\" was not injected: check your FXML file 'Scene.fxml'.";
        assert Showgames != null : "fx:id=\"Showgames\" was not injected: check your FXML file 'Scene.fxml'.";

    }
}
