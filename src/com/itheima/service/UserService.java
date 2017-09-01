package com.itheima.service;

import com.itheima.domain.User;

public interface UserService {

	User checkCode(String user_code);

	void save(User user);

	User login(User user);

}
