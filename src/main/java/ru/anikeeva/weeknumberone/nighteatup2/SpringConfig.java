package ru.anikeeva.weeknumberone.nighteatup2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("ru.anikeeva.weeknumberone.nighteatup2")
public class SpringConfig {
    @Bean
    public MilkProducts sourCreamBean() {
        return MilkProducts.getMilkProduct("Сметана", 20);
    }

    @Bean
    public MilkProducts yogurtBean() {
        return MilkProducts.getMilkProduct("Йогурт", 2.9);
    }

    @Bean
    public VegetableProducts olivesBean() {
        return VegetableProducts.getVegetableProduct("Оливки", "Олива");
    }

    @Bean
    public VegetableProducts coconutBean() {
        return VegetableProducts.getVegetableProduct("Кокосы", "Пальма");
    }
}