package com.asgn2group.cmptasgn2.models;

public class Users {
    private long id;

    private String name;
    private double height;
    private double weight;
    private String haircolor;
    private double gpa;
    public Users() {
    }
    public Users(long id, String name, double height, double weight, String haircolor, double gpa) {
        this.id = id;
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.haircolor = haircolor;
        this.gpa = gpa;
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
    public String getHaircolor() {
        return haircolor;
    }
    public void setHaircolor(String haircolor) {
        this.haircolor = haircolor;
    }
    public double getGpa() {
        return gpa;
    }
    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
    
    // you should create a database table (called “Student”) to 
    // collect information about a series of Students. 
    // The minimum  attributes for the Students are name, weight, height, hair color, and gpa.
    //  In addition, you may add as many other Student attributes as you’d like (Be creative: P). 



    
}
