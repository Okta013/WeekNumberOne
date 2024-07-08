package ru.anikeeva.weeknumberone.nighteatup2;

public class MilkProducts implements Products{
    private String name;
    private double fatContent;

    public MilkProducts(String name, double fatContent) {
        this.name = name;
        this.fatContent = fatContent;
    }

    public static MilkProducts getMilkProduct(String name, double fatContent){
        return new MilkProducts(name, fatContent);
    }

    @Override
    public String getCalled() {
        return name + " (" + fatContent + " %)";
    }
}
