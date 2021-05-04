package Concrete;

import Abstract.SalesService;
import Entity.Game;
import Entity.Gamer;
import Entity.Sales;

public class SaleManager implements SalesService{

	
	
	@Override
	public void add(Sales sale) {
		System.out.println("Satýþ Baþarýyla Eklendi -----> " +sale.getId());
	}

	@Override
	public void delete(Sales sale) {
		System.out.println("Satýþ Baþarýyla Silindi -----> " +sale.getId());
		
	}

	@Override
	public void update(Sales sale) {
		System.out.println("Satýþ Baþarýyla Güncellendi -----> " +sale.getId());

		
	}

}
