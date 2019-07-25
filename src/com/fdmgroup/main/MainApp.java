package com.fdmgroup.main;

import com.fdmgroup.dao.UserDao;
import com.fdmgroup.model.User;

public class MainApp {

	public static void main(String[] args) {
		UserDao userdao = new UserDao();
		
		User user = new User ("a", "1", "z@outlook.com");
		
		userdao.addUser(user);
		
		user = new User ("b", "2", "b@yahoo.com");
		
		userdao.addUser(user);
		
		user = new User ("c", "3", "b@gmail.com");
		
		userdao.addUser(user);
		
		

	}

}
