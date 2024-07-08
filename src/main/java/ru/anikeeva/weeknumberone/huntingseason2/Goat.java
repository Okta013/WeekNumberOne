package ru.anikeeva.weeknumberone.huntingseason2;

import org.springframework.stereotype.Component;

@Component("goateeBean")
public class Goat extends Animal{
    private String name;

    @Override
    public void sayBeforeDeath() {
        System.out.println("Бееееее");
    }

    @Override
    public String toString(){
        return "Goatee";
    }
}
