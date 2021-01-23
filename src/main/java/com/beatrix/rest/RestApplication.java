package com.beatrix.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class RestApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(RestApplication.class, args);

		for(String bean : context.getBeanDefinitionNames()){
			System.out.println(bean);
		}
	}

}
