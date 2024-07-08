package ru.anikeeva.weeknumberone.nighteatup;

public class MilkProducts implements Products{
    private String name;
    private double fatContent;

    public double getFatContent() {
        return fatContent;
    }

    public void setFatContent(double fatContent) {
        this.fatContent = fatContent;
    }

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MilkProducts(String name, double fatContent) {
        this.name = name;
        this.fatContent = fatContent;
    }

    @Override
    public String getCalled() {
        return name + " (" + fatContent + " %)";
    }
}
