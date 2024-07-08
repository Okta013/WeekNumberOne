package ru.anikeeva.weeknumberone.nighteatup;

public class VegetableProducts implements Products{
    private String name;
    private String treeName;

    public String getTreeName() {
        return treeName;
    }

    public void setTreeName(String treeName) {
        this.treeName = treeName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public VegetableProducts(String name, String treeName){
        this.name=name;
        this.treeName=treeName;
    }

    @Override
    public String getCalled() {
        return name + " (" + treeName + ")";
    }
}
