/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.gamedatabase.enteties;

/**
 *
 * @author Te41905
 */
public class Game {
    private int id;
    private String name;
    private int Platform_Id;
    private int Dev_Id;
    private int Pub_Id;
    private int CScore;
    private int MScore;
    private int Year;

    public Game(int id, String name, int Platform_Id, int Dev_Id, int Pub_Id, int CScore, int MScore, int Year) {
        this.id = id;
        this.name = name;
        this.Platform_Id = Platform_Id;
        this.Dev_Id = Dev_Id;
        this.Pub_Id = Pub_Id;
        this.CScore = CScore;
        this.MScore = MScore;
        this.Year = Year;
    }

    public int getYear() {
        return Year;
    }

    public void setYear(int Year) {
        this.Year = Year;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPlatform_Id() {
        return Platform_Id;
    }

    public void setPlatform_Id(int Platform_Id) {
        this.Platform_Id = Platform_Id;
    }

    public int getDev_Id() {
        return Dev_Id;
    }

    public void setDev_Id(int Dev_Id) {
        this.Dev_Id = Dev_Id;
    }

    public int getPub_Id() {
        return Pub_Id;
    }

    public void setPub_Id(int Pub_Id) {
        this.Pub_Id = Pub_Id;
    }

    public int getCScore() {
        return CScore;
    }

    public void setCScore(int CScore) {
        this.CScore = CScore;
    }

    public int getMScore() {
        return MScore;
    }

    public void setMScore(int MScore) {
        this.MScore = MScore;
    }
}
