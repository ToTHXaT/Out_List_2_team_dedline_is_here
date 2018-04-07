package com.example.myapplication;


public class Product {
    private int id;
    private String name;
    private String price;
    private String Kol_vo;

    //Constructor

    public Product(int id, String name, String price, String Kol_vo) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.Kol_vo = Kol_vo;
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

    public String getKol_vo() {
        return Kol_vo;
    }

    public void setKol_vo(String Kol_vo) {
        this.Kol_vo = Kol_vo;
    }
}
