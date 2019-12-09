package com.mycompany.gamedatabase;

/**
 * Sample Skeleton for 'Scene.fxml' Controller Class
 */
import com.mycompany.gamedatabase.enteties.Dev;
import com.mycompany.gamedatabase.enteties.Game;
import com.mycompany.gamedatabase.enteties.Platform;
import com.mycompany.gamedatabase.enteties.Pub;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class FXMLController {

//    Here all objects are declared
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
    private TextArea Platform_text_area;

    @FXML
    private TextArea Pub_text_area;

    @FXML
    private TextArea textArea;

    @FXML
    private TextField textField;

    @FXML
    private TextArea Dev_text_area;

//    The button that adds games 
    @FXML
    void AddGame(ActionEvent event) {
        System.out.println("Add game button pressed");
        //Logic for adding to the database
        try {
            Game g = new Game(
                    0, //Id
                    game.getText(), //name
                    Platform.getText(), //Platform
                    Dev.getText(), //Developer
                    Pub.getText(), //Publisher
                    Integer.parseInt(MScore.getText()), //My PERSONAL score 
                    Integer.parseInt(CScore.getText()), //Critics score (from metacritic) 
                    Integer.parseInt(Year.getText())); //year of first release

            DataBaseHandler dataBaseHandler = new DataBaseHandler();
            dataBaseHandler.addGame(g);
        } catch (Exception e) {
            Alert alert = new Alert(AlertType.INFORMATION);
            alert.setTitle("Information Dialog");
            alert.setHeaderText("Problem with parsing");
            alert.setContentText("Error: "+e.getMessage());

            alert.showAndWait();
        }

    }

//    Button that lists the games avalible in the database
    @FXML
    void ShowGames(ActionEvent event) {
        System.out.println("Games");
        //Logic for reading database
        DataBaseHandler DBH = new DataBaseHandler();
        List<Game> Spel;
        Spel = DBH.getGames();
        String output = "";

        for (Game gamme : Spel) {
            System.out.println(gamme);
            output += gamme.toString();
            output += "\n";
            textArea.setText(output);
        }
    }

//    This lists all devs, publishers & platforms
    @FXML
    void initialize() {
        DataBaseHandler DBH_DEV = new DataBaseHandler();
        List<Dev> Developer;
        Developer = DBH_DEV.getDev();
        String output_dev = "";
        for (Dev dev : Developer) {
            output_dev += dev.toString();
            output_dev += "\n";
            Dev_text_area.setText(output_dev);
        }

        DataBaseHandler DBH_PUB = new DataBaseHandler();
        List<Pub> Publisher;
        Publisher = DBH_PUB.getPub();
        String output_PUB = "";
        for (Pub pub : Publisher) {
            output_PUB += pub.toString();
            output_PUB += "\n";
            Pub_text_area.setText(output_PUB);
        }

        DataBaseHandler DBH_PLATFORM = new DataBaseHandler();
        List<Platform> Platf;
        Platf = DBH_PLATFORM.getPlat();
        String output_Platform = "";
        for (Platform platfo : Platf) {
            output_Platform += platfo.toString();
            output_Platform += "\n";
            Platform_text_area.setText(output_Platform);
        }

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
        assert textArea != null : "fx:id=\"textArea\" was not injected: check your FXML file 'Scene.fxml'.";
        assert textField != null : "fx:id=\"textField\" was not injected: check your FXML file 'Scene.fxml'.";
        assert Dev_text_area != null : "fx:id=\"Dev_text_area\" was not injected: check your FXML file 'Scene.fxml'.";
        assert Pub != null : "fx:id=\"Pub\" was not injected: check your FXML file 'Scene.fxml'.";
        assert Pub_text_area != null : "fx:id=\"Pub_text_area\" was not injected: check your FXML file 'Scene.fxml'.";
    }
}
