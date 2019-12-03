/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.gamedatabase.enteties;

/**
 *
 * @author L
 */
public class Game {
    private int id;
    private String name;
    private int platformID;
    private int devId;
    private int pubId;
    private int cScore;
    private int mScore;
    private int year;

    @Override
    public String toString() {
        return String.format("%s Year of Release: %d \n "
                + "My score: %d Critics score: %d \n Platform: %d "
                + "Developer: %d. Publisher: %d \n", 
                name,year,mScore,cScore,platformID, devId, pubId);
       // return "Game{" + "id=" + id + ", name=" + name + ", platformID=" + platformID + ", devId=" + devId + ", pubId=" + pubId + ", cScore=" + cScore + ", mScore=" + mScore + ", Year=" + Year + '}';
    }

    public Game(int id, String name, int Platform_Id, int Dev_Id, int Pub_Id, int CScore, int MScore, int year) {
        this.id = id;
        this.name = name;
        this.platformID = Platform_Id;
        this.devId = Dev_Id;
        this.pubId = Pub_Id;
        this.cScore = CScore;
        this.mScore = MScore;
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int Year) {
        this.year = Year;
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

    public int getPlatformID() {
        return platformID;
    }

    public void setPlatformID(int platformID) {
        this.platformID = platformID;
    }

    public int getDevId() {
        return devId;
    }

    public void setDevId(int devId) {
        this.devId = devId;
    }

    public int getPubId() {
        return pubId;
    }

    public void setPubId(int pubId) {
        this.pubId = pubId;
    }

    public int getcScore() {
        return cScore;
    }

    public void setcScore(int cScore) {
        this.cScore = cScore;
    }

    public int getmScore() {
        return mScore;
    }

    public void setmScore(int mScore) {
        this.mScore = mScore;
    }
}
