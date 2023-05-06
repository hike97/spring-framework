package com.luhy.spring.observer;

import org.springframework.context.ApplicationListener;

/**
 * @author: hike97
 * @createTime: 2023/05/06 11:46
 * @description: TODO
 */
public class EmailService implements ApplicationListener<UserRegisterEvent> {
	@Override
	public void onApplicationEvent(UserRegisterEvent event) {
		System.out.println("[onApplicationEvent][给用户({+"+event.getUserName()+"+}) 发送邮件]");
	}
}
