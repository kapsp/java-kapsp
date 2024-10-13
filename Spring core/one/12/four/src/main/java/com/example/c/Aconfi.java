package com.example.c;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan(basePackages = "com.example.c")
public class Aconfi {

    @Bean
    public Company c1(){
        Zoo a =new Zoo();
        a.setName("maharaj bagh");
        return a;
    }

    @Bean
    @Primary
    public Company c2(){
        Aquariam a =new Aquariam();
        a.setName("Nagpur Aquarium");
        return a;
    }
}
