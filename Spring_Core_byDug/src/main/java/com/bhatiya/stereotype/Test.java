package com.bhatiya.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Test {
	
	public static void main(String args[])
	{
	
	ApplicationContext context=new ClassPathXmlApplicationContext("com/bhatiya/stereotype/scofigure.xml");
	Student student=context.getBean("student",Student.class);
	System.out.println(student);
	System.out.println(student.getAddress());
	System.out.println(student.getAddress().getClass().getName());
	
	System.out.println(student.hashCode());
	
	Student st=context.getBean("student", Student.class);
	
	System.out.println(st.hashCode());
	
	}

}
