package ru.anikeeva.weeknumberone.nighteatup;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class NightEatUp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Fridge fridge = context.getBean("fridgeBean", Fridge.class);
        fridge.getProductsList();
        context.close();
    }
}
