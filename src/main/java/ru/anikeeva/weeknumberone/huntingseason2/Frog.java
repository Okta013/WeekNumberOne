package ru.anikeeva.weeknumberone.huntingseason2;

import org.springframework.stereotype.Component;

@Component("froggeBean")
public class Frog extends Animal{
    private String name;

    @Override
    public void sayBeforeDeath() {
        System.out.println("Ква-ква");
    }

    @Override
    public String toString(){
        return "Froggee";
    }
}
