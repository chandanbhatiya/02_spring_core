package com.bhatiya.standalone.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
	
		ApplicationContext context=new ClassPathXmlApplicationContext("com/bhatiya/standalone/collection/alonefigure.xml");
		Person p=context.getBean("person1",Person.class);
		System.out.println(p);
		System.out.println(p.getFriends().getClass().getName());
		System.out.println("=++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println(p.getFeestructure());
		System.out.println(p.getFeestructure().getClass().getName());
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println(p.getProperties());
		System.out.println(p.getProperties().getClass().getName());

	}

}
