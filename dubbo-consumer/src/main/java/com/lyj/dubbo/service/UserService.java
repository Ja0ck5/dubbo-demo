package com.lyj.dubbo.service;

import java.util.List;

import com.lyj.dubbo.bean.User;

public interface UserService {

	/**
	 * 查询所有用户
	 * @return
	 */
	public List<User> queryAll();
}
