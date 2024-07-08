package ru.anikeeva.weeknumberone.tothebottom2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ToTheBottom {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

        Person spongeBob = context.getBean("person1", Person.class);
        Person patrick = context.getBean("person2", Person.class);
        Person squidward = context.getBean("person3", Person.class);

        System.out.println(spongeBob.toString());
        System.out.println(patrick.toString());
        System.out.println(squidward.toString());

        context.close();
    }
}
