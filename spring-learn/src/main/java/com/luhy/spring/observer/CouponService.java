package com.luhy.spring.observer;

import org.springframework.context.event.EventListener;

/**
 * @author: hike97
 * @createTime: 2023/05/06 12:09
 * @description: 注解实现观察者
 */
public class CouponService {
	@EventListener
	public void addCoupon(UserRegisterEvent event) {
		System.out.println("[addCoupon][给用户({+"+event.getUserName()+"+}) 发放优惠劵]");

	}
}
