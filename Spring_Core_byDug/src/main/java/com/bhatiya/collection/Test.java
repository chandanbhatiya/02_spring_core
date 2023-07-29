package com.bhatiya.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext	context=new ClassPathXmlApplicationContext("com/bhatiya/collection/confi.xml");
		Emp	e=context.getBean("em1",Emp.class);

		System.out.println(e.getName());
		System.out.println(e.getPhones());
		System.out.println(e.getAddress());
		System.out.println(e.getCourses());
		

	}

}
