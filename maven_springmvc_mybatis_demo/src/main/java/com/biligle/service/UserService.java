package com.biligle.service;

import java.util.List;

import com.biligle.model.User;

/**
 * Service接口层（给UserDao分配任务）
 * @author Biligle
 *
 */
public interface UserService {
	User selectUserById(Integer userId);
	User selectUserByName(String name);
	List<User> selectUserByStr(String str);
}
