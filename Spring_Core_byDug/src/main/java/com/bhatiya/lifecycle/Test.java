package com.bhatiya.lifecycle;



import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		AbstractApplicationContext context	=new 	ClassPathXmlApplicationContext("com/bhatiya/lifecycle/confi.xml");
		context.registerShutdownHook();
//Samosa s=context.getBean("s1", Samosa.class);
//System.out.println(s);
//registering shutdown hook


//System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++");
//Pepsi p1=context.getBean("p1",Pepsi.class);
//System.out.println(p1);

Example e=context.getBean("e1", Example.class);
System.out.println(e);
	}

}
