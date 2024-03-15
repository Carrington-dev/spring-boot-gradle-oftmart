package com.stemgon.oftmart.shop;

import org.springframework.web.bind.annotation.RestController;

import com.stemgon.oftmart.shop.models.Product;
import com.stemgon.oftmart.shop.service.ProductService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
public class ProductController {

    @Autowired
    private ProductService productService = new ProductService();

    @GetMapping("/")
    public String getHome() {
        return "<h1>Welcome To Oftmart Shopping Centre </h1>";
    }

    @GetMapping("/products")
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    @GetMapping("/courses")
    public List<Product> getCourses(){
        return productService.getAllProducts();
    }
    

    @GetMapping("/about")
    public String getAbout() {
        return "<h1>Welcome To Oftmart Shopping Centre </h1>";
    }
    
}
