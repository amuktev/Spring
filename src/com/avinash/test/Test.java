package com.avinash.test;

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.avinash.bean.HelloBean;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"/com/avinash/resources/applicationContext.xml");
		String[] beanNames = context.getBeanDefinitionNames();
		for(String beanName: beanNames) {
			System.out.println(beanName);
		}
		HelloBean hello = (HelloBean) context.getBean("helloBean");
		System.out.println(hello.sayHello());
		System.out.println(hello.sayHello());
		
	}

}
