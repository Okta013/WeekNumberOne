package ru.anikeeva.weeknumberone.hydraheads;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HydraHeads {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Hydra hydra = context.getBean("hydraBean", Hydra.class);
        System.out.println(hydra);
        context.close();
    }
}
