package ru.anikeeva.weeknumberone.tothebttom;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ToTheBottom {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Person spongeBob = context.getBean("person1", Person.class);
        Person patrick = context.getBean("person2", Person.class);
        Person squidward = context.getBean("person3", Person.class);

        System.out.println(spongeBob.toString());
        System.out.println(patrick.toString());
        System.out.println(squidward.toString());

        context.close();
    }
}
