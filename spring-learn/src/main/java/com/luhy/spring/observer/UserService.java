package com.luhy.spring.observer;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Service;

/**
 * @author: hike97
 * @createTime: 2023/05/06 12:02
 * @description: TODO
 */
@Service
public class UserService implements ApplicationEventPublisherAware {
	private ApplicationEventPublisher applicationEventPublisher;
	@Override
	public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
		this.applicationEventPublisher = applicationEventPublisher;
	}

	public void register(String username) {
		// ... 执行注册逻辑
		System.out.println("[register] [执行用户({+"+username+"+}) 的注册逻辑]");
		// ... 发布
		applicationEventPublisher.publishEvent(new UserRegisterEvent(this, username));
	}
}
