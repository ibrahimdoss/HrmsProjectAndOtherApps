package core;

import entities.concretes.User;

public interface UserIdentityValidatorService {
	boolean isValid(User user);
}
