package ru.anikeeva.weeknumberone.huntingseason;

public class Frog extends Animal{

    public Frog(String name){
        this.name = name;
    }

    @Override
    public void sayBeforeDeath() {
        System.out.println("Ква-ква");
    }
}
