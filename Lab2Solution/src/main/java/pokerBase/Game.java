package pokerBase;
//Bonnie McNellis
//Julianna Shevchenko
//Section 10, Lab 22

import java.util.ArrayList;
import java.util.UUID;

public class Game {
	
	private UUID GameID;
	private UUID TableID;
	private ArrayList<Player> GamePlayers = new ArrayList<Player>();
	
	public Game() {
		GameID = UUID.randomUUID();
	}
	
	public Game AddPlayerToGame(Table t, Player p) {
		GamePlayers.add(p);
		return this;
	}

	public UUID getGameID() {
		return GameID;
	}

	public void setGameID(UUID gameID) {
		GameID = gameID;
	}

	public UUID getTableID() {
		return TableID;
	}

	public void setTableID(UUID tableID) {
		TableID = tableID;
	}

	public ArrayList<Player> getGamePlayers() {
		return GamePlayers;
	}

	public void setGamePlayers(ArrayList<Player> gamePlayers) {
		GamePlayers = gamePlayers;
	}

}