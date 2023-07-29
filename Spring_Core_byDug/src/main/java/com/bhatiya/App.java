package com.bhatiya;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String args[]) {
		
	ApplicationContext	context=new ClassPathXmlApplicationContext("configure.xml");
Student	s=context.getBean("st1",Student.class);

System.out.println(s);
	}
}
