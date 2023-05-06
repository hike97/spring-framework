package com.luhy.spring.observer;

import org.springframework.context.ApplicationEvent;

/**
 * @author: hike97
 * @createTime: 2023/05/06 11:26
 * @description: 自定义事件
 */
public class UserRegisterEvent extends ApplicationEvent {

	private String userName;

	public UserRegisterEvent(Object source) {
		super(source);
	}
	public UserRegisterEvent(Object source,String userName) {
		super(source);
		this.userName = userName;
	}

	public String getUserName() {
		return userName;
	}
}
