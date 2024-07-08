package ru.anikeeva.weeknumberone.huntingseason;

public class Hunter {
    private Animal currentAnimal;

    public void setCurrentAnimal(Animal currentAnimal) {
        this.currentAnimal = currentAnimal;
    }

    public void killAnimal() {
        System.out.println("Стреляю в " + currentAnimal.name);
        System.out.println("Попал!");
        currentAnimal.sayBeforeDeath();
    }
}
