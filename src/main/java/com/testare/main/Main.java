package com.testare.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.testare.config.ProjectConfig;
import com.testare.service.MainService;

public class Main {
	
	
	
	public static void main(String args[]) {
		try(AnnotationConfigApplicationContext context 
				= new AnnotationConfigApplicationContext(ProjectConfig.class)) {
			
			MainService service = context.getBean(MainService.class);
			
			String hello = service.helloService();
			System.out.println(hello);
		}
	}
}
