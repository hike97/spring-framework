package com.luhy.spring.observer;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author: hike97
 * @createTime: 2023/05/06 12:06
 * @description: TODO
 */

public class Test {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
		// 注册 UserService、EmailService、CouponService 到容器中
		applicationContext.register(UserService.class, EmailService.class, CouponService.class);
		// 刷新容器
		applicationContext.refresh();
		UserService bean = applicationContext.getBean(UserService.class);
		bean.register("hello Observer");
		applicationContext.close();
	}
}
