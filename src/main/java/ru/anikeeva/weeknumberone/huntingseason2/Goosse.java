package ru.anikeeva.weeknumberone.huntingseason2;

import org.springframework.stereotype.Component;

@Component("goosseeBean")
public class Goosse extends Animal{
    private String name;

    @Override
    public void sayBeforeDeath() {
        System.out.println("Кря-кря");
    }

    @Override
    public String toString() {
        return "Goossee";
    }
}
