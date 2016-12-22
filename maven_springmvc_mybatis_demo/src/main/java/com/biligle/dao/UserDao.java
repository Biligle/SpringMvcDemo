package com.biligle.dao;

import java.util.List;

import com.biligle.model.User;
/**
 * 查询数据接口
 * @author Biligle
 *
 */
public interface UserDao {
	/**
	 * 根据ID查询数据库数据
	 * @param userId 参数名（一定写对，和user2Mapper.xml文件中的userId对应）
	 * @return
	 */
	public User selectUserById(Integer userId);
	/**
	 * 根据名字查询数据库
	 * @param name 参数名（一定写对，和user2Mapper.xml文件中的name对应）
	 * @return
	 */
	public User selectUserByName(String name);  
	/**
	 * 通过名字模糊查询
	 * @param s
	 * @return
	 */
	public List<User> selectUserByStr(String s);
}
