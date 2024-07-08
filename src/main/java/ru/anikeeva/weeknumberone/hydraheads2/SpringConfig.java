package ru.anikeeva.weeknumberone.hydraheads2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.util.ArrayList;
import java.util.List;

@Configuration
@ComponentScan("ru.anikeeva.weeknumberone.hydraheads2")
public class SpringConfig {
    @Bean
    @Scope("prototype")
    public Head headBean(){
        return new Head(2, 6);
    }

    @Bean
    public Hydra hydraBean(){
        List<Head> heads = new ArrayList<>();
        heads.add(headBean());
        heads.add(headBean());
        heads.add(headBean());
        return new Hydra("Линера", heads);
    }
}
