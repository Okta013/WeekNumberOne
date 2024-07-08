package ru.anikeeva.weeknumberone.huntingseason;

public class Goat extends Animal {
    public Goat(String name){
        this.name = name;
    }

    @Override
    public void sayBeforeDeath() {
        System.out.println("Бееееее");
    }
}
