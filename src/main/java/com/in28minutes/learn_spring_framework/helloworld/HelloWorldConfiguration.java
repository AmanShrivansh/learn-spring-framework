package com.in28minutes.learn_spring_framework.helloworld;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person(String name , int age , Address adsress) {};

record Address(String firstLine , String city) {};


@Configuration
public class HelloWorldConfiguration {
	@Bean
	public String name() {
		return "Ranga";
	}
	
	@Bean
	public int age() {
		return 25;
	}
	
	@Bean
	public Person person() {
		var person = new Person("Ravi", 20 , new Address("Main street", "Bombay"));
		return person;
	}
	
	@Bean
	public Person person2MethodCall() {
		var person = new Person(name(), age(), address2());
		return person;
	}
	
	@Bean
	public Person person3ParameterCall(String name , int age, Address address3) { 
		var person = new Person(name, age, address3);
		return person;
	}
	
	@Bean(name = "address3")
	public Address address3() {
		var address = new Address("Marathalli", "Bengaluru");
		return address;
	}
	
	@Bean(name = "address2")
	public Address address2() {
		var address = new Address("212B-Baker street", "London");
		return address;
	}
}
