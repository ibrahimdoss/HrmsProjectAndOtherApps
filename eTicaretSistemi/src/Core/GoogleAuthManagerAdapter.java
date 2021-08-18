package Core;

import Entities.concretes.User;
import GoogleAuthManager.AuthService;
import GoogleAuthManager.GoogleAuthManager;

public class GoogleAuthManagerAdapter implements AuthService {
	private GoogleAuthManager googleAuthManager ;
	
	public GoogleAuthManagerAdapter(GoogleAuthManager googleAuthManager) {
		super();
		this.googleAuthManager = googleAuthManager;
	}
	
	

	@Override
	public void register(User user) {
		// TODO Auto-generated method stub
		googleAuthManager.register(user);
	}

	@Override
	public void login(User user) {
		// TODO Auto-generated method stub
		googleAuthManager.register(user);
	}
	
}
