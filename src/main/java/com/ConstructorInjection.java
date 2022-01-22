package com;

import com.bean.UserBean;
import com.dao.UserDao;

public class ConstructorInjection {

	public static void main(String[] args) {

		// userbean userdao

		UserDao ud = new UserDao();
		UserBean ub = new UserBean();

		MyApp myApp = new MyApp(ub, ud);
		
		//method calling 
	}
}

class MyApp {

	UserBean userBean;
	UserDao userDao;

	MyApp(UserBean ub, UserDao ud) {

	}

}
