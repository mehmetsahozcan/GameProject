package Concrete;

import Abstract.GameService;
import Entity.Game;

public class GameManager implements GameService {

	@Override
	public void add(Game game) {
		System.out.println("Oyun ekleme i�lemi ba�ar�l� ----> " + game.getName());
		
	}

	@Override
	public void delete(Game game) {
		System.out.println("Oyun silme i�lemi ba�ar�l� ----> " + game.getName());
		
	}

	@Override
	public void update(Game game) {
		System.out.println("Oyun g�ncelleme i�lemi ba�ar�l� ----> " + game.getName());
		
	}

}
