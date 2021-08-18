package GoogleAuthManager;

import Entities.concretes.User;

public class GoogleAuthManager {
	public void register(User user) {
		System.out.println("Sayýn" + user.getName()+" " + user.getSurname()+"Giriþ yaptýnýz.");
	}
	
	public void login(User user) {
		System.out.println("Giriþ Baþarýsýz!!!");
	}
}
