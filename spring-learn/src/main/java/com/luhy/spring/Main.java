package com.luhy.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author: hike97
 * @createTime: 2023/05/05 0:01
 * @description: TODO
 */
//@ComponentScan("com.luhy.spring")
//@Configuration
public class Main {
	public static void main(String[] args) {
		//AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(Main.class);
		//HelloServer bean = applicationContext.getBean(HelloServer.class);
		//System.out.println(bean.sayHello());

		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		Person person = ac.getBean("person", Person.class);
		System.out.println(person);
	}
}
