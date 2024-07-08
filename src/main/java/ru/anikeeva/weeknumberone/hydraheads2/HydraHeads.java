package ru.anikeeva.weeknumberone.hydraheads2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class HydraHeads {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        Hydra hydra = context.getBean("hydraBean", Hydra.class);
        System.out.println(hydra);
        context.close();
    }
}
