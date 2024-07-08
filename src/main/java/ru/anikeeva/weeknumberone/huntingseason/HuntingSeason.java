package ru.anikeeva.weeknumberone.huntingseason;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HuntingSeason {
    public static void main(String[] args) {
        Hunter hunter = new Hunter();

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Frog frogge = context.getBean("frogge", Frog.class);
        Goat goatee = context.getBean("goatee", Goat.class);
        Goosse goossee = context.getBean("goossee", Goosse.class);

        hunter.setCurrentAnimal(frogge);
        hunter.killAnimal();

        hunter.setCurrentAnimal(goatee);
        hunter.killAnimal();

        hunter.setCurrentAnimal(goossee);
        hunter.killAnimal();

    }
}
