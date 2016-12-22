package com.biligle.controller;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.biligle.model.User;
import com.biligle.service.UserService;
import com.mysql.jdbc.StringUtils;
/**
 * 控制层（目的是返给访问者数据）
 * @author Biligle
 *
 */
@Controller
public class UserController {
	/**
	 * 注入resource配置
	 */
	@Resource    
    private UserService userService;    
	/**
	 * 访问入口，接受外界访问
	 * @param name 接口参数
	 * @param password 接口参数
	 * @return 返回map，spring框架会解析成json格式
	 */
    @ResponseBody
    @RequestMapping(value="/showUserInfo",method=RequestMethod.POST)      
    public Map<String, Object>/*ModelAndView*/ login(
    		@RequestParam(value = "name", required = true) String name,
    		@RequestParam(value = "password", required = true) String password){
//        ModelAndView mav = new ModelAndView("index");     
//        User user = userService.selectUserById(2);    
//        mav.addObject("user", user); 
    	User user = null;
    	String message = "";
    	String result = "";
    	if(StringUtils.isNullOrEmpty(name) || StringUtils.isNullOrEmpty(password)){
    		result = "failed";
    		message = "用户名和密码不能为空";
    	}else{
    		user = userService.selectUserByName(name);
    		if(null == user){
    			result = "failed";
    			message = "用户不存在";
    		}else{
    			if(password.equals(user.getUserPassword())){
    				result = "success";
    				message = "祝贺Biligle登录成功";
    			}else{
    				result = "failed";
    				message = "密码有误";
    			}
    		}
    	}
    	Map<String, Object> map = new HashMap<>();
    	map.put("success", result);
    	map.put("message", message);
        return map;      
    }   
    
    @ResponseBody
    @RequestMapping(value="/search",method=RequestMethod.POST)
    public Map<String,Object> seasrch(
    		@RequestParam(value = "str", required = true)String str){
    	Map<String,Object> map = new HashMap<>();
    	if(!StringUtils.isNullOrEmpty(str)){
    		List<User> list = userService.selectUserByStr(str);
    		if(list.size() > 0){
    			map.put("result", "success");
    			map.put("list", list);
    		}else{
    			map.put("result", "failed");
    		}
    	}else{
    		map.put("result", "failed");
    	}
    	return map;
    }
}
