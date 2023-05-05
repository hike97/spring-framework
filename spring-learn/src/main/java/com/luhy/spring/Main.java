package com.luhy.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author: hike97
 * @createTime: 2023/05/05 0:01
 * @description: TODO
 */
@ComponentScan("com.luhy.spring")
@Configuration
public class Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(Main.class);
		HelloServer bean = applicationContext.getBean(HelloServer.class);
		System.out.println(bean.sayHello());
	}
}
