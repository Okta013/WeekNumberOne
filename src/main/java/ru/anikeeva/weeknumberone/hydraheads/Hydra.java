package ru.anikeeva.weeknumberone.hydraheads;

import java.util.ArrayList;
import java.util.List;

public class Hydra {
    private String name;
    private List<Head> listOfHeads = new ArrayList<Head>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setListOfHeads(List<Head> listOfHeads) {
        this.listOfHeads = listOfHeads;
    }

    @Override
    public String toString() {
        System.out.println("Список голов гидры " + name + ":");
        for (Head head : listOfHeads) {
            System.out.println(head + " (" + head.getEyesAmount() + " глаза и " + head.getEarsAmount() + " ушей)");
        }
        return "";
    }
}