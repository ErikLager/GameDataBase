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
public class Dev {
    private int id;
    private String name;

    public Dev(int id, String Name) {
        this.id = id;
        this.name = Name;
    }

    public String getName() {
        return name;
    }

    public void setName(String Name) {
        this.name = Name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return String.format("%d %s",id, name);
//        return "Dev{" + "id=" + id + ", Name=" + name + '}';
    }
    
}
