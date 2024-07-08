package ru.anikeeva.weeknumberone.nighteatup2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class Fridge {
    private String model;

    private List<Products> productsList = new ArrayList<>();

    @Autowired
    public Fridge(List<Products> productsList){
        this.productsList = productsList;
    }

    public void getProductsList() {
        for(Products products: productsList) {
            System.out.println(products.getCalled());
        }
    }

}