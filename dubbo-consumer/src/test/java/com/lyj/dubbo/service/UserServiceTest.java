package com.lyj.dubbo.service;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lyj.dubbo.bean.User;

public class UserServiceTest {
	
	private UserService userService;

	@Before
	public void setUp() throws Exception {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:dubbo/dubbo-*.xml");
		this.userService = applicationContext.getBean(UserService.class);
	}

	@Test
	public void testQueryAll() {
		for (int i = 0; i < 100; i++) {
			List<User> list = this.userService.queryAll();
			for (User user : list) {
				System.out.println(user);
			}
			
			try {
				//每次调用接口后暂停一会
				Thread.sleep(i * 10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
