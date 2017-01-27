package com.lyj.dubbo.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.lyj.dubbo.bean.User;
import com.lyj.dubbo.service.UserService;

public class UserServiceImpl implements UserService {
		/**
		 * 模拟数据库查询
		 */
		public List<User> queryAll() {
			List<User> list = new ArrayList<User>();
			for (int i = 0; i< 10; i++) {
				User user = new User();
				user.setId(Long.valueOf(i + 1));
				user.setUsername("username_" + i);
				user.setPassword("000000");
				user.setAge(10 + i);
				user.setGender(i%2);
				list.add(user);
			}
			return list;
		}
	}

