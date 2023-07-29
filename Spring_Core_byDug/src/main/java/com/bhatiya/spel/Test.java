package com.bhatiya.spel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext co=new ClassPathXmlApplicationContext("com/bhatiya/spel/scofigure.xml");
	Demo d=	co.getBean("demo", Demo.class);
System.out.println(d);

SpelExpressionParser temp=new SpelExpressionParser();
Expression ex=temp.parseExpression("22+44");
System.out.println(ex.getValue());
	}

}
 