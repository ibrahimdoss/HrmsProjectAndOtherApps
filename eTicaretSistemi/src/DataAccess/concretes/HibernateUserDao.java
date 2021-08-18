package DataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import DataAccess.abstracts.UserDao;
import Entities.concretes.User;

public class HibernateUserDao  implements UserDao{
	
	List<User> users=new ArrayList<User>();
	@Override
	public void register(User user) {
		// TODO Auto-generated method stub
		System.out.println("Kayýt Baþarýlý : " + user.getName());
		users.add(user);
	}

	@Override
	public void login(User user) {
		// TODO Auto-generated method stub
		System.out.println(user.getName() + "adlý kullanýcý giriþ yaptý.");
	}

	@Override
	public void confirm(User user) {
		// TODO Auto-generated method stub
		System.out.println(user.getEmail() + "Mail adresiniz onaylanmýþtýr.");
		user.setVerify(true);
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return this.users;
	}

}
