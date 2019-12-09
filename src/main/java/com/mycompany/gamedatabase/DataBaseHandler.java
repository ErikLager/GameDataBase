/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.gamedatabase;

import com.mycompany.gamedatabase.enteties.Dev;
import com.mycompany.gamedatabase.enteties.Game;
import com.mycompany.gamedatabase.enteties.Platform;
import com.mycompany.gamedatabase.enteties.Pub;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

/**
 *
 * @author Te41905
 */
public class DataBaseHandler {

    /**
     *
     * @return
     */
    public ObservableList<Game> getGames() {
        List<Game> games = new ArrayList<>();
        try (Connection connection = ConnectionFactory.getConnection()) {
            Statement stmt = connection.createStatement();
            String sql = "SELECT games.Id, Name, MScore, CScore, Year, DevName, PubName, PlatformName FROM games, developer, platform, publisher WHERE Platform_Id = platform.Id AND Dev_Id = developer.Id AND Pub_Id = publisher.Id;";
            ResultSet data = stmt.executeQuery(sql);
            while (data.next()) {
                int Id = data.getInt("Id");
                String Namn = data.getString("Name");
                String Platform_Id = data.getString("PlatformName");
                String Dev_Id = data.getString("DevName");
                String Pub_Id = data.getString("PubName");
                int CScore = data.getInt("CScore");
                int MScore = data.getInt("MScore");
                int Year = data.getInt("Year");
                Game game = new Game(Id, Namn, Platform_Id, Dev_Id,
                        Pub_Id, CScore, MScore, Year);
                games.add(game);
            }
        } catch (Exception e) {
            System.out.println("Error in 'getGames();': " + e.getMessage());
        }
        ObservableList<Game> observablegames = FXCollections.observableList(games);
        return observablegames;
    }

    /**
     *
     * @return
     */
    public ObservableList<Dev> getDev() {
        List<Dev> devs = new ArrayList<>();
        try (Connection connection = ConnectionFactory.getConnection()) {
            Statement stmt = connection.createStatement();
            String sql = "SELECT * FROM `developer`";
            ResultSet data = stmt.executeQuery(sql);
            while (data.next()) {
                int Id = data.getInt("Id");
                String Namn = data.getString("DevName");
                Dev dev = new Dev(Id, Namn);
                devs.add(dev);
            }
        } catch (Exception e) {
            System.out.println("Error in 'getDev();': " + e.getMessage());
        }
        ObservableList<Dev> observableDevs = FXCollections.observableList(devs);
        return observableDevs;
    }

    /**
     *
     * @return
     */
    public ObservableList<Pub> getPub() {
        List<Pub> publ = new ArrayList<>();
        try (Connection connection = ConnectionFactory.getConnection()) {
            Statement stmt = connection.createStatement();
            String sql = "SELECT * FROM `publisher`";
            ResultSet data = stmt.executeQuery(sql);
            while (data.next()) {
                int Id = data.getInt("Id");
                String Namn = data.getString("PubName");
                Pub pub = new Pub(Id, Namn);
                publ.add(pub);
            }
        } catch (Exception e) {
            System.out.println("Error in getPub: " + e.getMessage());
        }
        ObservableList<Pub> observablePub = FXCollections.observableList(publ);
        return observablePub;
    }

    /**
     *
     * @return
     */
    public ObservableList<Platform> getPlat() {
        List<Platform> platform = new ArrayList<>();
        try (Connection connection = ConnectionFactory.getConnection()) {
            Statement stmt = connection.createStatement();
            String sql = "SELECT * FROM `Platform`";
            ResultSet data = stmt.executeQuery(sql);
            while (data.next()) {
                int Id = data.getInt("Id");
                String Namn = data.getString("PlatformName");
                Platform plat = new Platform(Id, Namn);
                platform.add(plat);
            }
        } catch (Exception e) {
            System.out.println("Error in getPlat: " + e.getMessage());
        }
        ObservableList<Platform> observablePublisher = FXCollections.observableList(platform);
        return observablePublisher;
    }

    /**
     *
     * @param game
     * @return
     */
    public int addGame(Game game) {
        try (Connection connection = ConnectionFactory.getConnection()) {
            Statement stmt = connection.createStatement();
            String sql = String.format("INSERT INTO games VALUES "
                    + "('%d', '%s', '%d', '%d', '%d', '%d', '%d', '%d' )",
                    game.getId(),game.getName(), 
                    game.getPlatformID(),game.getDevId(), 
                    game.getPubId(),game.getmScore(), 
                    game.getcScore(),game.getYear());
            System.out.println(sql);
            return stmt.executeUpdate(sql);
        } catch (Exception e) {
            Alert alert = new Alert(AlertType.INFORMATION);
            alert.setTitle("Information Dialog");
            alert.setHeaderText("Problem, with the database");
            alert.setContentText("Error: "+e.getMessage());
            alert.showAndWait();
        }
        return 0;
    }
}
