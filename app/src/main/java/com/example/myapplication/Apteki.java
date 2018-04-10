package com.example.myapplication;

/**
 * Created by Ainur on 10.04.2018.
 */

public class Apteki {
    String Name;
    String Address;
    String Price;

    public Apteki(String name, String address, String price) {
        Name = name;
        Address = address;
        Price = price;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getPrice() {
        return Price;
    }

    public void setPrice(String price) {
        Price = price;
    }
}
