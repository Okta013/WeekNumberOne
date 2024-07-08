package ru.anikeeva.weeknumberone.huntingseason;

public class Goosse extends Animal{

    public Goosse(String name){
        this.name = name;
    }

    @Override
    public void sayBeforeDeath() {
        System.out.println("Кря-кря");
    }
}
