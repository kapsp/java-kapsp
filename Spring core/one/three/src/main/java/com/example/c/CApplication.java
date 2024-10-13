package com.example.c;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class CApplication {

	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("beans.xml");
		player a=(player) context.getBean("player");
		System.out.println(a);
	}

}
