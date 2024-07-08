package ru.anikeeva.weeknumberone.tothebottom2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("ru.anikeeva.weeknumberone.tothebottom2")
public class SpringConfig {
    @Bean
    public Person person1(){
        return Person.createPerson("Sponge bob", 39);
    }

    @Bean
    public Person person2(){
        return Person.createPerson("Patrick", 39);
    }

    @Bean
    public Person person3(){
        return Person.createPerson("Squidward", 47);
    }
}