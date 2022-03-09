package com.custom.finder.method.jpa;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.custom.finder.method.jpa.dao.UserDAO;
import com.custom.finder.method.jpa.entityes.UserEntity;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		UserDAO bean = context.getBean(UserDAO.class);

		// Data insert in database
		/*
		 * UserEntity user1 = new UserEntity(121l,"Muhammad Talib" , "Hapur" , 24.5 ,
		 * 992778303l ); UserEntity user2 = new UserEntity(122l,"Aleem Ahmad" ,
		 * "Ghaziabad" , 23 , 783644320l ); UserEntity user3 = new
		 * UserEntity(123l,"Muhammad Talib" , "Delhi" , 28 , 874321933l ); UserEntity
		 * user4 = new UserEntity(124l,"Atul Kevat" , "Rajasthan" , 25 , 996543711l );
		 * UserEntity user5 = new UserEntity(125l,"Keshav" , "Uttar Pradesh" , 25 ,
		 * 992773203l );
		 * 
		 * List<UserEntity> userList = new ArrayList<>(); userList.add(user1);
		 * userList.add(user2); userList.add(user3); userList.add(user4);
		 * userList.add(user5);
		 * 
		 * bean.saveAll(userList);
		 */

		// ############################# Custom finder method using jpa
		// #################################################

		/*
		 * 1 List<UserEntity> userAge = bean.findTop3ByUserAge(25); userAge.forEach(age
		 * -> { System.out.println(age); });
		 */

		/*
		 * 2 List<UserEntity> userName = bean.findByUserNameStartingWith("A");
		 * userName.forEach(name ->{ System.out.println(name); });
		 */

		/*
		 * 3 List<UserEntity> userPhone = bean.findByUserAddressEndingWith("r");
		 * userPhone.forEach(number ->{ System.out.println(number); });
		 */

		/*
		 * 4 List<UserEntity> userAge = bean.findByUserAgeBetween(24 , 28);
		 * userAge.forEach(age ->{ System.out.println(age); });
		 */

		/*
		 * 5 List<UserEntity> user =
		 * bean.findByUserNameAndUserIdOrUserPhone("Muhammad Talib", 121, 567873212);
		 * user.forEach(userInf ->{ System.out.println(userInf); });
		 */

		/*6
		List<UserEntity> userPhone = bean.findAllByOrderByUserNameDesc();
		userPhone.forEach(number -> {
			System.out.println(number);
		});
		*/
		
		List<String> userPhone = bean.UserName();
		userPhone.forEach(number -> {
			System.out.println(number);
		});
		context.close();
	}

}
