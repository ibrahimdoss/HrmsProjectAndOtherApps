package Services;

public class OfferService implements OfferServiceManager{

	@Override
	public void add() {
		System.out.println(" Kampanya eklendi. ");
		
	}

	@Override
	public void update() {
		System.out.println(" Kampanya güncellendi");
		
	}

	@Override
	public void remove() {
		System.out.println(" Kampanya sistemden silindi.");
		
	}

}
