package com.bhatiya.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bhatiya.collection.Emp;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext	context=new ClassPathXmlApplicationContext("com/bhatiya/ref/refconfi.xml");
		RefA	ra=context.getBean("aref",RefA.class);
		
		System.out.println(ra);
		System.out.println(ra.getX());
		System.out.println(ra.getB().getY());

	}

}
