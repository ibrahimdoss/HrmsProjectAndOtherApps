package etiyaGames;

import java.util.ArrayList;

public class GameCategory {
	private int id;
	private String gameCategoryName;
	private ArrayList<Game> games;
	
	public GameCategory() {
		this.games=new ArrayList<Game>();
	}

	public GameCategory(int id, String gameCategoryName) {
		this();
		this.id = id;
		this.gameCategoryName = gameCategoryName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getGameCategoryName() {
		return gameCategoryName;
	}

	public void setGameCategoryName(String gameCategoryName) {
		this.gameCategoryName = gameCategoryName;
	}

	public ArrayList<Game> getGames() {
		return games;
	}

	public void setGames(ArrayList<Game> games) {
		this.games = games;
	}

	@Override
	public String toString() {
		return "GameCategory [id=" + id + ", gameCategoryName=" + gameCategoryName + ", games=" + games + "]";
	}
	
	
}
