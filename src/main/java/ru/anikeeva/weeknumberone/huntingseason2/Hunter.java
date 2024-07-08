package ru.anikeeva.weeknumberone.huntingseason2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Hunter {
    private Animal currentAnimal1;
    private Animal currentAnimal2;
    private Animal currentAnimal3;

    @Autowired
    public Hunter(@Qualifier("froggeBean") Animal currentAnimal1,
                  @Qualifier("goateeBean") Animal currentAnimal2,
                  @Qualifier("goosseeBean") Animal currentAnimal3) {
        this.currentAnimal1 = currentAnimal1;
        this.currentAnimal2 = currentAnimal2;
        this.currentAnimal3 = currentAnimal3;
    }

    public void killAnimal() {
        System.out.println("Стреляю в " + currentAnimal1);
        System.out.println("Попал!");
        currentAnimal1.sayBeforeDeath();
        System.out.println("Стреляю в " + currentAnimal2);
        System.out.println("Попал!");
        currentAnimal2.sayBeforeDeath();
        System.out.println("Стреляю в " + currentAnimal3);
        System.out.println("Попал!");
        currentAnimal3.sayBeforeDeath();
    }
}
