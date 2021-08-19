package etiyaGames;

import java.util.ArrayList;

public class UserService {

	ArrayList<User> users = new ArrayList<User>();

	public void add(User user) {

		if (user.getAge() >= 15) {
			
			System.out.println(user.getFirstName() + " adlý kullanýcý sisteme kaydedildi");
			
			this.users.add(user);
			
		} else if (user.getAge() < 0) {
			System.out.println("Geçersiz kullanýcý yaþý");
			
		} else {
			System.out.println("15 yaþýndan küçükler sisteme kayýt olamaz");
		}
	}

	public ArrayList<User> getAll() {

		User user1 = new User();
		user1.setFirstName("Ýbrahim");
		user1.setLastName("dos");
		user1.setAge(23);

		this.users.add(user1);

		return this.users;
	}
	
	
	
	
	
	
	
}
