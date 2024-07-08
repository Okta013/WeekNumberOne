package ru.anikeeva.weeknumberone.huntingseason2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class HuntingSeason {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("ru.anikeeva.weeknumberone.huntingseason2");

        Hunter hunter = context.getBean("hunter", Hunter.class);

        hunter.killAnimal();

        context.close();
    }
}
