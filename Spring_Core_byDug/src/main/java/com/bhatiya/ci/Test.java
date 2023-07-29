package com.bhatiya.ci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Test {
	
	public static void main(String ags[]) {
		
		ApplicationContext	context=new ClassPathXmlApplicationContext("com/bhatiya/ci/ciconfi.xml");
		Person	p=context.getBean("person",Person.class);
		
		System.out.println(p);
		
		Addition	ad=context.getBean("add",Addition.class);
		System.out.println(ad);
		ad.doSum();
	}

}
