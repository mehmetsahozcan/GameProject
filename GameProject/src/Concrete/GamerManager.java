package Concrete;

import Abstract.GamerServise;
import Entity.Gamer;

public class GamerManager implements GamerServise {

	@Override
	public void add(Gamer gamer) {
		System.out.println("Oyuncu ba�ar�yla eklendi -----> " + gamer.getFirstName() +" "+ gamer.getLastName());
		
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println("Oyuncu ba�ar�yla silindi -----> " + gamer.getFirstName() + " " + gamer.getLastName());
		
	}

	@Override
	public void update(Gamer gamer) {
		System.out.println("Oyuncu ba�ar�yla g�ncellendi -----> " + gamer.getFirstName() +" "+ gamer.getLastName());

		
	}

}
