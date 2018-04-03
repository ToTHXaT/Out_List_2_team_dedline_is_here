package com.example.myapplication;


public class Product {
    private int id;
    private String name;
    private String price;
    private String distance;

    //Constructor

    public Product(int id, String name, String price, String distance) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.distance = distance;
    }

    //Setter, getter

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

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDistance() {
        return distance;
    }

    public void setDistance(String distance) {
        this.distance = distance;
    }
}
