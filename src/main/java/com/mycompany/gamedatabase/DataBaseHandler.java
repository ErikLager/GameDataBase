/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.gamedatabase;

import com.mycompany.gamedatabase.enteties.Game;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.xml.transform.Result;

/**
 *
 * @author Te41905
 */
public class DataBaseHandler {
    public List<Game> getGames(){
        List<Game> games = new ArrayList<>();
        try (Connection connection = ConnectionFactory.getConnection()){
            Statement stmt = connection.createStatement();
            String sql = "SELECT * FROM `games`";
            ResultSet data = stmt.executeQuery(sql);
            while (data.next()){
                int Id = data.getInt("Id");
                String Namn = data.getString("Name");
                int Platform_Id = data.getInt("Platform_Id");
                int Dev_Id = data.getInt("Dev_Id");
                int Pub_Id = data.getInt("Pub_Id");
                int CScore = data.getInt("CScore");
                int MScore = data.getInt("MScore");
                int Year = data.getInt("Year");
                Game game = new Game (Id, Namn, Platform_Id, Dev_Id, 
                Pub_Id, CScore, MScore, Year);
                games.add(game);
                
            }
        } catch (Exception e) {
            System.out.println("Error in 'getGames();': "+e.getMessage());
        }
        return games;
    }
//    public Game getGame (int id, String name, int Dev_Id, int Pub_Id, int CScore, int MScore, int Year){
//        Game game = new Game(id, name, Dev_Id, int Pub_Id, int CScore, int MScore, int Year);
//        try (Connection connection = ConnectionFactory.getConnection()){
//            String sql = "SELECT * FROM `games` WHERE id = " +id;
//            Statement stmt = connection.prepareStatement(sql);
//            System.out.println(sql);
//            ResultSet data = stmt.executeQuery(sql);
//            while (data.next()){
//                int Id = data.getInt("Id");
//                String Namn = data.getString("Namn");
//                int Platform_Id = data.getInt("Platform_Id");
//                int Dev_Id = data.getInt("Dev_Id");
//                int Pub_Id = data.getInt("Pub_Id");
//                int CScore = data.getInt("CScore");
//                int MScore = data.getInt("MScore");
//                int Year = data.getInt("Year");
//                game = new Game (Id, Namn, Platform_Id, Dev_Id, 
//                Pub_Id, CScore, MScore, Year);
//            }
//        } catch (Exception e) {
//            System.out.println("Eroor in getGame: "+e.getMessage());
//        }
//        return game;
//    }
}
