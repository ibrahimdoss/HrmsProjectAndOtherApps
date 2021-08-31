package core;

import entities.concretes.User;

public class MernisKpsServiceAdapter implements UserIdentityValidatorService {

	@Override
	public boolean isValid(User user) {
		MernisKpsService mernisKpsService = new MernisKpsService();
		
		return mernisKpsService.tcKimlikNoDogrulama(Long.parseLong(user.getNationalIdentityNumber()), user.getFirstName(), user.getLastName(), user.getYearOfBirth());
	}

}
