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
    private String platformName;
    private int devId;
    private String developer;
    private int pubId;
    private String publisher;
    private int cScore;
    private int mScore;
    private int year;

    public Game(int id, String name, int platformID, int devId, int pubId, int cScore, int mScore, int year) {
        this.id = id;
        this.name = name;
        this.platformID = platformID;
        this.devId = devId;
        this.pubId = pubId;
        this.cScore = cScore;
        this.mScore = mScore;
        this.year = year;
    }

    public Game(int id, String name, String platformName, String developer, String publisher, int cScore, int mScore, int year) {
        this.id = id;
        this.name = name;
        this.platformName = platformName;
        this.developer = developer;
        this.publisher = publisher;
        this.cScore = cScore;
        this.mScore = mScore;
        this.year = year;
    }
    

  
    @Override
    public String toString() {
        return String.format("%s. Year of Release: %d \n "
                + "My score: %d Critics score: %d \n Platform: %s "
                + " \n Developer: %s \n Publisher: %s \n", 
                name,year,mScore,cScore,platformName, developer, publisher);
    }

    public Game(int id, String name, int platformID, String platformName, int devId, String developer, int pubId, String publisher, int cScore, int mScore, int year) {
        this.id = id;
        this.name = name;
        this.platformID = platformID;
        this.platformName = platformName;
        this.devId = devId;
        this.developer = developer;
        this.pubId = pubId;
        this.publisher = publisher;
        this.cScore = cScore;
        this.mScore = mScore;
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

    public String getPlatformName() {
        return platformName;
    }

    public void setPlatformName(String platformName) {
        this.platformName = platformName;
    }

    public String getDeveloper() {
        return developer;
    }

    public void setDeveloper(String developer) {
        this.developer = developer;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
}
