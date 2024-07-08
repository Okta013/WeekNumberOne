package ru.anikeeva.weeknumberone.huntingseason;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HuntingSeason {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Hunter hunter = context.getBean("hunter", Hunter.class);

        hunter.killAnimal();

        context.close();
    }
}
