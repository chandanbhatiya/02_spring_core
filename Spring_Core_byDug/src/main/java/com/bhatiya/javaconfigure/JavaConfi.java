package com.bhatiya.javaconfigure;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.bhatiya.javaconfigure")
public class JavaConfi {
	
	@Bean
	public Samosa getSamosa()
	{
		Samosa sm=new Samosa();
		return sm;
	}
	
	@Bean
	public Student getStudent() {
		
		//creating a new student object
		Student student= new Student(getSamosa());
		
		return student;
	}

}
