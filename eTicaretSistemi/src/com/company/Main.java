package com.company;

import Business.abstracts.UserService;
import Business.concretes.UserManager;
import Core.GoogleAuthManagerAdapter;
import DataAccess.concretes.HibernateUserDao;
import Entities.concretes.User;
import GoogleAuthManager.GoogleAuthManager;

public class Main {

	public static void main(String[] args) {
		UserService userService = new UserManager(new HibernateUserDao(), new GoogleAuthManagerAdapter(new GoogleAuthManager()));
        User user=new User("ibrahim","döþ","ibrahim.dos@gmail.com","123456",true);
        User user1=new User("Ali","can","ali142@gmail.com","4567894",true);
        userService.register(user);
        userService.login(user);
        userService.confirm(user);
        userService.registerWithAccount(user1);
        userService.loginWithAccount(user1);
	}

}
