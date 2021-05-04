package Concrete;

import Abstract.GameService;
import Entity.Game;

public class GameManager implements GameService {

	@Override
	public void add(Game game) {
		System.out.println("Oyun ekleme iþlemi baþarýlý ----> " + game.getName());
		
	}

	@Override
	public void delete(Game game) {
		System.out.println("Oyun silme iþlemi baþarýlý ----> " + game.getName());
		
	}

	@Override
	public void update(Game game) {
		System.out.println("Oyun güncelleme iþlemi baþarýlý ----> " + game.getName());
		
	}

}
