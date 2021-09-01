package dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import dataAccess.abstracts.UserDao;
import entities.concretes.User;

public class JpaUserDao implements UserDao {
	
	List<User> users;
	
	public JpaUserDao() {
		super();
		this.users = new ArrayList<User>();
	}

	@Override
	public List<User> getAll() {
		return this.users;
	}

	@Override
	public void add(User entity) {
		this.users.add(entity);
	}

	@Override
	public void update(User entity) {
		int index = this.users.indexOf(entity);

        User user = this.users.get(index);
        
        user.seteMail(entity.geteMail());
        user.setFirstName(entity.getFirstName());
        user.setImagePath(entity.getImagePath());
        user.setLastName(entity.getLastName());
        user.setPassword(entity.getPassword());
        user.setUserId(entity.getUserId());		
	}

	@Override
	public void delete(User entity) {
		this.users.remove(entity);
	}

}
