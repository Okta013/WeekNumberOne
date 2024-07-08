package ru.anikeeva.weeknumberone.huntingseason;

public abstract class Animal {
    String name;

    public abstract void sayBeforeDeath();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
