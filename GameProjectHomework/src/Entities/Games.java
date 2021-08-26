package Entities;

public class Games {
	
	private String gameName;
	private int price;
	private int discount;
	
	public Games(String gameName, int price, int discount) {
		super();
		this.gameName = gameName;
		this.price = price;
		this.discount = discount;
	}

	public String getGameName() {
		return gameName;
	}

	public void setGameName(String gameName) {
		this.gameName = gameName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getDiscount() {
		return discount;
	}

	public void setDiscount(int discount) {
		this.discount = discount;
	}
}
