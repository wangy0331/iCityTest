package dao;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import service.UserServiceImpl;

import bean.User;

public class UserDao implements UserServiceImpl{

	//@SuppressWarnings("unchecked")
	public boolean getListUser(String username, String password){
		String userList = null;
	//List<User> userList = getHibernateTemplate().find("from USER where USERNAME = '"+username+"' and PASSWORD = '"+password+"'");
	System.out.println("isNull" + userList);
		if(userList == null){
			return true;
		}else{
			return false;
		}
	}
}
