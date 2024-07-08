package ru.anikeeva.weeknumberone.nighteatup;

import java.util.ArrayList;
import java.util.List;

public class Fridge {
    private String model;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    private List<Products> productsList = new ArrayList<>();

    public void setProductsList(List<Products> productsList) {
        this.productsList = productsList;
    }

    public void getProductsList() {
        for(Products products: productsList) {
            System.out.println(products.getCalled());
        }
    }
}
