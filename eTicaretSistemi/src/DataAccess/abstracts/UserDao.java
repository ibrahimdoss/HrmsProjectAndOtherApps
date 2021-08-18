package DataAccess.abstracts;


import java.util.List;

import Entities.concretes.User;

public interface UserDao {
	void register(User user);
	void login(User user);
	void  confirm(User user);
	
	
	List<User> getAll();
}
