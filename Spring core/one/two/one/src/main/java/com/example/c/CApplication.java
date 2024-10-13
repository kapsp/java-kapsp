package com.example.c;

import org.apache.naming.factory.BeanFactory;
import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

@SpringBootApplication
public class CApplication {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext a=new ClassPathXmlApplicationContext("beans.xml");
		Zoo v=(Zoo) a.getBean("animals");
		System.out.println(v);

		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		footballer c=(footballer) context.getBean("foot");
		System.out.println(c);
	}

}
