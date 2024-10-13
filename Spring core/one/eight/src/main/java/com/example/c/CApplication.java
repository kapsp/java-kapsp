package com.example.c;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class CApplication {

	public static void main(String[] args) {
		ApplicationContext a= new ClassPathXmlApplicationContext("beans.xml");
		Balls z= (Balls) a.getBean("ball2");
		System.out.println(z);
	}

}
