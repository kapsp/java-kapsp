package com.example.c;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class CApplication {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		city a=(city) context.getBean("cz");
		System.out.println(a);

		ApplicationContext context1=new ClassPathXmlApplicationContext("beans.xml");
		Zoo a1=(Zoo) context.getBean("z1");
		System.out.println(a1);
	}

}
