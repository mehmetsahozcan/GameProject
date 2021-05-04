package Entity;

import Abstract.PersonCheckService;

public class Person implements PersonCheckService{

	@Override
	public boolean check(Gamer gamer) {
		if(gamer.getFirstName() != null && gamer.getLastName() != null && gamer.getNationalIdentity() != null) {
			return true;
		}else {
			return false;
		}
	}
	

}
