package com.stemgon.oftmart.shop.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.stemgon.oftmart.shop.models.Product;

@Service
public class ProductService {
    // List<Product> products = new ArrayList<>();
    private List<Product> products = new ArrayList<>(Arrays.asList(
        new Product(
            "Html Course For Beginners",
            23.45,
            1
        ),
        new Product(
            "Html Course For Beginners",
            23.45,
            2
        ),
        new Product(
            "Html Course For Beginners",
            23.45,
            3
        ),
        new Product(
            "Html Course For Beginners",
            23.45,
            4
        )
    ));


    // public ProductService(){
    //     for(int i = 1; i <15; i++){
    //         products.add(new Product("New Iphone 6", 23.56, i));
    //     }
    // }


    public List<Product> getAllProducts(){
        return products;
    }
}
