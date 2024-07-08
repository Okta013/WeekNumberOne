package ru.anikeeva.weeknumberone.hydraheads2;

import java.util.ArrayList;
import java.util.List;

public class Hydra {
    private String name;
    private List<Head> listOfeads = new ArrayList<>();

    public Hydra(String name, List<Head> listOfeads) {
        this.name = name;
        this.listOfeads = listOfeads;
    }

    @Override
    public String toString() {
        System.out.println("Список голов гидры " + name + ":");
        for (Head head : listOfeads) {
            System.out.println(head + " (глаз: " + head.getEyesAmount() + ", ушей: " + head.getEarsAmount() + ")");
        }
        return"";
    }
}