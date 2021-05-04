package Concrete;

import Abstract.GamerServise;
import Entity.Gamer;

public class GamerManager implements GamerServise {

	@Override
	public void add(Gamer gamer) {
		System.out.println("Oyuncu baþarýyla eklendi -----> " + gamer.getFirstName() +" "+ gamer.getLastName());
		
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println("Oyuncu baþarýyla silindi -----> " + gamer.getFirstName() + " " + gamer.getLastName());
		
	}

	@Override
	public void update(Gamer gamer) {
		System.out.println("Oyuncu baþarýyla güncellendi -----> " + gamer.getFirstName() +" "+ gamer.getLastName());

		
	}

}
