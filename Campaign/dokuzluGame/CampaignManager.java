package dokuzluGame;

public class CampaignManager implements CampaignAdd,CampaignUpdate,CampaignDelete{

	@Override
	public void update(Campaign campaign) {
		System.out.println("kampanya gŁncellendi :" + campaign.getCampaignName());
		
	}

	@Override
	public void add(Campaign campaign) {
		System.out.println("kampanya eklendi : " + campaign.getCampaignName());
		
	}
	
	@Override
	public void delete(Campaign campaign) {
		System.out.println("kampanya silindi : " + campaign.getCampaignName());
		
	}

	
}
