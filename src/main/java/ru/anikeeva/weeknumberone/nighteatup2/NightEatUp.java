package ru.anikeeva.weeknumberone.nighteatup2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class NightEatUp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        Fridge fridge = context.getBean("fridge", Fridge.class);
        fridge.getProductsList();
        context.close();
    }
}
