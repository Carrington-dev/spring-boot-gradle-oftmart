package com.stemgon.oftmart.shop.models;

public class Product {
    private String title;
    private Double price;
    private int id;


    public Product(String name, double d, int id){
        this.id = id;
        this.price = d;
        this.title = name;
    }

    
}
