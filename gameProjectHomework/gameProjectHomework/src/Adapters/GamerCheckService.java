package Adapters;

import Entities.Gamer;

public class GamerCheckService implements MernisCheckService{

	@Override
	public boolean checkGamer(Gamer gamer) {
		if(gamer.getFirstName().equals("Eren")) {
			
			return true;
		}else if (gamer.getNationalId().length()==11){
			return true;
		}
		
		else {
			
			return false;
		}
	}

}
