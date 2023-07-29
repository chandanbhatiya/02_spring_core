package com.bhatiya.javaconfigure;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class DemoMain {

	public static void main(String[] args) {
		
		ApplicationContext context=new AnnotationConfigApplicationContext(JavaConfi.class);

	Student st=	context.getBean("getStudent",Student.class);
	
	System.out.println(st);
	st.study();
	
	
	}

}
