package ru.anikeeva.weeknumberone.nighteatup2;

public class VegetableProducts implements Products{
    private String name;
    private String treeName;

    public VegetableProducts(String name, String treeName){
        this.name=name;
        this.treeName=treeName;
    }

    public static VegetableProducts getVegetableProduct(String name, String treeName){
        return new VegetableProducts(name,treeName);
    }

    @Override
    public String getCalled() {
        return name + " (" + treeName + ")";
    }
}
