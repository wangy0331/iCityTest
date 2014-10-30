package action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;

import service.UserServiceImpl;

import bean.User;

import com.opensymphony.xwork2.ActionSupport;

import dao.UserDao;





public class LoginAction extends ActionSupport{
	//@Autowired
	private UserServiceImpl userServiceImpl;
	
	
	
	//private UserDao userDao;
	

	public UserServiceImpl getUserServiceImpl() {
		return userServiceImpl;
	}

	public void setUserServiceImpl(UserServiceImpl userServiceImpl) {
		this.userServiceImpl = userServiceImpl;
	}

	private User user;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
//	@Override
//	public String execute()throws Exception{
//		System.out.println("---");
//		if(userServcieImpl.getListUser(user.getUsername(), user.getPassword())){
//			return "success";
//		}else{
//			return "input";
//		}
//	}
	
	public String login() throws Exception{
		System.out.println("username:" + user.getUsername());
		System.out.println("password:" + user.getPassword());
		
		try{
		//boolean isNull = this.userServiceImpl.getListUser(user.getUsername(),user.getPassword());
			String username = user.getUsername();
			String password = user.getPassword();
		//	List<User> user = this.userServcieImpl.getListUser(username, password);
		//	System.out.println("---:" + user);
			
			if(userServiceImpl.getListUser(username, password)){
				return "success";
			}else{
				return "input";
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		return "input";
		
	}
}
