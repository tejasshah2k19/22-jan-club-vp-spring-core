package com;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bean.UserBean;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		System.out.println(context);

		UserBean user1 = (UserBean) context.getBean("userBean");
		UserBean user2 = (UserBean) context.getBean("userBean");
		UserBean user3 = context.getBean("userBean", UserBean.class);

		System.out.println(user1);
		System.out.println(user2);
		System.out.println(user3);
	}
}
