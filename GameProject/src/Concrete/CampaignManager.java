package Concrete;

import Abstract.CampaignService;
import Entity.Campaign;

public class CampaignManager implements CampaignService {

	@Override
	public void add(Campaign campaign) {
		System.out.println(campaign.getName() +" "+ "ba�ar�yla eklendi." );
		
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println(campaign.getName() +" "+ "ba�ar�yla silindi." );		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println(campaign.getName() +" "+ "ba�ar�yla g�ncellendi." );
		
	}

}
