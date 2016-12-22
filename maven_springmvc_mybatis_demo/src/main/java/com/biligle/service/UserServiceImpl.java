package com.biligle.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.biligle.dao.UserDao;
import com.biligle.model.User;
/**
 * Service层的实现
 * @author Biligle
 *
 */
@Service
public class UserServiceImpl implements UserService{
	/**
	 * 注入UserDao
	 */
	@Autowired    
    private UserDao userDao;
	/**
	 * 操作UserDao做数据库的操作
	 */
    public User selectUserById(Integer userId) {    
        return userDao.selectUserById(userId);    
    }
    /**
	 * 操作UserDao做数据库的操作
	 */
	public User selectUserByName(String name) {
		return userDao.selectUserByName(name);
	}
	/**
	 * 通过名字模糊查询
	 * @param str
	 * @return
	 */
	public List<User> selectUserByStr(String str){
		return userDao.selectUserByStr(str);
	}
}
