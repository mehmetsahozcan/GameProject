import Concrete.CampaignManager;
import Concrete.GameManager;
import Concrete.GamerManager;
import Concrete.SaleManager;
import Entity.Campaign;
import Entity.Game;
import Entity.Gamer;
import Entity.Sales;

public class Main {

	public static void main(String[] args) {
		
		GameManager gameManager = new GameManager();
		
		Game game = new Game(1,"Counter Strike",150);
		gameManager.add(game);
		gameManager.delete(game);
		gameManager.update(game);
		
		System.out.println("*************************************");
		
		GamerManager gamerManager = new GamerManager();
		
		Gamer gamer = new Gamer(2,"Mehmet","Özcan","1222245565");
		
		gamerManager.add(gamer);
		gamerManager.delete(gamer);
		gamerManager.update(gamer);
		
		System.out.println("*************************************");
		
		CampaignManager campaignManager = new CampaignManager();
		Campaign campaign = new Campaign(6,"Ramazan Kampayasý", 75);
		
		campaignManager.add(campaign);
		campaignManager.delete(campaign);
		campaignManager.update(campaign);
		
		System.out.println("*************************************");
		
		SaleManager saleManager = new SaleManager();
		Sales sales = new Sales(1,"12356453443");
		saleManager.add(sales);
	}
	
		

}
