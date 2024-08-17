package com.in28minutes.learn_spring_framework.helloworld;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring {

	public static void main(String[] args) {
		//1:Launch a spring context
		try(var context = 
				new AnnotationConfigApplicationContext(HelloWorldConfiguration.class)){
			
			System.out.println(context.getBean("name"));
			//2:config the things we want spring to manage - @Configuration
			
			
			System.out.println(context.getBean("age"));
			
			System.out.println(context.getBean("person"));
			System.out.println(context.getBean("person2MethodCall"));
			System.out.println(context.getBean("person3ParameterCall"));
			
			System.out.println(context.getBean("address2"));
		}
		
		
		
		
		
		
	}

}
