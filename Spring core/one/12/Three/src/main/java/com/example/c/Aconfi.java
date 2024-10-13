package com.example.c;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan(basePackages = "com.example.c")
public class Aconfi {

    @Bean
    public Zoo z1(){
        Zoo a=new Zoo();
        a.setName("san deigo zoo");
        return a;
    }

    @Bean
    public Zoo z2(){
        Zoo a=new Zoo();
        a.setName("MaharajBagh zoo");
        return a;
    }


}
