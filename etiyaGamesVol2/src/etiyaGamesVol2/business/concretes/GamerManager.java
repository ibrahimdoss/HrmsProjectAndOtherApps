package etiyaGamesVol2.business.concretes;

import etiyaGamesVol2.Entities.Gamer;
import etiyaGamesVol2.business.abstracts.GamerService;
import etiyaGamesVol2.core.UserIdentityValidatorService;

public class GamerManager implements GamerService {

	
	UserIdentityValidatorService userIdentityValidatorService ;
	
	public GamerManager(UserIdentityValidatorService userIdentityValidatorService) {
		super();
		this.userIdentityValidatorService = userIdentityValidatorService;
	}

	@Override
	public void add(Gamer gamer) {
		if(this.userIdentityValidatorService.isValid(gamer)) {
			System.out.println("Eklendi");
		}else {
			System.out.println("Bilgiler Hatalý");
		}
	}

	@Override
	public void update(Gamer gamer) {
		System.out.println("güncellendi");

		
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println("silindi");

		
	}

}
